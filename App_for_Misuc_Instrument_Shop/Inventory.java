package App_for_Misuc_Instrument_Shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
  enum InstrumentType{
    GUITAR,BANJO,DOBRO,FIDDLE,BASS,MANDOLIN;
    public String toString(){
        switch (this){
            case GUITAR : return  "Guitar";
            case BASS: return "Bass";
            case BANJO:return "Banjo";
            case DOBRO:return "Dobro";
            case FIDDLE:return "Fiddle";
            case MANDOLIN:return "Mandolin";
            default:return "Unspecified";
        }
    }
}
enum Type{
      ACOUSTIC,ELECTRIC;
    public String toString(){
        switch (this){
            case ACOUSTIC : return "Acoustic";
            case ELECTRIC:return "Electic";
            default:return "Untype";
        }
    }
}
enum Builder{
      FENDER,MARTIN,GIBSON,COLLINS,OLSON,RYAN,PRS,ANY;
    public String toString() {
        switch (this) {
            case ANY : return "Any";
            case PRS:return "Prs";
            case RYAN:return "Ryan";
            case OLSON:return "Olson";
            case FENDER:return "Fender";
            case GIBSON:return "Gibson";
            case MARTIN:return "Martin";
            case COLLINS:return "Collins";
            default:return "Unbuilder";

        }
    }
}
enum Wood{
      INDIAN_ROSEWOOD,BRAZILIAN_ROSEWOOD,MAHOGANY,MAPLE,COCOBOLO,CEDAR,ADIRONDACK,ALDER,SITKA;
    public String toString() {
        switch (this) {
            case ALDER :return "Alder";
            case CEDAR:return "Cedar";
            case MAPLE:return "Maple";
            case SITKA:return "Sitka";
            case COCOBOLO:return "Cocobolo";
            case MAHOGANY:return "Mahogany";
            case ADIRONDACK:return "Adirondack";
            case INDIAN_ROSEWOOD:return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD:return "Brazilian Rosewood";
            default:return "UnWood";
        }
    }
}
public class Inventory {
    private List inventory;
    public Inventory(){
        inventory=new LinkedList();
    }
    public void addInstrument(String serialnumber,double price,InstrumentSpec spec){
        Instrument instrument= new Instrument(serialnumber,price,spec);

        inventory.add(instrument);
    }
    public Instrument get(String serialnumber){
        for(Iterator i=inventory.iterator();i.hasNext();){
            Instrument instrument=(Instrument) i.next();
            if(instrument.getSerialNumber().equals(serialnumber)){
                return instrument;
            }
        }
        return null;
    }
    public List search (InstrumentSpec spec){
        List matchingInstrument=new LinkedList();
        for(Iterator i=inventory.iterator();i.hasNext();){
            Instrument instrument=(Instrument) i.next();
            if(instrument.getSpec().matches(spec)){
                matchingInstrument.add(instrument);
            }
        }
        return matchingInstrument;
    }


}
