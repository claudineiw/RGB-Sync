package efeitos;

import Asus.MotherBoard;
import Logitech.Teclado;
import ca.fiercest.aurasdk.AuraRGBLight;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class efeitoArcoIris implements Runnable{
    MotherBoard placaMae;
    AuraSDK AsusAura;    
    public boolean allDone = false;    
    ArrayList<int []> cores;
    AsusColor cor;    
    public  efeitoArcoIris(AuraSDK AsusAura,ArrayList<int []> cores){       
        this.AsusAura=AsusAura;
        this.cores=cores;
        this.placaMae = new MotherBoard(AsusAura.getDevices().get(0).getName(),"teste" ,0, AsusAura, AsusAura.getDevices().get(0));
    }    

    @Override
    public void run(){   
          int conta=0;
          int interacao=0;
          Teclado teclado = new Teclado("G-803", "100", Color.BLACK);
        while(!allDone){  
            conta=interacao;
                 if (allDone) {return;}   
                 for(int y=0;y<23;y++){                           
                 for(int [] sequencia : teclado.getTeclas()){  
                     if (allDone) {return;}   
                     try {
                         teclado.setCor(new Color(cores.get(conta)[0],cores.get(conta)[1],cores.get(conta)[2]));
                         teclado.colorirPorTecla(sequencia[y]);
                     } catch (Exception ex) {                       
                     }
                 }
                 if(conta>=cores.size()-1){
                     conta=0;
                 }else{
                     conta++;
                 }
                 }          
            conta=interacao;
             
             try{    
                 List<AuraRGBLight> luzes=AsusAura.getAllLights();                
                 for(int i=0;i<luzes.size();i+=15){    
                        if (allDone) {                      
                            break;
                       }                   
                        
                        try{
                            cor = new AsusColor(cores.get(conta)[0],cores.get(conta)[1],cores.get(conta)[2]);
                            if (allDone) {return;}   
                            for(int y=i;y<i+10;y++){                               
                               luzes.get(y).setColor(cor); 
                            }                               
                        }catch(Exception ex){}   
                        
                        
                        
                        if(conta>=cores.size()-1){
                     conta=0;
                 }else{
                     conta++;
                 }
                  }
            
             }catch(Exception ex){
                 
             }   
             
             
             if(interacao>=cores.size()-1){
                     interacao=0;
                 }else{
                     interacao++;
                 }
                  
             
             }
    }
}
