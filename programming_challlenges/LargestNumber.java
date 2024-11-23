package programming_challlenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestNumber {

    private static Scanner scanner;

    public static void main(String[] args) {
       
        double num1, num2, num3= 0.0;

        num1 =getValidnumber("Enter the First integer: ");
        num2 =getValidnumber("Enter the Second integer: ");
        num3 =getValidnumber("Enter the Third integer: ");
        scanner.close();

        System.out.println("\nYou entered the numbers: " + num1 + ", " + num2 + ", " + num3 +"\n");
        System.out.println(largestNumber(num1, num2, num3));
      
    }

    public static String largestNumber(double num1, double num2, double num3){
            String message = "";
           
            return message =
            (num1>num2 && num1>num3)?
            (Double.valueOf(num1)) + (" is the Largest number") :
            (num2>num3)? 
            (Double.valueOf(num2)) + (" is the Largest number"):
            (Double.valueOf(num3)) + (" is the Largest number");

    } 
 
    public static double getValidnumber(String message) {
        scanner = new Scanner(System.in);
        double inputNumber = 0;

        while (true) {
            System.out.print(message);
            try {
                inputNumber =scanner.nextDouble() ;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Accepting Integer only!");
                scanner.nextLine();
            }

        }

        return inputNumber;

    }

}
