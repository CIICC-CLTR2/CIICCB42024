package tasks;

import java.util.Scanner;

public class Task119 {

    public static char op;
    public static final String RED = "\u001B[31m"; // Red text
    public static final String GREEN = "\u001B[32m"; // Green text
    public static final String B = "\u001B[1m"; // Bold text
    public static final String U = "\u001B[4m"; // Underlined text
    public static final String R = "\u001B[0m"; // Reset formatting

    public static void main(String[] args) {

        double n1 = 0.0, n2 = 0.0;

        // System.out.print("Enter First Number: ");
        n1 = getValidNumber(n1, "\nEnter First Number: ");
        // System.out.print("Enter 2nd Number: ");
        n2 = getValidNumber(n2, "Enter Second Number: ");
        op = getValidOperator(op);

        System.out.println(getResult(n1, n2, op));

    }

    public static String getResult(double n1, double n2, char c) {
        String returnResult = "";
        if (c == '+') {
            returnResult = "\nThe Sum of " + n1 + B + GREEN + " " + op + R + " " + n2 + " is: " + R + RED + B
                    + getSum(n1, n2);
        } else if (c == '-') {
            returnResult = "\nThe Difference of " + n1 + B + GREEN + " " + op + R + " " + n2 + " is: " + R + RED + B
                    + getDifference(n1, n2);
        } else if (c == 'x' || c == 'X') {
            returnResult = "\nThe Product of " + n1 + B + GREEN + " " + op + R + " " + n2 + " is: " + R + RED + B
                    + getProduct(n1, n2);
        } else if (c == '/') {
            returnResult = "\nThe Quotient of " + n1 + B + GREEN + " " + op + R + " " + n2 + " is: " + R + RED + B
                    + String.format("%.2f", getQuotient(n1, n2));
        }
        return returnResult + "\n";
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

            if (op == '+' || op == '-' || op == 'x' || op == 'X' || op == '/') {
                return op;
            } else {
                System.out.println("\nInvalid operator!  ");
            }
        }
    }

    public static double getValidNumber(double n1, String prompt) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print(prompt);
            try {
                n1 = scan.nextDouble();
                return n1;

            } catch (Exception e) {
                System.out.println("\nInvalid Input! ");
                scan.nextLine();
            }

        }

    }

}