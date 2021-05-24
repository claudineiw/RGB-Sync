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
        Process processo = new Process();
            processo.StartInfo.WorkingDirectory = "System";
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
                        string javaDir = item[i];
                        if (javaDir.Contains("Java"))
                        {
                            if (javaDir.Contains("bin"))
                            {
                                entrou = 1;
                                String filename = "\""+Directory.GetCurrentDirectory() + "\\Jar\\rgb.jar\"";
                                processo.StartInfo.FileName = javaDir + "\\java.exe";
                                processo.StartInfo.Arguments = " -Dsun.java2d.uiScale=2.5 -Dsun.java2d.dpiaware=false -XX:ErrorFile=./error.log -jar " + filename + " %1";
                                processo.StartInfo.WindowStyle = ProcessWindowStyle.Hidden;
                                processo.StartInfo.ErrorDialog = true;
                                processo.Start();
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
                    result = MessageBox.Show(message, caption, buttons);
                    if (result == System.Windows.Forms.DialogResult.OK)
                    {
                        Environment.Exit(0);
                    }
                }
                IniciarServidor();
                processo.WaitForExit();
            }
        }

        
        private static void IniciarServidor()
        {
            openHardwareMonitor openHard = new openHardwareMonitor();
            Thread thReadOpenHard = new Thread(openHard.servicoSocket);
            thReadOpenHard.Start();
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
                    Console.WriteLine("Esse programa so pode ser executado como administrador! \n\n" + ex.ToString());
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
