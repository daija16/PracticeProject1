package real.numbers;

import java.util.Arrays;

//import murach.business.Product;
import real.numbers.Primes;
import real.numbers.Console;

public class NumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome\n");
		displayMenu();
		String action = "";
		while (!action.equalsIgnoreCase("exit")) {
			action = Console.getString("Enter a command: ");
			System.out.println();
			
			if (action.equalsIgnoreCase("check") || 
                    action.equalsIgnoreCase("c")) {
				checkIfPrime();
			} else if (action.equalsIgnoreCase("range") || 
                    action.equalsIgnoreCase("r")) {
				listFromRange();
         } else if (action.equalsIgnoreCase("between") || 
                       action.equalsIgnoreCase("b")) {
        	 betweenFromRange();
            } else if (action.equalsIgnoreCase("help") || 
                       action.equalsIgnoreCase("menu")) {
                displayMenu();
            } else if (action.equalsIgnoreCase("exit")) {
                System.out.println("Bye.\n");
            } else {
                System.out.println("Error! Not a valid command.\n");
            }
	            
		 }
		
		}
	
	public static void displayMenu() {
        System.out.println("COMMAND MENU");
        System.out.println("check    - Check if number is prime");
        System.out.println("range    - List all primes from 0 to this number");
        System.out.println("between    - List all primes from a min value to a max value");
 }

	
	public static void checkIfPrime() {
		int num = Console.getRange("Enter prime you like to test: ");
        
		//Primes product = new Primes();
		
        if (Primes.isPrime(num)){
        	System.out.println(num + " is a Prime number.\n");
        }
        else {
        	System.out.println(num + " is a Composite number.\n");
        }

        
	
	}
	public static void listFromRange() {
		int num = Console.getRange("Enter range of numbers you like to test: ");

		//Primes product = new Primes();
		
		int[] primes=Primes.getPrimes(num);
		System.out.println("the list of primes from "+num+ " are: \n");
        System.out.println(Arrays.toString(primes));
		
	}
	
	public static void betweenFromRange() {
		int min = Console.getRange("Enter start of range you like to test: ");
		int max = Console.getRange("Enter end of range you like to test: ");

		//Primes product = new Primes();
		
		int[] primes=Primes.getPrimes(min, max);
		System.out.println("the list of primes from "+min+" and "+max+ " are: \n");
        System.out.println(Arrays.toString(primes));
		
	}
	
}
