package patterns.FactoryDemo;

public class CycleFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Bicycle();
    }
}
