
public class MagicCalculator extends Calculator {
	
	private String magicCalculator;
	
	public static void main(String[] args) {
		
		int a = 9;
		long factorial = multiplyNumbers(a);
		for (int i=1; i<=a; i++);
		
					
		System.out.println("Square root of y is: " + Math.sqrt(a));
		
		System.out.println("Sin value of a is: " +Math.sin(a)); 
		
		System.out.println("Cosine value of a is: " +Math.cos(a));
		
		System.out.println("Tangent value of a is: " +Math.atan(a));
				
		System.out.println("Factorial value of a is:" + factorial);
	}
	
	public static long multiplyNumbers(int a) {
		
		if (a>=1)
			return a * multiplyNumbers(a-1);
			
		else
			return 1;
	}
		
		           
}
						
	
