package sunday17;

import java.io.File;

public class ListAllFiles {

	public static void main(String[] args)
	{
		File file = new File("D://");
		String[] folder = file.list();
		
		for(String string:folder){
			System.out.println(string);
		}

	}

}
