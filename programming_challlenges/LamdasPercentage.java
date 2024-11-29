package programming_challlenges;

public class LamdasPercentage {
    
 
public interface Discounts {

    double getDiscountedPrice(double price,double dis);
    
}
 
    public static void main(String[] args) {
        // Original price
        double regPrice = 200.0;
        double ten_p =.10;
        double twen_p =.20;
        double fif_p =.50;
        double discount=0.0;

        Discounts discounts = (p, d) -> {
            double a =0.0;
            if(d == 10){
                a= regPrice * .10;
            }
            else if(d == 20){
                a= regPrice * .20;
            }
            else if(d == 50){
                a= regPrice * .50;
            }

            
                        return a;
         
        };

        System.out.println(discounts.getDiscountedPrice(regPrice, 10));
        System.out.println(discounts.getDiscountedPrice(regPrice, 20));
        System.out.println(discounts.getDiscountedPrice(regPrice, 50));

        // Discounts discount_of_10 = (price ,a ) -> {price * .10 , price * .20} ;
     
        // System.out.println(discount_of_10.getDiscountedPrice(prices, 100));

        // Discounts discount_of_20 = (p) -> p * 0.20;   
        // Discounts discount_of_50 = (p) -> p * 0.50;  

        // Applying discounts
        // double priceAfter10Percent = discount_of_10.getDiscount(price);
       

        // Printing results
        // System.out.println("Original price: " + pricse);
        // System.out.println("Price after 10% discount: " + discount_of_10.getDiscount(prices));
         
    }
}
