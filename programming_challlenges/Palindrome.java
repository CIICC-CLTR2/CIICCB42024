package programming_challlenges;

 

public class Palindrome {
    public boolean checkPalindrome(String strInput) {

        for (int x = 0; x < strInput.length() / 2; x++) {
            if (strInput.charAt(x) != strInput.charAt(strInput.length() - x - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String input = "nasabayabasan";
        System.out.println(new Palindrome().checkPalindrome(input.trim()) ? input + " is Palindrome": input + " is not Palindrome");

    }

    // String input = "madam";
    // char charInput[] = { 'm', 'a', 'm' };

    // if (isPalindrome(input)) {
    // System.out.println("The " + input + " is Palindrome");
    // } else {
    // System.out.println("The " + input + " is not Palindrome");
    // }

    // if (isPalindrome(charInput)) {
    // System.out.println("The " + (new String(charInput)) + " is Palindrome");
    // } else {
    // System.out.println("The " + (new String(charInput)) + " is not Palindrome");
    // }

    // public static boolean isPalindrome(String str) {
    // int length = str.length();

    // for (int i = 0; i < length; i++) {
    // if (str.charAt(i) != str.charAt(length - i - 1)) {
    // return false;
    // }
    // }
    // return true;
    // }
    // public static boolean isPalindrome(String input) {
    // char arrayInput[] = input.toCharArray();
    // for (int x = 0; x < arrayInput.length; x++) {

    // if (arrayInput[x] != arrayInput[arrayInput.length - x - 1]) {
    // return false;
    // }

    // }
    // return true;

    // }

    // public static boolean isPalindrome(char input[]) {
    // int length = input.length;
    // for (int x = 0; x < length; x++) {

    // if (input[x] != input[input.length - x - 1]) {
    // return false;
    // }

    // }
    // return true;
    // }

}