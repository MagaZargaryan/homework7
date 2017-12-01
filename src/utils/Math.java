package utils;

public class Math {
	
	        // this will compute the factorial by using recursion
		public static int factorial(int num){
		 if(num<=0){
			 return 1;
			 }return num * factorial(num-1);
			    }
	
	                // this will compute the factorial by using for loop
			public static int factorialLoop(int num){
			    int i;
			    int fact=num;
			    for(i=1; i< num; i++ ){
			        fact=fact*(num-i);
			     }
			    return(fact);
			}
	                // this code is for checking whether the code works or not
			public static void main(String[] args){
			
			System.out.println(factorial(15));
			System.out.println(factorialLoop(15));
			}

}
