package Temperatura;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public final class RGBexeCon implements Runnable {

    private static List<hardware> listaHardware;
    private final TypeToken tt;
    private final Gson gson;
    public boolean allDone = false;
    private final JLabel tempCPU;
    private final JLabel tempGPU;

    public RGBexeCon(JLabel tempCPU, JLabel tempGPU) {
        this.tempCPU = tempCPU;
        this.tempGPU = tempGPU;
        this.gson = new Gson();
        this.tt = new TypeToken<List<hardware>>() {
        };
    }

    private void exec() {
        try {
            InputStream is = new Socket("127.0.0.1", 28350).getInputStream();
            while (!allDone) {
                Thread.sleep(500);
                byte[] lenBytes = new byte[4];
                is.read(lenBytes, 0, 4); //ler quantidade de dados
                int len = (((lenBytes[3] & 0xff) << 24) | ((lenBytes[2] & 0xff) << 16)
                        | ((lenBytes[1] & 0xff) << 8) | (lenBytes[0] & 0xff));
                byte[] receivedBytes = new byte[len];
                is.read(receivedBytes, 0, len); //ler dados
                String received = new String(receivedBytes, 0, len);
                if (received.toLowerCase().contains("cpu".toLowerCase()) || received.toLowerCase().contains("gpu".toLowerCase())) {
                    setListaHardware(gson.fromJson(received, tt.getType()));
                    getListaHardware().stream().map(hd -> {
                        if (hd.getTipo().contains("Gpu")) {
                            getTempGPU().setText(String.valueOf(hd.getTemp()));
                        }
                        return hd;
                    }).filter(hd -> (hd.getTipo().contains("CPU"))).map(hd -> {
                        getTempCPU().setText(String.valueOf(hd.getTemp()));
                        return hd;
                    }).forEachOrdered(hd -> {        
                    });
                } else {
                    getTempCPU().setText("10");
                    getTempGPU().setText("10");
                }
            }

        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RGBexeCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        exec();
    }

    /**
     * @return the listaHardware
     */
    public static List<hardware> getListaHardware() {
        return listaHardware;
    }

    /**
     * @param aListaHardware the listaHardware to set
     */
    public static void setListaHardware(List<hardware> aListaHardware) {
        listaHardware = aListaHardware;
    }

    /**
     * @return the tempCPU
     */
    public JLabel getTempCPU() {
        return tempCPU;
    }

    /**
     * @param tempCPU the tempCPU to set
     */
    /**
     * @return the tempGPU
     */
    public JLabel getTempGPU() {
        return tempGPU;
    }

    /**
     * @param tempGPU the tempGPU to set
     */
}
