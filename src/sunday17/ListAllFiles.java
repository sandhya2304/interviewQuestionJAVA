package sunday17;

import java.io.File;

public class ListAllFiles {

	public static void main(String[] args)
	{
		
		File folder = new File("D://");
		String[] files  = folder.list();
		
		for(String file:files)
		{
			System.out.println(file);
		}
		

	}

}
