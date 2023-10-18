import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon
        String name = "Cesar";
        byte age = 24;
        hello(name, age);
    }

    static void hello(String name, byte age){
        System.out.println("Hello " + name + " you are " + age + " years old");
    }
}
