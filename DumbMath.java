/**
 * This class contains some dumb methods for doing math.
 * Hence the name.
 * @author chris
 *
 */

public class DumbMath {

	public static int add(int a, int b) {
		int sum = a + b;
		
		// check for overflow
		if (b > 0 && a > 0 && sum < 0)
			throw new ArithmeticException("Overflow when adding " + a + " and " + b);

		return sum;
	}
	
	
	public static int multiply(int a, int b) {
		int product = a * b;
		return product;
	}
	

	public static void main(String[] args) {
		int a = 8;
		int b = 2; 
		int p = DumbMath.multiply(a, b);
		System.out.println(p);
	}
	

	public static double addFraction(int n1, int d1, int n2, int d2) {
		if (d1 == 0 || d2 == 0)
			throw new IllegalArgumentException("Denominator is zero!");

		if (n1 == 0)
			return ((double)n2)/d2;
		if (n2 == 0)
			return ((double)n1)/d1;
		
		double f1 = ((double)n1)/d1;
		double f2 = ((double)n2)/d2;
		return f1 + f2;
		
	}
}
