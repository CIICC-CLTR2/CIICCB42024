package programming_challlenges;
import java.util.Scanner;
public class Multiplication_Table {
    
    public static void main(String[] args) {
        int productLenght=10;
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter Multiplication table length upto 10 only: ");
        // productLenght = scan.nextInt();

        System.out.println("\n\t\t\t\tMULTIPLICATION TABLE OF 10x10");
        for(int x=1; x<=productLenght; x++){
            String row="";
            int product=0;
            for(int y=1; y<=10; y++){
                product = x*y;
                if(product<10){
                   row += "\t|  "+x*y + " |";
                }
                else{
                    row += "\t| "+x*y + " |";
                }
            }
            System.out.println("\t------------------------------------------------------------------------------\n"+row.toString());
        }
            System.out.println("\t------------------------------------------------------------------------------\n");
    }
}
