package saturday16;

public class SecondLargeNumber
{
	
	public static int secondLarge(int[] input)
	{
		
		int firstNumber,secondNumber;
		
		if(input[0] > input[1])
		{
			firstNumber = input[0];
			secondNumber = input[1];
		}else{
			firstNumber = input[1];
			secondNumber = input[0];
		}
		
		for(int i=2;i < input.length;i++)
		{
			if(input[i] > firstNumber)
			{
				secondNumber = firstNumber;
				firstNumber = input[i];
			}else if(input[i] < firstNumber && input[i] < secondNumber){
				secondNumber = input[i];
			}
		}
		
		return secondNumber;
	}
	

	public static void main(String[] args)
	{
		System.out.println(secondLarge(new int[]{1,2,3}));

	}

}
