package zadanie1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeBeverage {
    private List<CoffeeIngredient> ingredientList=new ArrayList<CoffeeIngredient>();


    public void setIngredientList(List<CoffeeIngredient> ingredientList) {
        this.ingredientList = ingredientList;

    }

    public List<CoffeeIngredient> getIngredientList() {
        return ingredientList;

    }

//    public boolean add(CoffeeIngredient coffeeIngredient) {
//        return ingredientList.add(coffeeIngredient);
//    }


    @Override
    public String toString() {
        for (CoffeeIngredient coffeeIngredient:ingredientList
                ) {
            System.out.println(coffeeIngredient); };
        return "";
    }

    public void addIngredient(CoffeeIngredient coffeeIngredient) {
        ingredientList.add(coffeeIngredient);
    }
}
