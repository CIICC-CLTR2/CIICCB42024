package programming_challlenges;

import java.util.Scanner;

public class LamdasPercentage {

    public interface Discounts {

        double getDiscountedPrice(double price, double dis);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        double regPrice = 0.0;
        double discount = 0.0;
        double result=0.0;

        System.out.print("Enter Price to be discounted: ");
        regPrice = scan.nextDouble();
            
        System.out.print("Enter discount of [10, 20, 50] only:  ");
         discount = scan.nextDouble();
    
        Discounts discounts = (p, d) -> {
            double newPrice = 0.0;

                if (d == 10) 
                {newPrice = p * d/100;}
                else if (d == 20)
                {newPrice = p * d/100;}
                else if (d == 50)
                {newPrice = p * d/100;}
            
                return newPrice;

        };
 
        System.out.println((result=discounts.getDiscountedPrice(regPrice, discount))==0.0 ? "invalid input":result);
    
 
    }
}
