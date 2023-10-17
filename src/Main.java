import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side x: ");
        float sideX = sc.nextFloat();

        System.out.println("Enter side y: ");
        float sideY = sc.nextFloat();

        float result = (float) Math.sqrt((sideX * sideX) + (sideY * sideY));

        System.out.println("The hypotenuse of the triangle is: " + result);

        sc.close();
    }
}
