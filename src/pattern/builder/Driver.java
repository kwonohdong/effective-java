package pattern.builder;

public class Driver {
    public static void main(String[] args) {
        NutritionFacts cocacola = new NutritionFacts.Builder(240, 8).calories(10).sodium(20).carbohydrate(55).build();
        System.out.println(cocacola.toString());

        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.MEDIUM).addTopping(Pizza.Topping.HAM).addTopping(Pizza.Topping.MUSHROOM).build();
        System.out.println(nyPizza.toString());

        KPizza kPizza = new KPizza.Builder().addTopping(Pizza.Topping.ONION).sauceInside().build();
        System.out.println(kPizza.toString());
    }
}
