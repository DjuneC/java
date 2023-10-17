import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // nested loops = a loop inside a loop

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a # of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter a # of columns: ");
        int columns = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the symbol you want to display: ");
        char symbol = sc.next().charAt(0);

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
