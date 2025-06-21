package patterns.SingletonDemo;

public class ThreadSafeIntialization {
    private static ThreadSafeIntialization INSTANCE;

    private ThreadSafeIntialization()
    {

    }

    public static synchronized ThreadSafeIntialization getInstance()
    {
        if(INSTANCE == null)
            INSTANCE = new ThreadSafeIntialization();
        return INSTANCE;
    }
}
