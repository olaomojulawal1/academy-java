package peerTutor;
//Scanner is imported
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Step 2 this creates the scanner object
		
		System.out.println("Enter your occupation: "); // Step 3 tells the user what to enter
		String name = scanner.nextLine();
		
		System.out.println("How old are you: ");//ask user for age
		int age = scanner.nextInt();
		
		System.out.println("What is your last name: ");
		String lastName = scanner.next();
		
		System.out.println("Enter true or false: ");
		boolean trueOrFalse = scanner.nextBoolean();
	
		System.out.println("Enter the price: ");
		double price = scanner.nextDouble();
		
		System.out.println("Welcome to Our Portal and What Kind of Insurance Would you like to purchase ");
		String typeOfInsurance = scanner.next();
		
		System.out.println("This is all i have written for now:" + name + age + lastName + true + price + typeOfInsurance);
		
		int a; int b;
		a = 23;
		b= 5;
		
		int result = a*b;
		System.out.println(result);
	
		scanner.close();

	}

}
