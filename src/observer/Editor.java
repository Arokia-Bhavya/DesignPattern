package observer;

import java.io.File;
import java.io.IOException;

public class Editor {
	EventManager eventManager;
	File file;
	public Editor() {
		System.out.println("intializing publisher");
		this.eventManager = new EventManager();
	}
	void openFile(String path)
	{
		this.file = new File(path);
		eventManager.notify("open", file.getName());
	}
	
	void saveFile() throws IOException
	{
		file.createNewFile();
		eventManager.notify("save", file.getName());
	}
}
