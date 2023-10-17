import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         Logical operators = used to connect two or more expressions
         && = (AND) both conditions must be true
         || = (OR) either condition must be true
         ! = (NOT) reverses boolean value of condition
        */

        Scanner sc =  new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        char response = sc.next().charAt(0);

        if (response == 'q' || response == 'Q'){
            System.out.println("You quit the game");
        }
        else{
            System.out.println("You are still playing the game *pew pew*");
        }

    }
}
