package Week5.DesignPatterns.Pack1;

public class AnimalFactory {
    public Animal getAnimal(String type) {
        if("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
