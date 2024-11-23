package programming_challlenges;
import java.util.Scanner;

public class String_Method {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input ="";

        System.out.print("\nEnter String: ");
        input = scan.nextLine();

        System.out.println(input.length() + " - is the length of the string " + input);
        System.out.println(input.toUpperCase() + " - is the UPPERCASE of the string " + input);
        System.out.println(input.toLowerCase() + " - is the lowercase of the string " + input);
        System.out.println(input.charAt(0) + " - is the first character of the string " + input);
        System.out.println(input.charAt(input.length()-1) + " - is the last character of the string " + input);
        System.out.println(input.substring(1, 4) + " - is the substring of the word " + input +" from the second character to fifth character of the string\n");

    }
}
