package programming_challlenges;

import java.util.Scanner;

public class NumberToDayWeek {

    public static void main(String[] args) {
     
        System.out.println(new NumberToDayWeek().toDay());

    }

    public String toDay() {
        String day = "";
        int n = new NumberToDayWeek().userPrompt();
 
        if ((isValidChoice(n))) {
            switch (n) {
                case 1: day = n + " is equivalent to Monday\n"; break;
                case 2: day = n + " is equivalent to Tuesday\n"; break;
                case 3: day = n + " is equivalent to Wednesday\n"; break;
                case 4: day = n + " is equivalent to Thursday\n"; break;
                case 5: day = n + " is equivalent to Friday\n"; break;
                case 6: day = n + " is equivalent to Saturday\n"; break;
                case 7: day = n + " is equivalent to Sunday\n"; break;
                default: day =  "You entered invalid input\n"; break;
            }
        }
        return day;
    }

    public int userPrompt(){
        Scanner scan = new Scanner(System.in);
        double number=0.0;
        System.out.print("\nEnter number [1 t0 7] to convert into Day in a Week: ");
    
        try {number = scan.nextDouble();return (int)number;}
        catch (Exception e) {return (int)number;}
     }

    public static boolean isValidChoice(int num) {

        if ( num <= 7 ||  num >= 1)
           return true;
           return false;
    }
}
