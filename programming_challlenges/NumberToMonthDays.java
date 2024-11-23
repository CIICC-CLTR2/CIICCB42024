package programming_challlenges;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberToMonthDays {

    int month;
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(new NumberToMonthDays().getMonth());
    }

    public String getMonth(){
       
        StringBuilder stringMonth = new StringBuilder();
       
        if(isValidinput()){
      
            switch (month) {
                case 1:  stringMonth.append(month).append(" is for January that has 31 days");break;
                case 2:  stringMonth.append(month).append(" is for February that has 28 days");break;
                case 3:  stringMonth.append(month).append(" is for March that has 31 days");break;
                case 4:  stringMonth.append(month).append(" is for Aoril that has 30 days");break;
                case 5:  stringMonth.append(month).append(" is for May that has 31 days");break;
                case 6:  stringMonth.append(month).append(" is for June that has 30 days");break;
                case 7:  stringMonth.append(month).append(" is for July that has 31 days");break;
                case 8:  stringMonth.append(month).append(" is for August that has 31 days");break;
                case 9:  stringMonth.append(month).append(" is for September that has 30 days");break;
                case 10:  stringMonth.append(month).append(" is for October that has 31 days");break;
                case 11:  stringMonth.append(month).append(" is for November that has 30 days");break;
                case 12:  stringMonth.append(month).append(" is for December that has 31 days");break;
                default: stringMonth.append("Invalid Input");break    ;
                }
                scan.close();
        }
             return (stringMonth+("\n").toString();
    }


    public boolean isValidinput(){
         while (true) {
            System.out.print("\nEnter Number Month only [1-12]: ");
            try {
                month =scan.nextInt() ;
                return true;
                // if(month >0 && month<13){return true;}
         
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Accepting Integer only!");
                scan.nextLine();
            }

        }

    }
}
