package programming_challlenges;
import java.util.Scanner;

public class Count_Word_In_Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words;
        
        System.out.print("\nEnter a sentence: ");
        String input = scan.nextLine();

        System.out.println((words = new String[(input.split("\\s")).length]).length +" - is the word count in the word: " + input +"\n");

        scan.close();
    }
    
}
 