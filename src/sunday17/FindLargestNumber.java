package sunday17;

public class FindLargestNumber {
	
	public static int getLessNumber(int number,int digit)
	{
		
		char ch = Integer.toString(digit).charAt(0);
		for(int i=number;i>0;--i){
			if(Integer.toString(i).indexOf(ch) == -1){
				return i;
			}
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		
		System.out.println(getLessNumber(123, 2));
		
		

	}

}
