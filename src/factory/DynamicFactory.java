package patterns.FactoryDemo;

import java.util.Map;
import java.util.HashMap;
import java.util.function.Supplier;

public class DynamicFactory {
    private static final Map<String,Supplier<Vehicle>> registry=new HashMap<String,Supplier<Vehicle>>();

    public static void registerVehicle(String vehicleName,Supplier<Vehicle> vehicleSupplier)
    {
        registry.put(vehicleName,vehicleSupplier);
    }

    public static Vehicle getVehicle(String name)
    {
        Supplier<Vehicle> vehicleSupplier=registry.get(name);
        return vehicleSupplier.get();
    }

}
