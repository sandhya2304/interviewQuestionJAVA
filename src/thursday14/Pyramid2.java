package thursday14;

import java.util.Arrays;
import java.util.Scanner;

public class Pyramid2 
{
	
	public static void sumDigit(int number)
	{
		int copy = number;
		int sum = 0;
		
		while(copy!=0)
		{
			int lastDigit = copy%10;
			sum = sum+lastDigit;
			
			copy =copy/10;
		}
		
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) 
	{
		sumDigit(12345);
	}

}
