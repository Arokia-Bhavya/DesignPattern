package facade;

import java.io.File;

public class HelperFacade {

	public static void convertFile(File file)
	{
		String fileName=file.getName();
		if (fileName.endsWith(".mp4"))
		{
			Video video=new Video();
			video.convert(file);
		}else if(fileName.endsWith(".txt"))
		{
			Text text=new Text();
			text.convert(file);
		}else
		{
			Audio audio=new Audio();
			audio.convert(file);
		}
			
	}
}
