
package builder.pattrin;

public class Main {

   public static void main(String[] args) {

        MealDirector director = new MealDirector();

        Meal meal = director.makeBurgerMeal();

        meal.displayMeal();
    }

    
}
