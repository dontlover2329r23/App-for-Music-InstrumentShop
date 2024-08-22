package App_for_Misuc_Instrument_Shop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {
    private Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        if (properties == null) {
            this.properties = new HashMap<>();
        } else {
            this.properties = new HashMap<>(properties);
        }
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (String propertyName : otherSpec.getProperties().keySet()) {
            Object otherValue = otherSpec.getProperty(propertyName);
            Object thisValue = properties.get(propertyName);

            if (thisValue == null || !thisValue.equals(otherValue)) {
                return false;
            }
        }
        return true;
    }
}
