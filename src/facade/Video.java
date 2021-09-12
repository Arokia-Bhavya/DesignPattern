package facade;

import java.io.File;

public class Video implements Convertible {

	@Override
	public File convert(File file) {
		System.out.println("converting video file");
		return file;
	}

}
