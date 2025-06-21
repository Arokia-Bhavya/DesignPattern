package patterns.SingletonDemo;

public class StaticInnerClassIntialization {

    private StaticInnerClassIntialization()
    {

    }

    private static class Holder
    {
        private static final StaticInnerClassIntialization INSTANCE=new StaticInnerClassIntialization();
    }

    public static StaticInnerClassIntialization getInstance()
    {
        return Holder.INSTANCE;
    }
}
