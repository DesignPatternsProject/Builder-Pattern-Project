
package builder.pattrin;

public class MealDirector {
    
    public Meal makeBurgerMeal() {
        return new MealBuilder()
                .setType("Burger")
                .setSize("Large")
                .setExtras("Cheese")
                .setDrink("Cola")
                .build();
    }

    public Meal makePizzaMeal() {
        return new MealBuilder()
                .setType("Pizza")
                .setSize("Medium")
                .setExtras("Olives")
                .setDrink("Juice")
                .build();
    }
}
