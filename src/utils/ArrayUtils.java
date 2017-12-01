package utils;

public class ArrayUtils {
	// this code returns a string with each member in the array concatenated together with ', ' in between.
	public static String stringifyArrays(int[] arr){
		String result="";
		for( int i=0; i<arr.length; i=i+1) {
			if( i != arr.length-1) {

			result = result + arr[i]+",";
			}
		}
		return result + arr[arr.length-1];
	}
	
	// this code reverses given array of integers
	public static int[] reverse(int[] arr) {
		int[] newarr =new int[arr.length];
	
		for(int i=0; i<arr.length; i++) {
		newarr[i]= arr[arr.length - i -1];
			
		}
		return newarr; 
		
	}
	// this main method is for checking whether the code works or not
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
	
		System.out.println(ArrayUtils.stringifyArrays(arr));
		 int[] newarr = ArrayUtils.reverse(arr);
		for(int i = 0; i<arr.length;i++)
		System.out.print(newarr[i]+ " ");
	}

}
