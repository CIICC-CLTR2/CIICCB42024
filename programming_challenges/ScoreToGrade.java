package programming_challlenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreToGrade {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(new ScoreToGrade().getGradeequivalent("\nEnter Grade: "));

    }

    public String getGradeequivalent(String prompt){

      double grade =  getValidnumber(prompt);
       String msg="";
       
        if (grade <= 100 && grade >= 90){msg = "Your " + grade + " grade is eqivalent of A";}
        else if (grade <= 89 && grade >= 80){msg = "Your " + grade + " grade is eqivalent of B";}
        else if (grade <= 79 && grade >= 70){msg = "Your " + grade + " grade is eqivalent of C";}
        else if (grade <= 69 && grade >= 60){msg = "Your " + grade + " grade is eqivalent of D";}
        else if (grade < 60){msg = "Your " + grade + " grade is eqivalent of F";}
        else {msg= "Please Input Valid Grade";}
        return msg +"\n";   
    }
    public double getValidnumber(String prompt) {
         
        double grade = 0.0;

        while (true) {
            System.out.print(prompt);
            try {
                grade =scan.nextDouble() ;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Accepting Integer only!");
                scan.nextLine();
            }

        }

        return grade;

    }


    
}
