# Builder-Pattern-Project
## Introduction
In modern systems, creating customized objects like meals can become complex due to multiple user preferences such as type, size, drinks, and extras.
## Problem Analysis
Creating meal objects using traditional constructors leads to long parameter lists, making the code hard to read, maintain, and extend.
## Why Builder Pattern?
The Builder Pattern allows constructing objects step by step, improving flexibility and code readability. It also makes it easier to create different meal variations without modifying existing code.
## UML Diagram
<img width="1004" height="725" alt="Screenshot 2026-04-15 113139" src="https://github.com/user-attachments/assets/fd836689-380e-4c4a-b283-096d90631078" />

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

