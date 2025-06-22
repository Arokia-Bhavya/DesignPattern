package patterns.FactoryDemo;

public class ElectricBicycle implements Vehicle {
    private String name;
    public ElectricBicycle() {
        this.name = "ElectricBicycle";
    }

    @Override
    public void drive() {
        System.out.println("Driving "+ getName());
    }

    public String getName() {
        return name;
    }
}
