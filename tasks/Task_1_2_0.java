package tasks;
import java.util.Arrays;

public class Task_1_2_0 {

    public static String sumOfComulativenumbers(double... numbers) {
        double sums = 0.0;
       
        for (double n : numbers) {
            double sum = 0.0;
         
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