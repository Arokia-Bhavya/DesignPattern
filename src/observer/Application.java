package observer;

import java.io.File;

public class Application {
public static void main(String[] args)
{
	Editor editor = new Editor();
	File file=new File("demo1.txt");
	LoggingListener logger = new LoggingListener(file,"test");
	editor.eventManager.subscribe("open", logger);
	editor.openFile("demo1.txt");
	editor.eventManager.unsubscribe("open", logger);
}
}
