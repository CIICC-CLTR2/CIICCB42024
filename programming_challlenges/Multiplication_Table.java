package programming_challlenges;
public class Multiplication_Table {
    
    public static void main(String[] args) {
        
        System.out.println("\n\t\t\t\tMULTIPLICATION TABLE OF 10x10");
        for(int x=1; x<=10; x++){
            String row="";
            int product=0;
            for(int y=1; y<=10; y++){
                
                product = x*y;
                if(product<10){
                   row += "\t| "+x*y + " |";
                }
                else{
                    row += "\t| "+x*y + " |";
                }


            }
            System.out.println("\t------------------------------------------------------------------------------\n"+row.toString());
        }
        System.out.println("\t------------------------------------------------------------------------------\n");
    }
}
