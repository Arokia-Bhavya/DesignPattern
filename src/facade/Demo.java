package facade;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		File file = new File("demo1.txt");
        file.createNewFile();
		HelperFacade.convertFile(file);
	}

}
