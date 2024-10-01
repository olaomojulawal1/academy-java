package switchCalculator;


	import java.util.Scanner;

	public class DataPlan {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("These are the avaiable mobile data plans!");
			System.out.println("Please choose an item from the list: ");
			System.out.println("1. 1GB - $10");
			System.out.println("2. 5GB  - $30");
			System.out.println("3. 10GB - $50");
			System.out.println("4. Unlimited - $70");
			System.out.println("5. Exit");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1: System.out.println("you selected 1GB!");
						break;
				case 2: System.out.println("You ordered Burger!");
						break;
				case 3: System.out.println("You ordered Pasta!");
						break;
				case 4: System.out.println("You ordered Salad!");
						break;
				case 5: System.out.println("Thank you for stopping by!");
						break;
				default:System.out.println("Invalid Choice!");
			}
			
			// 1. Allow multiple selections	
			// 2. Calculate total price for the order
			// 3. While exiting, show the total price	

		}

	}

}
