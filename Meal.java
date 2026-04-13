
package builder.pattrin;
public class Meal {
   
    private String type;
    private String size;
    private String extras;
    private String drink;

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void displayMeal() {
        System.out.println("---- Meal Details ----");
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Extras: " + extras);
        System.out.println("Drink: " + drink);
    }
}