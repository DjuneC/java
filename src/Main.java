import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // exception = an event that occurs during the execution of a program that,
        //             disrupts the normal flow of instructions

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number to divide: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter a number to divide by: ");
            int secondNumber = scanner.nextInt();

            int result = firstNumber / secondNumber;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("It is forbidden to divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("You have entered some invalid input (Number only)");
        }
    }
}
