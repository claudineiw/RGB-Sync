using System;
using System.Net;
using System.Net.Sockets;
using System.Threading;
using OpenHardwareMonitor.Hardware;

namespace openHardware
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



        public String getTempHardware()
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



        public void servicoSocket()
        {           
            TcpListener server = new TcpListener(IPAddress.Any, 28350);
            server.Start();
            while (true)
            {
                
                TcpClient cliente = server.AcceptTcpClient();
                NetworkStream conecaoComCliente = cliente.GetStream();
                

                while (cliente.Connected)
                {
                    Thread.Sleep(500);
                    string enviar = getTempHardware();    
                    int tamanhoDoEnvio = System.Text.Encoding.ASCII.GetByteCount(enviar);
                    byte[] bytesParaEnviar = System.Text.Encoding.ASCII.GetBytes(enviar);
                    byte[] quantidadeDeBytesASeremEnviados = System.BitConverter.GetBytes(tamanhoDoEnvio);
                    try
                    {
                        conecaoComCliente.Write(quantidadeDeBytesASeremEnviados, 0, quantidadeDeBytesASeremEnviados.Length);
                        conecaoComCliente.Write(bytesParaEnviar, 0, bytesParaEnviar.Length);
                    }
                    catch (Exception)
                    {

                    }


                }
                    cliente.Close();
                    computador.Close();
                    return;

            }
           
        }

    }
}
