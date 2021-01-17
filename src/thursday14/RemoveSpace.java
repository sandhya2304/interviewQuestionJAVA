package thursday14;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string...");
		String word = sc.nextLine();
		
		String removeSpace = word.replaceAll("\\s+","");
		System.out.println(word + " ...with Space");
		System.out.println(removeSpace + " ...without Space");

	}

}
