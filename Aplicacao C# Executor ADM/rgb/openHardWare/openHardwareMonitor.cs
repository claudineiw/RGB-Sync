using System;
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
            TcpListener server = new TcpListener(IPAddress.Any, 28350);
            server.Start();
            while (true)
            {
                
                TcpClient client = server.AcceptTcpClient();
                NetworkStream ns = client.GetStream();
                

                while (client.Connected)
                {
                    Thread.Sleep(500);
                    string toSend = getTemp();    
                    int toSendLen = System.Text.Encoding.ASCII.GetByteCount(toSend);
                    byte[] toSendBytes = System.Text.Encoding.ASCII.GetBytes(toSend);
                    byte[] toSendLenBytes = System.BitConverter.GetBytes(toSendLen);
                    try
                    {
                        ns.Write(toSendLenBytes, 0, toSendLenBytes.Length);
                        ns.Write(toSendBytes, 0, toSendBytes.Length);
                    }
                    catch (Exception)
                    {

                    }


                }
                    client.Close();
                    computador.Close();
                    return;

            }
           
        }

    }
}
