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
          
        while(!allDone){   
                 int cont=0;
                 if (allDone) {return;}   
                 for(int y=0;y<23;y++){
                 int [] corSelecionada = cores.get(cont);
                 cont++;
                 if(cont>=cores.size()){
                     cont=0;
                 }
                 logitechConversao.setRGB(corSelecionada[0], corSelecionada[1], corSelecionada[2]);
                 for(int [] sequencia : logitechConversao.getBotoes()){  
                     if (allDone) {return;}   
                     try {
                         logitechConversao.porTecla(sequencia[y]);
                     } catch (Exception ex) {                       
                     }
                 }
                 }
                  
            /* List<AuraRGBLight> luzes=AsusAura.getAllLights();
             try{    
                 for(int i=0;i<luzes.size();i+=10){    
                        if (allDone) {                      
                            break;
                       }
                   for(int [] corSelecionada: cores){
                        cor = new AsusColor(corSelecionada[0], corSelecionada[1], corSelecionada[2]);
                        try{
                            if (allDone) {return;}   
                            luzes.get(i).setColor(cor);   
                            luzes.get(i+1).setColor(cor);  
                            luzes.get(i+2).setColor(cor);  
                            luzes.get(i+3).setColor(cor);  
                            luzes.get(i+4).setColor(cor);   
                        }catch(Exception ex){}      
                  }
            }
             }catch(Exception ex){
                 
             }   */              
             }
    }
}
