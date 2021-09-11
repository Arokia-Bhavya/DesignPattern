package singleton;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class DemoMultiThreaded {
public static void main(String[] args)
{
	ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
	for (int count = 0; count < 10; count++)
	executor.submit(() -> System.out.println(MenuItem.getInstance(Thread.currentThread().getName())));
	executor.shutdown();
}
}
