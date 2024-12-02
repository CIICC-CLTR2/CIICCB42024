package tasks;
import java.util.Arrays;

public class Task120 {

    public static String sumOfComulativenumbers(int... numbers) {
        int sums = 0;
       
        for (int n : numbers) {
            int sum = 0;
         
            for (int x = 1; x < n + x; x++, n--) {
                sum += n;
            }
            sums += sum;
        }
     
        return "(" + Arrays.toString(numbers) +") is: " +(sums);
    }

    public static void main(String[] args) {

        System.out.println("\nThe Comulative Sum of All Parameters of "+sumOfComulativenumbers(4, 5, 10)+"\n");

    }
}