﻿using System;
using System.Net;
using System.Net.Sockets;
using System.Threading;
using OpenHardwareMonitor.Hardware;

namespace OPENHARDWARE
{
    class openHardwareMonitor
    {
        private Computer computador;
        
        public openHardwareMonitor()
        {
            computador = new Computer();
            computador.Open();
            computador.CPUEnabled = true;
            computador.RAMEnabled = false;
            computador.MainboardEnabled = false;
            computador.FanControllerEnabled = false;
            computador.GPUEnabled = true;
            computador.HDDEnabled = false;
        }



        public String getTemp()
        {           
           
            String formato = "[";
            foreach (IHardware HW in computador.Hardware)
            {
               
                HW.Update();            
                if (HW.HardwareType.Equals(HardwareType.CPU))
                {

                    formato += "\n{";
                    foreach (ISensor Sensor in HW.Sensors)
                    {
                        if (Sensor.SensorType.Equals(SensorType.Temperature))
                        {
                            if (Sensor.Name.Equals("CPU Package"))
                            {
                                formato += "\n\"Tipo\":\"" + HW.HardwareType.ToString() + "\",";
                                formato += "\n\"Nome\":\"" + HW.Name.ToString() + "\",";
                                formato += "\n\"Temp\":\"" + Sensor.Value.ToString() + "\"";

                            }
                        }
                    }
                    formato += "\n}";
                }
                if (HW.HardwareType.Equals(HardwareType.GpuAti))
                {
                    formato += "\n,";
                    formato += "\n{";
                    foreach (ISensor Sensor in HW.Sensors)
                    {
                        if (Sensor.SensorType.Equals(SensorType.Temperature))
                        {
                            formato += "\n\"Tipo\":\"" + HW.HardwareType.ToString() + "\",";
                            formato += "\n\"Nome\":\"" + HW.Name.ToString() + "\",";
                            formato += "\n\"Temp\":\"" + Sensor.Value.ToString() + "\"";
                        }
                    }
                    formato += "\n}";
                }

                if (HW.HardwareType.Equals(HardwareType.GpuNvidia))
                {
                    formato += "\n,";
                    formato += "\n{";
                    foreach (ISensor Sensor in HW.Sensors)
                    {                                            
                        if (Sensor.SensorType.Equals(SensorType.Temperature))
                        {                            
                            formato += "\n\"Tipo\":\"" + HW.HardwareType.ToString() + "\",";
                            formato += "\n\"Nome\":\"" + HW.Name.ToString() + "\",";
                            formato += "\n\"Temp\":\"" + Sensor.Value.ToString() + "\"";
                        }
                    }
                    formato += "\n}";
                }


            }
            formato += "\n]";            
            return formato;
        }



        public void doChat()
        {           

            IPEndPoint serverAddress = new IPEndPoint(IPAddress.Parse("127.0.0.1"), 8080);
            Socket clientSocket = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
           
            while (true)
            {
                string toSend = getTemp();
                try
                {
                    //INVIA DADOS
                    Thread.Sleep(500);
                    int toSendLen = System.Text.Encoding.ASCII.GetByteCount(toSend);
                    byte[] toSendBytes = System.Text.Encoding.ASCII.GetBytes(toSend);
                    byte[] toSendLenBytes = System.BitConverter.GetBytes(toSendLen);
                    clientSocket.Send(toSendLenBytes);
                    clientSocket.Send(toSendBytes);

                    //RECEBE DADOS
                    byte[] rcvLenBytes = new byte[4];
                    clientSocket.Receive(rcvLenBytes);
                    int rcvLen = System.BitConverter.ToInt32(rcvLenBytes, 0);
                    byte[] rcvBytes = new byte[rcvLen];
                    clientSocket.Receive(rcvBytes);
                    String rcv = System.Text.Encoding.ASCII.GetString(rcvBytes);    
                    
                    if (rcv.Equals("Stop"))
                    {
                        clientSocket.Close();
                        computador.Close();
                        return;
                    }

                }
                catch (Exception)
                {
                    try
                    {
                        clientSocket.Connect(serverAddress);
                    }
                    catch (Exception)
                    {
                        
                    }
                }
                


            }
           
        }

    }
}