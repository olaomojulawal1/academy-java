package _009demo;
import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
	
		System.out.println(" Welcome to Basic Calculator ");
		
		
		System.out.println("The Following operations are supported:Addition (+) Subtraction (-) Multiplication (*) and Division (/) " );
		
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the operator (+, -, *, /) : " );
	   
	   char operation = scanner.next().charAt(0);
	   
	   System.out.println("Enter first number :");
	   double number1 = scanner.nextDouble();
	   
	   System.out.println("Enter second number :");
	   double number2 = scanner.nextDouble();
	   
	   if(operation == '+' ) {
		   System.out.println(number1 + "+" + number2 + " = " + (number1 + number2));
		  
		   }else if (operation == '-') {
			   System.out.println(number1 + "-" + number2 + " = " + (number1 - number2));
	  
		   }else if (operation == '*') {
			   System.out.println(number1 + "*" + number2 + " = " + (number1 * number2));
		  
		   }else if (operation == '/') {
			   System.out.println(number1 + "/" + number2 + " = " + (number1 / number2));
		   }
	   
	   
		

	}

}
