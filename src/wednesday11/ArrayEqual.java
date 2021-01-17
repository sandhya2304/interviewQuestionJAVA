package wednesday11;

public class ArrayEqual {

	public static void main(String[] args) 
	{
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {1,2,3,4,5,6,7};
		
		boolean equalOrNot = true;
		
		if(arr1.length == arr2.length){
			for(int i=0;i<arr1.length;i++){
				if(arr1[i] != arr2[i]){
					equalOrNot = false;
				}
			}
		}else{
			equalOrNot = false;
		}
		
		if(equalOrNot){
			System.out.println("Two arrays are equal");
		}else{
			System.out.println("Not Equal");
		}
		
		

	}

}
