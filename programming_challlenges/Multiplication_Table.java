package programming_challlenges;
import java.util.Scanner;
public class Multiplication_Table {
    
    public static void main(String[] args) {
   
        int productLenght=10;
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter Multiplication table length upto 10 only: ");
        // productLenght = scan.nextInt();

        System.out.print("\n\u001B[31m\t\t\t\tMULTIPLICATION TABLE OF 10x10\u001B[0m"+"\n");
        for(int x=1; x<=productLenght; x++){
            String row="";
            int product=0;
            for(int y=1; y<=10; y++){
                product = x*y;
                if(product<10){
                   row += "\t|\u001B[44m  \u001B[32m\u001B[1m"+x*y + " \u001B[0m|";
                }
                else{
                    row += "\t|\u001B[44m \u001B[32m\u001B[1m"+x*y + " \u001B[0m|";
                }
            }
            System.out.println("\t\u001B[33m------------------------------------------------------------------------------\u001B[0m\n"+row.toString());
        }
            System.out.println("\t------------------------------------------------------------------------------\n");
    }
}
