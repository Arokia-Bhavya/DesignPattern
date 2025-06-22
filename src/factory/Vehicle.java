package patterns.FactoryDemo;

@FunctionalInterface
public interface Vehicle {
    public abstract void drive();
    public default String getName()
    {
        return "";
    }
}
