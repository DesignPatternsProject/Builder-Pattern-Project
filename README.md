# Builder-Pattern-Project
## Introduction
In modern systems, creating customized objects like meals can become complex due to multiple user preferences such as type, size, drinks, and extras.
## Problem Analysis
Creating meal objects using traditional constructors leads to long parameter lists, making the code hard to read, maintain, and extend.
## Why Builder Pattern?
The Builder Pattern allows constructing objects step by step, improving flexibility and code readability. It also makes it easier to create different meal variations without modifying existing code.
## UML Diagram
<img width="1004" height="725" alt="Screenshot 2026-04-15 113139" src="https://github.com/user-attachments/assets/fd836689-380e-4c4a-b283-096d90631078" />
## UML Design Explanation

The UML diagram represents the structure of the system using the Builder Design Pattern. It illustrates how different classes collaborate to construct a meal object step by step.

### Classes Description

* **Meal (Product):**
  Represents the final object that contains the meal details such as type, size, extras, and drink. It provides setter methods to assign values and a method to display the meal.

* **MealBuilder (Builder):**
  Responsible for constructing the Meal object step by step. It uses method chaining to set different meal attributes and finally returns the complete object using the build() method.

* **MealDirector (Director):**
  Controls the construction process by defining specific meal configurations such as Burger and Pizza. It uses the MealBuilder to create predefined meal objects.

* **Main (Client):**
  Acts as the entry point of the application. It interacts with the MealDirector to create and display the final meal.

---

### Relationships

* The **Main** class depends on the **MealDirector** (dependency relationship – dashed arrow).
* The **MealDirector** uses the **MealBuilder** to construct meal objects (dependency relationship – dashed arrow).
* The **MealBuilder** creates and modifies the **Meal** object (association relationship – solid line).

---

### Design Justification

The Builder Design Pattern is used to simplify the creation of complex objects such as meals with multiple customizable options. Instead of using a constructor with many parameters, the object is built step by step. This improves readability, flexibility, and maintainability, and allows easy creation of different meal variations without modifying existing code.



## Classes Overview

| Class        | Role     |
| ------------ | -------- |
| Meal         | Product  |
| MealBuilder  | Builder  |
| MealDirector | Director |
| Main         | Client   |

## Usage Example

```java
public class Main {
    public static void main(String[] args) {
        MealDirector director = new MealDirector();
        Meal meal = director.makeBurgerMeal();
        meal.displayMeal();
    }
}
```

## Builder Example

```java
Meal meal = new MealBuilder()
    .setType("Burger")
    .setSize("Large")
    .setExtras("Cheese")
    .setDrink("Cola")
    .build();
```

## Output

 Meal Details 
 
Type: Burger

Size: Large

Extras: Cheese

Drink: Cola
#### 👥 Team Members & Responsibilities

| Name          |  Responsibilities                     |
| -----------   |  ------------------------------------ |
| Asmaa Elaywi  |  Team Leader, GitHub Manager & README & UML diagram |
| Bylasan      |Presentation & Media Specialist        |
| Fatima alzhraa Aljnaidah  | Lead Developer & Technical Presenter        |
|Ruba Alkum     | System Analyst & Concept Presenter |

