package patterns.FactoryDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    public void testSimpleFactory()
    {
        Assertions.assertEquals("Car", SimpleVehicleFactory.getVehicle("Car").getName());
        Assertions.assertEquals("MotorBike", SimpleVehicleFactory.getVehicle("MotorBike").getName());
        Assertions.assertEquals("Bicycle", SimpleVehicleFactory.getVehicle("Bicycle").getName());
    }

    @Test
    public void testAbstractMethodPatternFactory()
    {
        Assertions.assertEquals("Car", new CarFactory().createVehicle().getName());
        Assertions.assertEquals("MotorBike", new BikeFactory().createVehicle().getName());
        Assertions.assertEquals("Bicycle", new CycleFactory().createVehicle().getName());
    }

    @Test
    public void testAbstractFactory()
    {
        Assertions.assertEquals("Car", new RegularVehicleFactory().createCar().getName());
        Assertions.assertEquals("MotorBike", new RegularVehicleFactory().createBike().getName());
        Assertions.assertEquals("Bicycle", new RegularVehicleFactory().createCycle().getName());
        Assertions.assertEquals("ElectricCar", new ElectricVehicleFactory().createCar().getName());
        Assertions.assertEquals("ElectricBike", new ElectricVehicleFactory().createBike().getName());
        Assertions.assertEquals("ElectricBicycle", new ElectricVehicleFactory().createCycle().getName());
    }

    @Test
    public void testDynamicFactory()
    {
        new VehicleRegistry();
        Assertions.assertEquals("Car",DynamicFactory.getVehicle("Car").getName());
        Assertions.assertEquals("MotorBike",DynamicFactory.getVehicle("MotorBike").getName());
        Assertions.assertEquals("Bicycle", DynamicFactory.getVehicle("Bicycle").getName());
    }

}
