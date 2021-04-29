package Logitech;

public abstract class ILogitech extends com.logitech.gaming.LogiLED implements AAPerifericos.IPerifericos {

    private ColorLogitech cor;
    private String nome;
    private String ID;
    private final int[] zonasRGB;
    private final int tipoDoDispositivo;

    protected final int[][] teclas = {{0xFFFF1, 0x01, 0x3b, 0x3c, 0x3d, 0x3e, 0x3f, 0x40, 0x41, 0x42, 0x43, 0x44, 0x57, 0x58, 0x137, 0x46, 0x145},
    {0xFFF1, 0x29, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x152, 0x147, 0x149, 0x45, 0x135, 0x37, 0x4A},
    {0xFFF2, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x2B, 0x153, 0x14F, 0x151, 0x47, 0x48, 0x49, 0x4E},
    {0xFFF3, 0x3A, 0x1E, 0x1F, 0x20, 0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x1C, 0x4B, 0x4C, 0x4D},
    {0xFFF4, 0x2A, 0x2C, 0x2D, 0x2E, 0x2F, 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x148, 0x4F, 0x50, 0x51, 0x11C},
    {0xFFF5, 0x1D, 0x15B, 0x38, 0x39, 0x138, 0x15C, 0x15D, 0x11D, 0x14B, 0x150, 0x14D, 0x52, 0x53}
    };

    public ILogitech(String nome, String ID, java.awt.Color cor, int[] zonasRGB, int tipoDoDispositivo) {
        LogiLedInit();
        this.cor = new ColorLogitech(cor);
        this.nome = nome;
        this.ID = ID;
        this.zonasRGB = zonasRGB;
        this.tipoDoDispositivo = tipoDoDispositivo;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setCor(java.awt.Color cor) {
        this.cor = new ColorLogitech(cor);
    }

    /**
     *
     * @return ColorLogitech
     */
    @Override
    public ColorLogitech getCor() {
        return cor;
    }

    @Override
    public String getMarca() {
        return "Logitech";
    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public void colorirDispositivo() {
        ColorLogitech cor = this.getCor();
        try {
            for (int i : zonasRGB) {
                LogiLedSetLightingForTargetZone(tipoDoDispositivo, i, cor.getR(), cor.getG(), cor.getB());
            }

        } catch (Exception ex) {
        }
    }

    @Override
    public void limparCorDispositivo() {
        try {
            for (int i : zonasRGB) {
                LogiLedSetLightingForTargetZone(tipoDoDispositivo, i, 0, 0, 0);
            }

        } catch (Exception ex) {
        }
    }

    @Override
    public int[] getZonasRGB() {
        return zonasRGB;
    }

    ;
    
    @Override
    public void colorirTudo() {
        LogiLedSetLighting(cor.getR(), cor.getG(), cor.getB());
    }

}
