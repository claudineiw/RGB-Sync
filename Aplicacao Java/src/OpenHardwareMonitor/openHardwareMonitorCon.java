package OpenHardwareMonitor;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import javax.swing.JLabel;

public final class openHardwareMonitorCon implements Runnable {

    private static List<hardware> listaHardware;
    private final TypeToken tt;
    private final Gson gson;
    public boolean allDone = false;
    private final JLabel tempCPU;
    private final JLabel tempGPU;

    public openHardwareMonitorCon(JLabel tempCPU, JLabel tempGPU) {
        this.tempCPU = tempCPU;
        this.tempGPU = tempGPU;
        this.gson = new Gson();
        this.tt = new TypeToken<List<hardware>>() {
        };
    }

    private void exec() {
        try {
            ServerSocket serverSocket = new ServerSocket(8080, 10);
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            while (!allDone) {
                try {
                    
                    //RECEBE DADOS DE TEMPERATURA
                    Thread.sleep(500);
                    byte[] lenBytes = new byte[4];
                    is.read(lenBytes, 0, 4);
                    int len = (((lenBytes[3] & 0xff) << 24) | ((lenBytes[2] & 0xff) << 16)
                            | ((lenBytes[1] & 0xff) << 8) | (lenBytes[0] & 0xff));
                    byte[] receivedBytes = new byte[len];
                    is.read(receivedBytes, 0, len);
                    String received = new String(receivedBytes, 0, len);
                    
                    //ENVIA DADOS PARA CONTINUAR THREAD
                    String toSend = "Continue";
                    byte[] toSendBytes = toSend.getBytes();
                    int toSendLen = toSendBytes.length;
                    byte[] toSendLenBytes = new byte[4];
                    toSendLenBytes[0] = (byte) (toSendLen & 0xff);
                    toSendLenBytes[1] = (byte) ((toSendLen >> 8) & 0xff);
                    toSendLenBytes[2] = (byte) ((toSendLen >> 16) & 0xff);
                    toSendLenBytes[3] = (byte) ((toSendLen >> 24) & 0xff);
                    os.write(toSendLenBytes);
                    os.write(toSendBytes);
                    
                    setListaHardware(gson.fromJson(received, tt.getType()));
                    getListaHardware().stream().map(hd -> {
                        if (hd.getTipo().contains("Gpu")) {
                            getTempGPU().setText(String.valueOf(hd.getTemp()));
                            if (hd.getTemp() < 50) {
                                getTempGPU().setForeground(Color.green);
                            } else {
                                if (hd.getTemp() >= 50 && hd.getTemp() < 70) {
                                    getTempGPU().setForeground(Color.yellow);
                                } else {
                                    if (hd.getTemp() >= 70) {
                                        getTempGPU().setForeground(Color.red);
                                    }
                                }
                            }
                        }
                        return hd;
                    }).filter(hd -> (hd.getTipo().contains("CPU"))).map(hd -> {
                        getTempCPU().setText(String.valueOf(hd.getTemp()));
                        return hd;
                    }).forEachOrdered(hd -> {
                        if (hd.getTemp() < 50) {
                            getTempCPU().setForeground(Color.green);
                        } else {
                            if (hd.getTemp() >= 50 && hd.getTemp() < 70) {
                                getTempCPU().setForeground(Color.yellow);
                            } else {
                                if (hd.getTemp() >= 70) {
                                    getTempCPU().setForeground(Color.red);
                                }
                            }
                        }
                    });
                } catch (InterruptedException ex) {
                    
                }

            }
                    String toSend = "Stop";
                    byte[] toSendBytes = toSend.getBytes();
                    int toSendLen = toSendBytes.length;
                    byte[] toSendLenBytes = new byte[4];
                    toSendLenBytes[0] = (byte) (toSendLen & 0xff);
                    toSendLenBytes[1] = (byte) ((toSendLen >> 8) & 0xff);
                    toSendLenBytes[2] = (byte) ((toSendLen >> 16) & 0xff);
                    toSendLenBytes[3] = (byte) ((toSendLen >> 24) & 0xff);
                    os.write(toSendLenBytes);
                    os.write(toSendBytes);
        } catch (IOException ex) {
            
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
