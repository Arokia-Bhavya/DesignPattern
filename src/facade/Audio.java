package facade;

import java.io.File;

public class Audio implements Convertible {

	@Override
	public File convert(File file) {
		System.out.println("converting audio file");
		return file;
	}

}
