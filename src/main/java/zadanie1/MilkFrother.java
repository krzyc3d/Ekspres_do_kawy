package zadanie1;

import zadanie1.MilkFrotherExeption;
import zadanie1.MilkIngredient;

public class MilkFrother {
    public FoamedMilkIngredient froth(MilkIngredient milkIngredient) throws MilkFrotherExeption {
        if (Math.random()>0.8){
            throw new MilkFrotherExeption("Milk");
        }
        return new FoamedMilkIngredient();
    }
}
