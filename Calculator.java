package ElevateLabs_tasks;
import java.util.Scanner;

	public class Calculator {

	    // Addition
	    public static double add(double a, double b) {
	        return a + b;
	    }

	    // Subtraction
	    public static double subtract(double a, double b) {
	        return a - b;
	    }

	    // Multiplication
	    public static double multiply(double a, double b) {
	        return a * b;
	    }

	    // Division
	    public static double divide(double a, double b) {
	        if (b == 0) {
	            System.out.println("Division by zero is undefined so please enter the valid interger other than 0.");
	            System.out.println (Double.NaN);
	        }
	        return a / b;
	    }
	    //modulo division
	    public static double modDivision(double num1, double num2) {
/*        if (b == 0) {
	            System.out.println("Division by zero is undefined so please enter the valid interger other than 0.");
	            System.out.println (Double.NaN);
        }
*/
	        return (num1 % num2);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean keepRunning = true;

	        System.out.println("Welcome to the Java Console Calculator!");

	        while (keepRunning) {
	            System.out.println("\nChoose an operation:");
	            System.out.println("1 - Add");
	            System.out.println("2 - Subtract");
	            System.out.println("3 - Multiply");
	            System.out.println("4 - Divide");
	            System.out.println("5 - ModDiv");
	            System.out.println("6 - Exit");

	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            if (choice == 6) {
	                keepRunning = false;
	                System.out.println("Goodbye!");
	                break;
	            }

	            // Get operands
	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();

	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();

	            double result;
	            //loop iterates upon 1 to 5
	            switch (choice) {
	                case 1:
	                    result = add(num1, num2);
	                    System.out.println("Result: " + result);
	                    break;
	                case 2:
	                    result = subtract(num1, num2);
	                    System.out.println("Result: " + result);
	                    break;
	                case 3:
	                    result = multiply(num1, num2);
	                    System.out.println("Result: " + result);
	                    break;
	                case 4:
	                    result = divide(num1, num2);
	                    if (!Double.isNaN(result)) {
	                        System.out.println("Result: " + result);
	                    }
	                    break;
	                case 5:
	                    result = modDivision(num1, num2);
	                    if (!Double.isNaN(result)) {
	                        System.out.println("Result: " + result);
	                    }
	                    break;
	                    
	                default:
	                    System.out.println("Invalid choice. Please select between 1 and 5.");
	            }
	        }

	        scanner.close();
	    }
	}


	
	

