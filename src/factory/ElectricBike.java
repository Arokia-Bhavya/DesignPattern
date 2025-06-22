package patterns.FactoryDemo;

public class ElectricBike implements Vehicle{
    private String name;
    public ElectricBike()
    {
        this.name="ElectricBike";
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
