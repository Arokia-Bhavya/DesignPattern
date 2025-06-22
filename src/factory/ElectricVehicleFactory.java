package patterns.FactoryDemo;

public class ElectricVehicleFactory implements AbstractVehicleFactory{
    @Override
    public Vehicle createCar() {
        return new ElectricCar();
    }

    @Override
    public Vehicle createBike() {
        return  new ElectricBike();
    }

    @Override
    public Vehicle createCycle() {
        return new ElectricBicycle();
    }
}
