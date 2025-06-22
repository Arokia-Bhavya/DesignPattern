package patterns.FactoryDemo;

public class Bicycle implements Vehicle{
    private String name;
    public Bicycle()
    {
        this.name="Bicycle";
    }
    public void drive()
    {
        System.out.println("Driving "+getName());
    }
    public String getName() {
        return "Bicycle";
    }
}
