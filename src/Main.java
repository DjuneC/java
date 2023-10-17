import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int firstRandomNumber = random.nextInt(10);
        System.out.println(firstRandomNumber);
    }
}
