package zadanie1;

public class SimpleCoffeeMachine {
    public static void main(String[] args) throws CoffieGrinderExeption {

        makeEspresso();
    }

    public static CoffeeBeverage makeEspresso() throws CoffieGrinderExeption {
        CoffeeBeverage coffeeBeverage = new CoffeeBeverage();
        coffeeBeverage.addIngredient(new WatherIngredient(30));
        CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
        try {
            coffeeBeverage.addIngredient(coffeeGrinder.grind(new CoffieBean()));
        } catch (CoffieGrinderExeption coffieGrinderExeption) {
            coffieGrinderExeption.printStackTrace();
        }
        return coffeeBeverage;

    }
}
