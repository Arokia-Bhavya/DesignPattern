package singleton;

public class DemoSingleThreaded {
	
	public static void main(String[] args)
	{
		MenuItem emp1=MenuItem.getInstance("raja");
		MenuItem emp2=MenuItem.getInstance("ravi");		
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
