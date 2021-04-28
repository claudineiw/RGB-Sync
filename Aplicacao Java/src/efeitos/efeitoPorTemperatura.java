/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efeitos;

import Logitech.Logitech;
import ca.fiercest.aurasdk.AsusColor;
import ca.fiercest.aurasdk.AuraSDK;
import javax.swing.JLabel;

/**
 *
 * @author Claud
 */
public class efeitoPorTemperatura implements Runnable{
    AuraSDK AsusAura;
    public boolean allDone = false;    
    JLabel temp1;
    JLabel temp2;
    JLabel temp3;
    JLabel temp4;
    JLabel temperatura;
    int vtemp1;
    int vtemp2;
    int vtemp3;
    int vtemp4;
    public  efeitoPorTemperatura(AuraSDK AsusAura,JLabel temp1,JLabel temp2,JLabel temp3 ,JLabel temp4,JLabel temperatura,int vtemp1,int vtemp2,int vtemp3,int vtemp4){  
        this.temp1=temp1;
        this.temp2=temp2;
        this.temp3=temp3;
        this.temp4=temp4;
        this.vtemp1=vtemp1;
        this.vtemp2=vtemp2;
        this.vtemp3=vtemp3;
        this.vtemp4=vtemp4;
        this.temperatura=temperatura;
        this.AsusAura=AsusAura;
    }

    @Override
    public void run() {
        Logitech logitech = new Logitech();
        while(!allDone){
            int temperaturaLocal=Integer.valueOf(temperatura.getText());
            if(temperaturaLocal< vtemp1){
                java.awt.Color nova =temp1.getForeground();
                AsusColor cor = new AsusColor(nova.getRed(), nova.getGreen(), nova.getBlue());         
                AsusAura.setAllColors(cor);  
                logitech.setCor(nova);
                logitech.colorirTudo();
            }else if(temperaturaLocal >= vtemp1 && temperaturaLocal<vtemp2){
                java.awt.Color nova =temp1.getForeground();
                AsusColor cor = new AsusColor(nova.getRed(), nova.getGreen(), nova.getBlue());         
                AsusAura.setAllColors(cor);  
                logitech.setCor(nova);
                logitech.colorirTudo();
            }else if(temperaturaLocal >=vtemp2 && temperaturaLocal<vtemp3){
                java.awt.Color nova =temp2.getForeground();
                AsusColor cor = new AsusColor(nova.getRed(), nova.getGreen(), nova.getBlue());         
                AsusAura.setAllColors(cor);  
                logitech.setCor(nova);
                logitech.colorirTudo();
            }else if (temperaturaLocal >=vtemp3 && temperaturaLocal<vtemp4) {
                java.awt.Color nova =temp3.getForeground();
                AsusColor cor = new AsusColor(nova.getRed(), nova.getGreen(), nova.getBlue());         
                AsusAura.setAllColors(cor);  
                logitech.setCor(nova);
                logitech.colorirTudo();
            }else{
                java.awt.Color nova =temp4.getForeground();
                AsusColor cor = new AsusColor(nova.getRed(), nova.getGreen(), nova.getBlue());         
                AsusAura.setAllColors(cor);  
                logitech.setCor(nova);
                logitech.colorirTudo();
            }
        }
    }
}
