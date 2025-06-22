package patterns.FactoryDemo;

public class ElectricCar implements Vehicle{
    private String name;
    public ElectricCar()
    {
        this.name="ElectricCar";
    }

    public void drive()
    {
        System.out.println("Driving "+getName());
    }

    @Override
    public String getName() {
        return name;
    }
}
