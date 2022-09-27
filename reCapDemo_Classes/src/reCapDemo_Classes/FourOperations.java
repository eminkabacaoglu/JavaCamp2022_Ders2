package reCapDemo_Classes;

public class FourOperations {
	
	public int sum(int number1,int number2) {
		return number1+number2;
	}
	
	public int substract(int number1,int number2) {
		return number1-number2;
	}
	public int multiply(int number1,int number2) {
		return number1*number2;
	}
	public double divide(int number1,int number2) {
		if(number2==0) {
			System.out.println("cannot divide by zero");
			//return 0;
		}
		return number1/number2;
	}

}
