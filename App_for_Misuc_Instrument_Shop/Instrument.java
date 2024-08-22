package App_for_Misuc_Instrument_Shop;

public  class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec in_spec;
    public Instrument(String serialNumber,double price,InstrumentSpec spec){
        this.price=price;
        this.serialNumber=serialNumber;
        this.in_spec=spec;
    }

    public double getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public  InstrumentSpec getSpec(){
        return in_spec;
    }

}
