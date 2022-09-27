package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		
		FourOperations fourOperations = new FourOperations();
		int sum=fourOperations.sum(5, 9);
		System.out.println("Sum: "+sum);
		
		int subs=fourOperations.substract(5, 9);
		System.out.println("Substraction: "+subs);
		
		int multiply=fourOperations.multiply(5, 9);
		System.out.println("Multiplication: "+multiply);
		
		double divide=fourOperations.divide(12, 3);
		System.out.println("Divide: "+divide);

	}

}
