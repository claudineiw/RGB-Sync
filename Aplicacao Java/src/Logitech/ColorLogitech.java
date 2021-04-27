package Logitech;

public final class ColorLogitech {
    private int r;
    private int g;
    private int b;

    public ColorLogitech(java.awt.Color cor) {
       this.r=(cor.getRed()*100)/255;
       this.g=(cor.getGreen()*100)/255;
       this.b=(cor.getBlue()*100)/255;  
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
    
}
