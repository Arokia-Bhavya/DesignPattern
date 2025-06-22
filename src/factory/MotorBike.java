package patterns.FactoryDemo;

public class MotorBike implements Vehicle{
    private String name;
    public MotorBike()
    {
        this.name="MotorBike";
    }
    @Override
    public void drive()
    {
        System.out.println("Driving motorbike");
    }

    public String getName() {
        return "MotorBike";
    }
}
