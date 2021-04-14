package openHardware;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.profesorfalken.jpowershell.PowerShell;
import com.profesorfalken.jpowershell.PowerShellResponse;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class openHardwareMonitorCon implements Runnable{
    private TypeToken tt;
    public static List<hardware> listaHardware;
    Gson gson;
    public boolean allDone=false;
    public JLabel tempCPU ;
    public JLabel tempGPU ;
    public openHardwareMonitorCon(JLabel tempCPU,JLabel tempGPU) {    
        this.tempCPU=tempCPU;
        this.tempGPU=tempGPU;
        gson = new Gson();
         tt = new TypeToken<List<hardware>>() {};
        extrairDLL();
    }
       public String extrairDLL(){
           try {
			byte[] buffer = new byte[1024];
			int read = -1;
                        InputStream isJarDll ;                        
                        isJarDll = getClass().getResourceAsStream("OpenHardwareMonitorLib.dll");                                           
			File tempDll = new File("C:\\WINDOWS\\System32\\OpenHardwareMonitorLib.dll");
			FileOutputStream osJarDll = new FileOutputStream(tempDll);

			while ((read = isJarDll.read(buffer)) != -1) {
				osJarDll.write(buffer, 0, read);
			}
			osJarDll.close();
			isJarDll.close();

			return tempDll.getAbsolutePath();
		}
		catch (IOException e) {
                        JOptionPane.showMessageDialog(null,"Erro extrair dll");
			System.out.println("Erro ao extrair dll"); 
		}
        return null;
       }
       
    private void exec(){
    PowerShell powerShell = PowerShell.openSession();
    String script = "tempGpuECpu.ps1";
    String scriptParams = "-Parameter value";
    scriptParams=""; 
    while(!allDone){     
        try {
            Thread.sleep(500);
            BufferedReader srcReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(script)));
            PowerShellResponse response=null;
            if (scriptParams != null && !scriptParams.equals("")) {
                response = powerShell.executeScript(srcReader, scriptParams);
            } else {
                response =  powerShell.executeScript(srcReader);
            }
            listaHardware = gson.fromJson(response.getCommandOutput(), tt.getType());
            for(hardware hd:listaHardware){
                if(hd.getTipo().contains("Gpu")){
                    tempGPU.setText(String.valueOf(hd.getTemp()));
                    if(hd.getTemp()<50){
                        tempGPU.setForeground(Color.green);
                    }else{
                        if(hd.getTemp()>=50 && hd.getTemp()<70){
                            tempGPU.setForeground(Color.yellow);
                        }else{
                            if(hd.getTemp()>=70){
                                tempGPU.setForeground(Color.red);
                            }
                        }
                    }
                }
                if(hd.getTipo().contains("CPU")){
                    tempCPU.setText(String.valueOf(hd.getTemp()));
                    if(hd.getTemp()<50){
                        tempCPU.setForeground(Color.green);
                    }else{
                        if(hd.getTemp()>=50 && hd.getTemp()<70){
                            tempCPU.setForeground(Color.yellow);
                        }else{
                            if(hd.getTemp()>=70){
                                tempCPU.setForeground(Color.red);
                            }
                        }
                    }
                }
            }   } catch (InterruptedException ex) {
            Logger.getLogger(openHardwareMonitorCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    }
      
    @Override
    public void run() {   
        exec();
    }
 }
 
