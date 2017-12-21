package zadanie1;

import zadanie1.CoffeeBeverage;
import zadanie1.CoffieBean;
import zadanie1.CoffieGrinderExeption;

public class CoffeeGrinder {
    private int wasteContainerCount = 0;

    public int empty() {
        wasteContainerCount = 0;
        return wasteContainerCount;
    }

    public CoffiePowderIngredient grind(CoffieBean coffieBean) throws CoffieGrinderExeption {
        if (wasteContainerCount > 3) {
            throw new CoffieGrinderExeption("Container is full");
        } else
             wasteContainerCount++;
        System.out.println("Enjoy your coffee");
        return new CoffiePowderIngredient();
    }

    @Override
    public String toString() {
        return "CoffeeGrinder{" +
                "wasteContainerCount=" + wasteContainerCount +
                '}';
    }
}
