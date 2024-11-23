package programming_challlenges;
import java.util.Scanner;

public class String_Builder_10_Characters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input="";
        int occurance=0;
       
        System.out.print("\nEnter String atleast 10 Characters: ");
        input = scan.nextLine();
     

        StringBuilder sbInput = new StringBuilder(input.toLowerCase());
        String temp2 = "";
        char temp;

        if(checkCharacterLength(input)){
            
            System.out.println("\n"+(sbInput.charAt(0)) +" - is The Fisrt index of the word: " + sbInput );
            System.out.println(sbInput.charAt(sbInput.length()-1) +" - is The Last index of the word: " + sbInput );
            System.out.println((occurance=sbInput.indexOf("a"))!= -1? occurance + " - is the index of first occurence of letter a of the word " + sbInput:"Occurence is not found");
            System.out.println(sbInput.substring(3, 6) +" - is the substring of  " + sbInput +" from index 3 to index 6");
            System.out.println(sbInput.append("123") +" - is the appended word with 123 string at the end of the word");
            System.out.println(sbInput.insert(4, "xyz") +"- has an inserted xyz at index 4");
            temp2 =sbInput.toString();
            System.out.println(sbInput.delete(2, 4)+" - has a deleted substring from index 2 to index 4 from the word: " + temp2);
           
            temp2 =sbInput.toString();
            temp = sbInput.charAt(8);
            sbInput.deleteCharAt(8);
           
            System.out.println(temp + " - character was deleted from the word " + temp2 + " at index 8 " );
            temp2 =sbInput.toString();
            System.out.println(sbInput.reverse().toString()+" - was reversed from the word: " + temp2 +"\n");

        }
        else{
            System.out.println("\nLess Than "+ input.length() + " number of characters are not acceptable\n");
        }

    }

    public static boolean checkCharacterLength(String input){
         
        return (input.length()>=10)?true:false;

    }
}
