package patterns.FactoryDemo;

public class VehicleRegistry {
    static
    {
        DynamicFactory.registerVehicle("Car",Car::new);
        DynamicFactory.registerVehicle("MotorBike",MotorBike::new);
        DynamicFactory.registerVehicle("Bicycle",Bicycle::new);
    }
}
