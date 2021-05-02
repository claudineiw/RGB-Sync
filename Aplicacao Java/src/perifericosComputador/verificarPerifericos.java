package perifericosComputador;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.profesorfalken.jpowershell.PowerShell;
import java.util.List;
import powerShell.powerShell;

public final class verificarPerifericos {

    private static List<listaPerifericos> listaPerifericos;
    private TypeToken tt;
    private Gson gson;

    public verificarPerifericos() {

        this.gson = new Gson();
        this.tt = new TypeToken<List<listaPerifericos>>() {
        };
        testePerifericos();
    }

    private void testePerifericos() {
        powerShell power = new powerShell(PowerShell.openSession(), getClass().getResource("scriptPerifericos.ps1"), "");
        listaPerifericos = gson.fromJson(power.executar().replace("\\", "\\\\"), tt.getType());

    }

    private List<listaPerifericos> getPerifericos() {
        return listaPerifericos;
    }

    public boolean testarPeriferico(String id) {
        for (listaPerifericos periferico : listaPerifericos) {
            if (periferico.toString().contains(id)) {
                return true;
            }
        }
        return false;
    }
}
