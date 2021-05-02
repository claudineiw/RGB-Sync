package powerShell;

import com.profesorfalken.jpowershell.PowerShell;
import com.profesorfalken.jpowershell.PowerShellResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class powerShell {

    PowerShell powerShell;
    java.net.URL script;
    String scriptParams;

    public powerShell(PowerShell powerShell, java.net.URL script, String scriptParams) {
        this.powerShell = powerShell;
        this.script = script;
        this.scriptParams = scriptParams;
    }

    public String executar() {
        BufferedReader srcReader = null;
        try {
            srcReader = new BufferedReader(new InputStreamReader(script.openStream()));
        } catch (IOException ex) {
            Logger.getLogger(powerShell.class.getName()).log(Level.SEVERE, null, ex);
        }
        PowerShellResponse response = null;
        if (scriptParams != null && !scriptParams.equals("")) {
            response = powerShell.executeScript(srcReader, scriptParams);
        } else {
            response = powerShell.executeScript(srcReader);
        }
        return response.getCommandOutput();
    }
}
