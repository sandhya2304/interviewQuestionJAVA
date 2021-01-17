package friday15;

public class SumAllDigit
{
	
	public static void sumAlldigit(int input){
		
		  int copyNumber = input;
		  int sum = 0;
		  
		  while(copyNumber != 0){
			  int lastdigit = copyNumber%10;
			  sum = sum+lastdigit;
			  
			  copyNumber = copyNumber/10;
		  }
		  
		  System.out.println("sum digit "+input+" : "+sum);
	}
	

	public static void main(String[] args) {
		sumAlldigit(231);
	}

}
