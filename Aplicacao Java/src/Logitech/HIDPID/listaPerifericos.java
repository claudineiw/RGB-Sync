package Logitech.HIDPID;


public final class listaPerifericos {

    private short VID;
    private short PID;
    private String Manufacturer;
    private String Path;
    private String Product;
    public listaPerifericos(short VID, short PID, String Manufacturer, String Path , String Product) {
        this.VID = VID;
        this.PID = PID;
        this.Manufacturer = Manufacturer;
        this.Path = Path;
        this.Product=Product;
    }    
    
    public short getVID() {
        return VID;
    }

    public void setVID(short VID) {
        this.VID = VID;
    }

    public short getPID() {
        return PID;
    }

    public void setPID(short PID) {
        this.PID = PID;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String Product) {
        this.Product = Product;
    }

    @Override
    public String toString() {        
        return String.format("VID=0x%04X, PID=0x%04X, Manufacturer=%s , Path= %s , Product= %s",VID,PID,Manufacturer,Path,Product);
    }

    

   

}
