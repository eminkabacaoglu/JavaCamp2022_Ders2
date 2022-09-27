package methodOverloading;

public class Main {
	
	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();
		int totalforTwo = fourOperations.sum(4,5);
		System.out.println(totalforTwo);
		
		int totalforThree = fourOperations.sum(4,5,8);
		System.out.println(totalforThree);
	}
	
}
