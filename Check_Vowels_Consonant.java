 package programming_challlenges;

 public class Check_Vowels_Consonant{
    public static void main(String[] args) {
        
        String name = "LOvie Po";
        String []name2;
        name2 =name.split("//s");

        System.out.println();
       for(int x=0; x<name.length(); x++){
 
        if(name.charAt(x) == 'a' ||name.charAt(x) == 'A' 
        ||name.charAt(x) == 'e' ||name.charAt(x) == 'E' 
        ||name.charAt(x) == 'i' ||name.charAt(x) == 'I' 
        || name.charAt(x) == 'o' ||name.charAt(x) == 'O'
        ||name.charAt(x) == 'u' ||name.charAt(x) == 'U') 

        {System.out.println("The letter at index: " +x + " is " +name.charAt(x) +" of " +name + " is Vowel");}
        else{System.out.println("The letter at index: " +x + " is " +name.charAt(x) +" of " +name + " is Consonant");}

        }
    }
 }