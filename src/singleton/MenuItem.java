package singleton;


public class MenuItem {
	String value;
	private static volatile MenuItem instance;
	
	private MenuItem(String value)
	{
		 this.value=value;
	}
	
	public static MenuItem getInstance(String value)
	{
		synchronized (MenuItem.class) {

			if (instance == null) {
				instance = new MenuItem(value);
			}
		}

		return instance;
	}

}
