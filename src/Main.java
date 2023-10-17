import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as its condition remains true

        Scanner sc = new Scanner(System.in);
        String name = "";

        do{
            System.out.println("What is your name ? ");
            name = sc.nextLine();
        }while(name.isBlank());

        System.out.println("Hello " + name);
    }
}
