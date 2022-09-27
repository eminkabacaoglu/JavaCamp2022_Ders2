package methods;

public class Main {

	public static void main(String[] args) {
		
		findNumber();

	}
	
	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int findNumber = 5;

		boolean isExists = false;

		for (int number : numbers) {
			if (number == findNumber) {
				isExists = true;
				break;
			}
		}
		String message="";
		if (isExists) {
			message="Number is found:"+ findNumber;
			showMessage(message);
		} else {
			message="Number s not found:"+ findNumber;
			showMessage(message);
		}
	}
	
	public static void showMessage(String message) {
		System.out.println(message);
	}

}
