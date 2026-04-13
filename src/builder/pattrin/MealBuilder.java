
package builder.pattrin;

public class MealBuilder {
    
    private Meal meal;

    public MealBuilder() {
        meal = new Meal();
    }

    public MealBuilder setType(String type) {
        meal.setType(type);
        return this;
    }

    public MealBuilder setSize(String size) {
        meal.setSize(size);
        return this;
    }

    public MealBuilder setExtras(String extras) {
        meal.setExtras(extras);
        return this;
    }

    public MealBuilder setDrink(String drink) {
        meal.setDrink(drink);
        return this;
    }

    public Meal build() {
        return meal;
    }
}