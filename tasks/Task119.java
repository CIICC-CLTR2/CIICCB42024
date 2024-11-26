package tasks;
import java.util.Scanner;

public class Task119 {

    public static char op;

    public static void main(String[] args) {

        double n1 = 0.0, n2 = 0.0;

        System.out.print("Enter First Number: ");
        n1 = getValidNumber(n1);
        System.out.print("Enter 2nd Number: ");
        n2 = getValidNumber(n2);
        op = getValidOperator(op);
   
        System.out.println(getResult(n1, n2, op));

    }

    private static String getResult(double n1, double n2, char c) {
        String returnResult = "";
        if (c == '+') 
        {returnResult = "The Sum is: " + getSum(n1, n2);} 
        else if (c == '-') 
        {returnResult = "The Difference is: " + getDifference(n1, n2);}
        else if (c == 'x')
        {returnResult = "The Product is: " + getProduct(n1, n2);}
        else if (c == 'x')
        {returnResult = "The Quotient is: " + getQuotient(n1, n2);}
        return returnResult;
    }

    public static double getSum(double n1, double n2) {
        return n1 + n2;
    }
    public static double getDifference(double n1, double n2) {
        return n1 - n2;
    }
    public static double getProduct(double n1, double n2) {
        return n1 * n2;
    }
    public static double getQuotient(double n1, double n2) {
        return n1 / n2;
    }

    public static char getValidOperator(char op) {
        Scanner scanner = new Scanner(System.in);
        String operator;

        while (true) {
            System.out.print("Enter Operation to be used [ + , - , x, / ]: ");
            operator = scanner.nextLine();
            op = operator.charAt(0);

            if (op == '+' || op == '-' || op == 'x' || op == '/') {return op;} 
            else {System.out.println("\nInvalid operator!  ");}
        }
    }

    public static double getValidNumber(double n1) {
        Scanner scan = new Scanner(System.in);
  
        while (!scan.hasNextDouble()) {
            System.out.print("Enter Valid input: ");
            scan.nextLine();
        }
       
        return  n1 = scan.nextDouble();
    }

}