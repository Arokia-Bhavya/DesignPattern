package patterns.FactoryDemo;

public class RegularVehicleFactory implements AbstractVehicleFactory{
    @Override
    public Vehicle createCar() {
        return new Car();
    }

    @Override
    public Vehicle createBike() {
        return new MotorBike();
    }

    @Override
    public Vehicle createCycle() {
        return new Bicycle();
    }
}
