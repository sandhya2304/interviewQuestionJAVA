package sunday17;

public class PairElements
{
	
	public static void findPair(int input[],int number)
	{
		
		System.out.println("ythe number is : "+number);
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++){
				if(input[i]+input[j] == number){
					System.out.println(input[i] + " + " +input[j] + " = "+number);
				}
			}
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		findPair(new int[]{1,1,3,3,5},6);

	}

}
