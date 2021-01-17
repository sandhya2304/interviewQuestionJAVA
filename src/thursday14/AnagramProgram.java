package thursday14;

import java.util.Arrays;

public class AnagramProgram {
	
	
	public static void isAnagram(String s1,String s2)
	{
		
		String copys1 = s1.replaceAll("\\s","");
		String copys2 = s2.replaceAll("\\s","");
		
		boolean status=  true;
		
		if(copys1.length() != copys2.length())
		{
			status = false;
		}else{
			
			char[] arry1 = copys1.toLowerCase().toCharArray();
			char[] arry2 = copys2.toLowerCase().toCharArray();
			
			Arrays.sort(arry1);
			Arrays.sort(arry2);
			
			status = Arrays.equals(arry1,arry2);
			
		}
		if(status)
		{
			System.out.println("String is anagram");
		}else{
			System.out.println("String is not anagram");
		}
		
		
		
	}
	

	public static void main(String[] args)
	{
		 isAnagram("keep", "peek");
		 isAnagram("love", "hate");
	}

}
