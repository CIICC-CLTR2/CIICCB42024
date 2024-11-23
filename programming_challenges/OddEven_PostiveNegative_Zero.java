package programming_challlenges;
 
import java.util.Scanner;

public class OddEven_PostiveNegative_Zero {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = 0.0;

        System.out.print(checkNumber("\nEnter Number: ", scan ,num));
    }


    public static String checkNumber(String prompt, Scanner scan, double number){
        System.out.print(prompt);
            try {
                number = scan.nextDouble();
                return (number==0)? (int) number +" is Zero even Number\n":( (number<0)? number + " is Negative" +  oddEven(number): number + " is Postive" + oddEven(number))+"\n";     
            } 
            catch (Exception e) {
                return ("Invalid Input, This program accepts NUMBERS ONLY!\n\n");      
            }
   
    }
    public static String oddEven(double number){
        int num=0;
        num = (int) number;
        return (num%2==0)?  " Even Number":  " odd Number";
    }
 
}
