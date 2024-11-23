package activities.tasksheets;

public class Task_1_1_2 {

    Task_1_1_2() {

    }

    public static void compoundAssignment(int result) {
        // result is now 3
        System.out.println(result);

        // result is now 2
        System.out.println(result -= 1);

        // result is now 4
        System.out.println(result *= 2);

        // result is now 2
        System.out.println(result /= 2);

        // result is now 10
        System.out.println(result += 8);

        // result is now 3
        System.out.println(result %= 7);
    }

    public static void main(String[] args) {

        compoundAssignment(1 + 2); /*
                                    * pass the value for compoundAssignment method
                                    * and print result using compound operators
                                    */

    }
}
