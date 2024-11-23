package programming_challlenges;

public class PalindromeStringBuilder {

    public static void main(String[] args) {

        String input = "nasabayabasan";

        System.out.println(new PalindromeStringBuilder().checkPalindrome(input));

    }

    public String checkPalindrome(String input) {

        if (!isPalindrome(input.replaceAll("\\s+", "")))  
            return input + " is not Palindrome";
            return input + " is Palindrome";
    }

    public boolean isPalindrome(String input) {

        StringBuilder word = new StringBuilder(input).reverse();
     
        if (!input.equals(word.toString())) 
            return false;
            return true;
    }

}