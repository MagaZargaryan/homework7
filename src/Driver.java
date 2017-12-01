import animals.animals.*;
import utils.*;

public class Driver {
	
public static void main(String[] args) {
	Puppy a = new Puppy("Joey");
	System.out.println(a.getName());
	
	Puppy b = new Puppy("Chandler");
	System.out.println(b.getName());
	
	Puppy c = new Puppy("Ross");
	System.out.println(c.getName());
	
	int[] array= {9, 20, 3, 44, 88, 300};
	int[] array1 = utils.ArrayUtils.reverse(array);
	System.out.println(utils.ArrayUtils.stringifyArrays(array1));
	
	double num = 15.4;
	System.out.println(utils.Math.factorial( (int) num));
}
}
