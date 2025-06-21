package patterns.SingletonDemo;

public class LazyIntialization {
    private static LazyIntialization INSTANCE;

    private LazyIntialization()
    {

    }

    public static LazyIntialization getInstance()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new LazyIntialization();
        }
        return INSTANCE;
    }
}
