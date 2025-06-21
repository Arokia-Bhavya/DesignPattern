package patterns.SingletonDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testEagerIntialization()
    {
        Assertions.assertEquals(EagerIntialization.getInstance(),EagerIntialization.getInstance());
    }

    @Test
    public void testLazyIntialization()
    {
        Assertions.assertEquals(LazyIntialization.getInstance(),LazyIntialization.getInstance());
    }

    @Test
    public void testThreadSafeIntialization()
    {
        Assertions.assertEquals(ThreadSafeIntialization.getInstance(),ThreadSafeIntialization.getInstance());
    }

    @Test
    public void testDoubleCheckThreadSafeIntialization()
    {
        Assertions.assertEquals(DoubleCheckThreadSafeIntialization.getInstance(),DoubleCheckThreadSafeIntialization.getInstance());
    }

    @Test
    public void testStaticInnerClass()
    {
        Assertions.assertEquals(StaticInnerClassIntialization.getInstance(), StaticInnerClassIntialization.getInstance());
    }

    @Test
    public void testEnumSingletom()
    {
        Assertions.assertEquals(EnumSingletonIntialization.INSTANCE, EnumSingletonIntialization.INSTANCE);
    }
}
