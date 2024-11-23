package programming_challlenges;

public class Sum_Average_In_Array {

    public static void main(String[] args) {
        
        double[] numbers={1,2,3,4,5,6,7,8,9,10.1};
        double sum=0.0;
        double average=0.0;
    
        System.out.println();
        for(int x=0; x<numbers.length; x++){
    
            sum += numbers[x];
    
        }
        average = sum/numbers.length;
    
        System.out.println("The sum of numbers in array :" +  " is " +sum +"\n" +"The Average is: " + average +"\n");
   
    }

   
    
}
