package Week5.BehavioralDesignPattern.Pack2;

public class Test {
    public static void main(String[] args) {

        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();

        System.out.println("==================================");

        Meal meal2 = new TacoMeal();
        meal2.doMeal();

    }
}
