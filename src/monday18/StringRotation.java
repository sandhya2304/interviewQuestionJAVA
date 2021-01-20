package monday18;

public class StringRotation {

	public static void main(String[] args)
	{
		String s1 = "JavaHibernate";
		String s2 = "HibernateJava";
		
		if(s1.length() != s2.length())
		{
			System.out.println("length is not equal so no rotation");
		}else{
			
			String s3 = s1+s2;
			
			if(s3.contains(s2)){
				System.out.println("yes s2 is rotation of s1");
			}else{
				System.out.println("no rotation");
			}
		}

	}

}
