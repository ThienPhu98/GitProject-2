package Week2.AbstractClassAndInterface.Pack1;

import Week2.AbstractClassAndInterface.Pack1.animal.Animal;
import Week2.AbstractClassAndInterface.Pack1.animal.Chicken;
import Week2.AbstractClassAndInterface.Pack1.animal.Tiger;
import Week2.AbstractClassAndInterface.Pack1.edible.Edible;
import Week2.AbstractClassAndInterface.Pack1.fruit.Fruit;
import Week2.AbstractClassAndInterface.Pack1.fruit.Apple;
import Week2.AbstractClassAndInterface.Pack1.fruit.Orange;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
