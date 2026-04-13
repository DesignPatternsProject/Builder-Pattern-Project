
package builder.pattrin;

public class Main {

   public static void main(String[] args) {

      Meal meal = new MealBuilder()
        .setType("Burger")
        .setSize("Large")
        .setExtras("Cheese")
        .setDrink("Cola")
        .build();

      meal.displayMeal();
    }

   

 


    
}
