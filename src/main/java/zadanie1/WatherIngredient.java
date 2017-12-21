package zadanie1;

public class WatherIngredient extends CoffeeIngredient {
    private int millitersOfWather;

    public void setMillitersOfWather(int millitersOfWather) {
        this.millitersOfWather = millitersOfWather;
    }

    public WatherIngredient(int millitersOfWather) {
        this.millitersOfWather = millitersOfWather;
    }

    @Override
    public String toString() {
        return "WatherIngredient{" +
                "millitersOfWather=" + millitersOfWather +
                '}';
    }
}
