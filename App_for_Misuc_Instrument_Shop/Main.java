package App_for_Misuc_Instrument_Shop;

import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inizialize(inventory);
        Map properties = new HashMap();
        properties.put("builder", Builder.GIBSON);
        properties.put("topWood", Wood.MAPLE);
        InstrumentSpec clientspec = new InstrumentSpec(properties);
        List matchingInstruments = inventory.search(clientspec);
        for (Iterator i = matchingInstruments.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            InstrumentSpec spec = instrument.getSpec();
            System.out.println("We have  a" + spec.getProperty("instrumentType") + "with the folowwing properties");
            for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext(); ) {
                String property_name = (String) j.next();
                if (property_name.equals("instrumentType"))
                    continue;
                System.out.println("     " + property_name + ": " + spec.getProperty(property_name));
            }
            System.out.println("You have this" + spec.getProperty("instrumentType") + " for $" +
                    instrument.getPrice() + "\n---");

        }

    }

    private static void inizialize(Inventory inventory) {
        Map properties=new HashMap();
        properties.put("instrumentType",InstrumentType.GUITAR);
        properties.put("builder",Builder.COLLINS);
        properties.put("model","CJ");
        properties.put("type",Type.ACOUSTIC);
        properties.put("numStrings",6);
        properties.put("topWood",Wood.INDIAN_ROSEWOOD);
        properties.put("backWood",Wood.SITKA);
        inventory.addInstrument("112277",3999.95,new InstrumentSpec(properties));
        properties.put("builder",Builder.GIBSON);
        properties.put("model","D-18");
        properties.put("topWood",Wood.MAPLE);
        properties.put("backWood",Wood.ADIRONDACK);
        inventory.addInstrument("122274",49999.05,new InstrumentSpec(properties));
        properties.put("builder",Builder.FENDER);
        properties.put("model","Dark Star");
        properties.put("topWood",Wood.MAHOGANY);
        properties.put("backWood",Wood.COCOBOLO);
        properties.put("type",Type.ELECTRIC);
        inventory.addInstrument("000001",100000.09,new InstrumentSpec(properties));
        inventory.addInstrument("000002",999999.99,new InstrumentSpec(properties));
        properties.put("instrumentType",InstrumentType.MANDOLIN);
        properties.put("builder",Builder.GIBSON);
        properties.put("topWood",Wood.MAPLE);
        properties.put("model","BBB");
        properties.put("backWood",Wood.BRAZILIAN_ROSEWOOD);
        properties.put("type",Type.ACOUSTIC);
        properties.remove("numStrings");
        inventory.addInstrument("345670",1000,new InstrumentSpec(properties));
        properties.put("instrumentType",InstrumentType.BANJO);
        properties.put("model","Bajo-566");
        properties.remove("topWood");
        properties.put("numStrings",5);
        inventory.addInstrument("566789",2000.956,new InstrumentSpec(properties));






    }
}
