package perifericosComputador;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.profesorfalken.jpowershell.PowerShell;
import java.util.List;
import powerShell.powerShell;

public final class testePerifericos {
    public static List<drivers> listaDrivers;
    private TypeToken tt;
    Gson gson;
       public testePerifericos(){
           
           gson = new Gson();
            tt = new TypeToken<List<drivers>>() {};
            testePerifericos();
       }
       public void testePerifericos(){
           powerShell power= new powerShell(PowerShell.openSession(),getClass().getResource("scriptPerifericos.ps1"),"");
           listaDrivers = gson.fromJson(power.executar().replace("\\", "\\\\"), tt.getType());
         
       }
}
