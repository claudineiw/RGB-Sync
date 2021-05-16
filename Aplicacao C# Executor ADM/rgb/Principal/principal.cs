using openHardware;
using System;
using System.Diagnostics;
using System.IO;
using System.Threading;
using System.Reflection;
using System.Security.Principal;
using System.Windows.Forms;

namespace rgb
{
    static class principal
    {
        [STAThread]
        static void Main()                
        {
                    iniciarAplicacao();
                           
        }

        
        private static void iniciarAplicacao()
        {

        Application.EnableVisualStyles();
        Application.SetCompatibleTextRenderingDefault(false);
        Process proc = new Process();
        proc.StartInfo.WorkingDirectory = "System";
        AdminRelauncher();

            if (IsRunAsAdmin())
            {
                String value = Environment.GetEnvironmentVariable("Path", EnvironmentVariableTarget.Machine);
                int entrou = 0;
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
                                entrou = 1;
                                String filename = "\""+Directory.GetCurrentDirectory() + "\\Jar\\rgb.jar\"";
                                Console.WriteLine(filename);
                                proc.StartInfo.FileName = teste + "\\java.exe";       
                                proc.StartInfo.Arguments = "-jar " + filename + " %1";
                                proc.StartInfo.WindowStyle = ProcessWindowStyle.Hidden;
                                proc.StartInfo.ErrorDialog = true;
                                proc.Start();
                                break;
                            }
                        }



                    }
                }
                if (entrou == 0)
                {
                    string message = "Configurar variavel do sistema JAVA_HOME e path %JAVA_HOME%\\bin";
                    string caption = "Error";
                    MessageBoxButtons buttons = MessageBoxButtons.OK;
                    DialogResult result;

                    // Displays the MessageBox.
                    result = MessageBox.Show(message, caption, buttons);
                    if (result == System.Windows.Forms.DialogResult.OK)
                    {
                        // Closes the parent form.
                        Environment.Exit(0);
                    }
                }
                IniciarServidor();
                proc.WaitForExit();
            }
        }

        
        private static void IniciarServidor()
        {
            openHardwareMonitor a = new openHardwareMonitor();
            Thread ctThread = new Thread(a.doChat);
            ctThread.Start();
        }
        private static void AdminRelauncher()
        {
            if (!IsRunAsAdmin())
            {
                ProcessStartInfo proc = new ProcessStartInfo();
                proc.UseShellExecute = true;
                proc.WorkingDirectory = Environment.CurrentDirectory;
                proc.FileName = Assembly.GetEntryAssembly().CodeBase;

                proc.Verb = "runas";

                try
                {
                    Process.Start(proc);
                    Application.Exit();
                }
                catch (Exception ex)
                {
                    Console.WriteLine("This program must be run as an administrator! \n\n" + ex.ToString());
                }
            }
        }

        private static bool IsRunAsAdmin()
        {
            try
            {
                WindowsIdentity id = WindowsIdentity.GetCurrent();
                WindowsPrincipal principal = new WindowsPrincipal(id);
                return principal.IsInRole(WindowsBuiltInRole.Administrator);
            }
            catch (Exception)
            {
                return false;
            }
        }


    }   

}
