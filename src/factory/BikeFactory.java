package patterns.FactoryDemo;

public class BikeFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new MotorBike();
    }
}
