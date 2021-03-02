import java.util.*;

class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of A and B: ");
		int a = s.nextInt();
		int b = s.nextInt();
		addition(a, b);
		subtraction(a, b);
		multiplication(a, b);
		division(a, b);
	}

	public static void addition(int a, int b) {
	System.out.println("a+b= "+(a+b));
	}
	
	public static void subtraction(int a, int b) {
		System.out.println("a-b= "+(a-b));
	}

	public static void multiplication(int a, int b) {
		System.out.println("a*b= "+(a*b));
	}

	public static void division(int a, int b) {
		if (b!=0) {
			System.out.println("a/b= "+(a/b));
		} else {
			System.out.println("Cannot divide with zero!");
		}
		
	}


}

