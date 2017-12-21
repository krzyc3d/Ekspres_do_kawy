package zadanie1;

/*
1. Nasz barista potrafi robić następujące rodzaje kawy:
a. Espresso – składa się z kawy, 30ml wody
b. Latte – składa się z kawy, 100ml wody, spienionego mleka oraz opcjonalnie cukru.
c. Cappuccino – składa się z kawy, 30ml wody, mleka, spienionego mleka oraz opcjonalnie cukru
d. Amerykanka – składa się z kawy, 100ml wody i opcjonalnie cukru
 */
public class Main {

    public static void main(String[] args)throws CoffieGrinderExeption,MilkFrotherExeption {
        AdvancedCoffeeMachine advancedCoffeeMachine = new AdvancedCoffeeMachine();
        CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
        MilkFrother milkFrother= new MilkFrother();


        makeEspresso(advancedCoffeeMachine, coffeeGrinder);

        makeLatte(advancedCoffeeMachine, coffeeGrinder, milkFrother);

        makeAmericana(advancedCoffeeMachine, coffeeGrinder);

        coffeeGrinder.empty();

        makeCappuccino(advancedCoffeeMachine, coffeeGrinder, milkFrother);


    }

    private static void makeCappuccino(AdvancedCoffeeMachine advancedCoffeeMachine, CoffeeGrinder coffeeGrinder, MilkFrother milkFrother) throws CoffieGrinderExeption, MilkFrotherExeption {
        advancedCoffeeMachine.addIngredient(coffeeGrinder.grind(new CoffieBean()));
        advancedCoffeeMachine.addIngredient(new WatherIngredient(30));
        advancedCoffeeMachine.addIngredient(milkFrother.froth(new MilkIngredient()));
        System.out.println(advancedCoffeeMachine.makeCoffeeBeerage());
    }

    private static void makeAmericana(AdvancedCoffeeMachine advancedCoffeeMachine, CoffeeGrinder coffeeGrinder) throws CoffieGrinderExeption {
        advancedCoffeeMachine.addIngredient(coffeeGrinder.grind(new CoffieBean()));
        advancedCoffeeMachine.addIngredient(new WatherIngredient(100));
        ;
        System.out.println(advancedCoffeeMachine.makeCoffeeBeerage());
    }

    private static void makeLatte(AdvancedCoffeeMachine advancedCoffeeMachine, CoffeeGrinder coffeeGrinder, MilkFrother milkFrother) throws CoffieGrinderExeption, MilkFrotherExeption {
        advancedCoffeeMachine.addIngredient(coffeeGrinder.grind(new CoffieBean()));
        advancedCoffeeMachine.addIngredient(new WatherIngredient(100));
        advancedCoffeeMachine.addIngredient(milkFrother.froth(new MilkIngredient()));
        System.out.println(advancedCoffeeMachine.makeCoffeeBeerage());
    }

    private static void makeEspresso(AdvancedCoffeeMachine advancedCoffeeMachine, CoffeeGrinder coffeeGrinder) throws CoffieGrinderExeption {
        advancedCoffeeMachine.addIngredient(coffeeGrinder.grind(new CoffieBean()));
        advancedCoffeeMachine.addIngredient(new WatherIngredient(30));
        System.out.println(advancedCoffeeMachine.makeCoffeeBeerage());
    }


}
