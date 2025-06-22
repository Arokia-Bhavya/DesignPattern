package patterns.FactoryDemo;

public class Car implements Vehicle{
    private String name;
    public Car()
    {
        this.name="Car";
    }
    public void drive()
    {
        System.out.println("Driving Car");
    }

    public String getName() {
        return name;
    }
}
