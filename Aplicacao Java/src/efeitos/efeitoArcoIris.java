package efeitos;

import ca.fiercest.aurasdk.AuraRGBLight;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import java.util.ArrayList;
import java.util.List;
import logitechMetodos.logitechMetodosAuxiliares;

public class efeitoArcoIris implements Runnable{
    AuraSDK AsusAura;    
    public boolean allDone = false;    
    logitechMetodosAuxiliares logitechConversao;
    ArrayList<int []> cores;
    AsusColor cor;    
    public  efeitoArcoIris(AuraSDK AsusAura,ArrayList<int []> cores){       
        this.AsusAura=AsusAura;
        this.logitechConversao = new logitechMetodosAuxiliares();
        this.cores=cores;
    }
    
    public  efeitoArcoIris(){ 
        this.logitechConversao = new logitechMetodosAuxiliares();
    }
    
    @Override
    public void run(){   
          int conta=0;
          int interacao=0;
        while(!allDone){  
            conta=interacao;
                 if (allDone) {return;}   
                 for(int y=0;y<23;y++){                   
                 logitechConversao.setRGB(cores.get(conta)[0],cores.get(conta)[1],cores.get(conta)[2]);           
                 for(int [] sequencia : logitechConversao.getBotoes()){  
                     if (allDone) {return;}   
                     try {
                         logitechConversao.porTecla(sequencia[y]);
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
