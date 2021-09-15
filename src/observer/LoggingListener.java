package observer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LoggingListener implements EventListener{
	private File log;
    public LoggingListener(File log, String message) {
		super();
		this.log = log;
		this.message = message;
		System.out.println("intializing logging listener");
	}
	private String message;
	@Override
	public void update(String filename){
		try {
			Files.write(Paths.get(filename), message.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
