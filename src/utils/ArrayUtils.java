package utils;

public class ArrayUtils {
	public static String stringifyArrays(int[] arr){
		String result="";
		for( int i=0; i<arr.length; i=i+1) {
			if( i != arr.length-1) {

			result = result + arr[i]+",";
			}
		}
		return result + arr[arr.length-1];
	}
	
	public static int[] reverse(int[] arr) {
		int[] newarr =new int[arr.length];
	
		for(int i=0; i<arr.length; i++) {
		newarr[i]= arr[arr.length - i -1];
			
		}
		return newarr; 
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
	
		System.out.println(ArrayUtils.stringifyArrays(arr));
		 int[] newarr = ArrayUtils.reverse(arr);
		for(int i = 0; i<arr.length;i++)
		System.out.print(newarr[i]+ " ");
	}

}
