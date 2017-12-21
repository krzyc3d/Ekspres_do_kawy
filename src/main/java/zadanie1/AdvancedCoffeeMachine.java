package zadanie1;

import java.awt.*;

public class AdvancedCoffeeMachine {
   private CoffeeBeverage coffeeBeverage = new CoffeeBeverage();

    public void addIngredient(CoffeeIngredient coffeeIngredient){
        coffeeBeverage.addIngredient(coffeeIngredient);
    }
    public CoffeeBeverage makeCoffeeBeerage(){
        CoffeeBeverage coffeeBeverage1 = coffeeBeverage;
        coffeeBeverage = new CoffeeBeverage();
        return coffeeBeverage1;

    }
}
