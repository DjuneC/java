
public class Main {
    public static void main(String[] args) {
        /*
         Logical operators = used to connect two or more expressions
         && = (AND) both conditions must be true
         || = (OR) either condition must be true
         ! = (NOT) reverses boolean value of condition
        */

        byte temperature = 25;

        if (temperature > 30) {
            System.out.println("It is hot outside");
        } else if (temperature >= 20 && temperature <=30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("it is cold outside");
        }

    }
}
