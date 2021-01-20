package monday18;

public class FindMissingNumber {
	
	
	public static int getMissing(int arry[],int totalNumber)
	{
		int total;
		
		total = (totalNumber + 1) * (totalNumber +2) /2;
		
		for(int i=0;i<total;i++)
			total -= arry[i];
			
			return total;
		
	}

	public static void main(String[] args)
	{
		int missing = getMissing(new int[]{1,2,3,4,6},5);
		System.out.println(missing);
	}

}
