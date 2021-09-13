package Week1.MoreInJava.AccessModifier2;

public class Student {
    String name = "John";
    String classes = "CO2";

    public Student() {
    }

    protected String setName(String name){
        this.name = name;
        return this.name;
    }

    protected String setClasses(String classes) {
        this.classes = classes;
        return this.classes;
    }

}
