package monday18;

import java.util.Arrays;

public class SeprateZeros {
	
	
	public static void moveZeros(int input[])
	{
		
	   int counter = 0;
	   
	   for(int i=0;i<input.length;i++){
		   if(input[i] != 0){
			   input[counter] = input[i];
			   
			   counter++;
		   }
	   }
	   
	   while(counter < input.length){
		   input[counter] = 0;
		   
		   counter++;
	   }
		System.out.println(Arrays.toString(input));
	}
	

	public static void main(String[] args) {
		
		moveZeros(new int[]{1,0,2,0,0,2});

	}

}
