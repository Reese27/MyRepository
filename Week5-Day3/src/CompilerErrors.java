import java.util.Scanner;
// This program calculates your gross pay
// This program will have illegal field names

public class CompilerErrors {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // get the number of hours worked
        System.out.println("Enter your hours worked: ");
        int hours-worked = Integer.parseInt(userInput.nextLine());

        //Get the pay rate
        System.out.println("What is your pay rate? ");
        String payRate = Integer.parseInt(userInput.nextLine()); // This line is expecting a String.  Incompatible data type

        //Calculate the gross pay
        int gross Rate = hours-worked * payRate; // Invalid variable name


    }

    // Display the gross pay
        System.out.printf("Gross pay: $%d ", grossRate); // out of scope
}