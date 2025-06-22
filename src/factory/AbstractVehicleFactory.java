package patterns.FactoryDemo;

public interface AbstractVehicleFactory {
    Vehicle createCar();
    Vehicle createBike();
    Vehicle createCycle();

}
