package tuesday12;

import java.util.Scanner;

public class DiamondPattern
{
	public static void main(String[] args)
	{
		
		 Scanner sc = new Scanner(System.in);
		System.out.println("How many rows :");
		int rows =sc.nextInt();
		
		int midRow = (rows)/2;
		
		int row = 1;
		
		System.out.println("Diamond....");

		
		//upper half
		for(int i=midRow;i > 0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=row;j++){
				System.out.print("* ");
			}
			System.out.println(" ");
			
			row++;
		}
		
		//lowerhalf
		for(int i=0;i<=midRow;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=row;j>0;j--){
				System.out.print("* ");
			}
			System.out.println(" ");
			
			row--;
		}
		
		
		

	}

}
