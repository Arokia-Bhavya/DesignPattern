package patterns.SingletonDemo;

public class DoubleCheckThreadSafeIntialization {
    private static volatile DoubleCheckThreadSafeIntialization INSTANCE;

    private DoubleCheckThreadSafeIntialization()
    {

    }

    public static DoubleCheckThreadSafeIntialization getInstance()
    {
        if(INSTANCE == null)
        {
            synchronized (DoubleCheckThreadSafeIntialization.class)
            {
                if(INSTANCE == null)
                {
                    INSTANCE = new DoubleCheckThreadSafeIntialization();
                }
            }
        }
        return INSTANCE;
    }
}
