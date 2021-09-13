package Week1.MoreInJava.AccessModifier2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Jarvis");
        student.setClasses("H20");

        System.out.println("Name of student: " + student.name);
        System.out.println("Class of student: " + student.classes);
    }
}
