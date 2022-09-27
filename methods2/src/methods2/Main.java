package methods2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String city = sendCity();
		int total = sum(5,6);
		System.out.println(total);
		
		int totalForArgs=sumForArgs(1,8,9,21,45);
		System.out.println(totalForArgs);
		int totalForArgs2=sumForArgs(1,8,9);
		System.out.println(totalForArgs2);

	}
	
	public static void add() {
		System.out.println("Added...");
	}
	public static void delete() {
		System.out.println("Deleted...");
	}
	public static void update() {
		System.out.println("Updated...");
	}
	
	public static String sendCity() {
		return "Ankara";
	}
	
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	
	public static int sumForArgs(int... numbers) {//variable arguments
		int total=0;
		for(int num:numbers) {
			total+=num;
		}
		return total;
	}

}
