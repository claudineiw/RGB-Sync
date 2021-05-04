using OPENHARDWARE;
using System;
using System.Diagnostics;
using System.IO;
using System.Net.Sockets;
using System.Threading;
using System.Windows.Forms;

namespace rgb
{
    static class Program
    {
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Process proc = new Process();
            proc.StartInfo.WorkingDirectory = "System";
            String value = Environment.GetEnvironmentVariable("Path", EnvironmentVariableTarget.Machine);
            if (value != "")
            {
                string[] item = value.Split(new char[] { Path.PathSeparator }, StringSplitOptions.RemoveEmptyEntries);
                for (int i = 0; i < item.Length; i++)
                {
                    string teste = item[i];
                    if (teste.Contains("Java"))
                    {
                        if (teste.Contains("bin"))
                        {

                            String filename = Directory.GetCurrentDirectory() + "\\rgb.jar";
                            proc.StartInfo.FileName = teste + "\\java.exe";
                            proc.StartInfo.Arguments = "-jar " + filename + " %1";
                            proc.StartInfo.WindowStyle = ProcessWindowStyle.Hidden;
                            proc.StartInfo.ErrorDialog = true;
                            proc.Start();
                        }

                    }

                }
            }
            
            openHardwareMonitor a = new openHardwareMonitor();
            Thread ctThread = new Thread(a.doChat);
            ctThread.Start();            
            proc.WaitForExit();
        }
    }   

}
