package facade;

import java.io.File;

public class Text implements Convertible {

	@Override
	public File convert(File file) {
		System.out.println("converting text file");
		return file;
	}

}
