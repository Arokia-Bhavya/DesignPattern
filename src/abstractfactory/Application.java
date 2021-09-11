package abstractfactory;

import abstractfactory.buttons.Button;
import abstractfactory.checkboxes.CheckBox;
import abstractfactory.factories.GUIFactory;
import abstractfactory.factories.MacOSFactory;
import abstractfactory.factories.WinFactory;
public class Application{
	private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    } 

    public static void main(String[] args)
    {
    	Application app;
    	GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WinFactory();
            app = new Application(factory);
        }
        app.paint();
    }
}
