package Week2.CleanCodeAndRefactoring.Pack3;
import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Count Cylinder: ");
        System.out.print("\nEnter radius for Cylinder: ");
        int radius = scanner.nextInt();
        System.out.print("\nEnter height for Cylinder: ");
        int height = scanner.nextInt();

        System.out.print("\n=================================================");
        System.out.print("\nCylinder has Volume = " + Cylinder.getVolume(radius, height));
    }

}
