
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 100;
		int num2 = 10;
		
		System.out.println (add(num1, num2));
		System.out.println (subtract(num1, num2));
		System.out.println (multiply(num1, num2));
		System.out.println (divide(num1, num2));
		System.out.println (square(num1, num2));
		

	}
	
	private static int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
	private static int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
	
	private static int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}
	
	private static int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	private static int square(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1 + num2) * (num1 + num2);
	}	

}
