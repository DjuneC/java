import java.util.Random;

public class DiceRoller {
    DiceRoller() {
        Random random = new Random();
        int number = 0;
        roll();
    }

    // below code will produce an error, let's tackle how we can solve that and why that happen
    // We tend to access the random and the number variable that was declared inside the constructor
    // that means those values they are local to the constructor and not globally accessible in our code
    // We have multiple ways that we can fix this problem
    // 1- We can declare the variable outside the constructor, that will make them global variable
    // 2- Or we can keep them inside the constructor and pass them as argument to our function
    void roll(){
        number = random.nextInt(7);
        System.out.println(number);
    }
}
