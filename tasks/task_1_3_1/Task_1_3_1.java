package tasks.task_1_3_1;

public class Task_1_3_1 {
      public static void main(String[] args) {
 
      Afritada meal1 = new Afritada();
      Afritada meal2 = new Mechado();
      Afritada meal3 = new Menudo();  
      Afritada meal4 = new Caldereta();
    
      meal1.showIngredients();
      meal2.showIngredients();
      meal3.showIngredients();
      meal4.showIngredients();
    
  }
}
 
class Afritada {
      public void showIngredients() {
      String[] Ingredients = {"Tomato Sauce","Meat"};
      System.out.println("Afritada = " + java.util.Arrays.toString(Ingredients) +"🍲 \n");
  }
}

class Caldereta extends Afritada {
      public void showIngredients() {
      String[] Ingredients = {"Tomato Sauce","Meat","Potatoes & Carrots","Tomato Paste",
                            "Liver Spread","Raisins","Hotdog","Siling Labuyo","Cheese"};
      
      System.out.println("Caldereta = " + java.util.Arrays.toString(Ingredients) +"🍲 \n");
    }
}

 class Menudo extends Afritada {

      public void showIngredients(){
      String[] Ingredients = {"Oil","Potatoes","Carrot","Garlic","Onion",
                            "Pork","Liver","Tomato Sauce","Water",
                            "Sugar","Pepper","Raisins","Bell","Pepper","Salt", };

      System.out.println("Caldereta = " + java.util.Arrays.toString(Ingredients) +"🍲 \n"); 
    }
 }

 class Mechado extends Afritada {
    
    public void showIngredients(){
    String[] Ingredients = {"Beef","Onion",  "Garlic", "Tomato Sauce" ,"Banana Catsup",
                          "Star Anise", "Cinnamon Stick", "Dried Cloves", "Soysauce",
                          "Vinegar", "Bell Pepper", "Saging na Saba", "Salt & Pepper",};
   
      System.out.println("Caldereta = " + java.util.Arrays.toString(Ingredients) +"🍲 \n");
   } 
}
 