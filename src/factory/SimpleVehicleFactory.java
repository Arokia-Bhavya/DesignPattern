package patterns.FactoryDemo;

public class SimpleVehicleFactory {

    public static Vehicle getVehicle(String vehicleType)
    {
        if(vehicleType.equalsIgnoreCase("Car"))
            return new Car();
        else if(vehicleType.equalsIgnoreCase("MotorBike"))
            return new MotorBike();
        else if(vehicleType.equalsIgnoreCase("Bicycle"))
            return new Bicycle();
        else
            throw new RuntimeException("Unsupported VehicleType");
    }
}
