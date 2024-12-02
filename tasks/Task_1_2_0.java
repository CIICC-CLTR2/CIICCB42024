package tasks;

public class Task_1_2_0 {

    public static double sumOfComulativenumbers(double... numbers) {
        double sums = 0.0;
        for (double n : numbers) {
            double sum = 0.0;
            // double num=n;
            for (int x = 1; x < n + x; x++, n--) {
                sum += n;
                // System.out.println("The Comulative sum of: "+ num +" - " + n + " is: "+sum);
            }
            sums += sum;
            // System.out.println("Total sum is: " +sums);
        }
        // System.out.println(sums);
        return sums;
    }

    public static void main(String[] args) {

        System.out.println("\nThe Comulative Sum of All Parameters is: "+sumOfComulativenumbers(4, 5, 10)+"\n");

    }
}