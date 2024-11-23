package programming_challlenges;
import java.util.Scanner;
public class Sum_Of_Input {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double num1,num2,num3,sum=0.0;

        System.out.print("\nEnter Num1: ");
        num1 = scan.nextDouble();
        System.out.print("Enter Num2: ");
        num2 = scan.nextDouble();
        System.out.print("Enter Num3: ");
        num3 = scan.nextDouble();
        sum =num1 + num2 + num3;
        System.out.println("\nThe sum of: \n\t      Num1: " + num1 +"\n\t      Num2: "+num2 + "\n\t    + Num3: " +num3 +"\n\t   -------------" +"\n\t            " + sum+"\n");
    }
    
}
