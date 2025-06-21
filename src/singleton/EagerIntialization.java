package patterns.SingletonDemo;

public class EagerIntialization {

    private static final EagerIntialization INSTANCE=new EagerIntialization();

    private EagerIntialization()
    {

    }

    public static EagerIntialization getInstance()
    {
        return INSTANCE;
    }
}
