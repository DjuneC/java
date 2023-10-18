
public class Main {
    public static void main(String[] args) {
        // constructor = special method that is called when an object is instantiated (created)
        Human human = new Human("Ces", 24, 50);
        Human human1 = new Human("Ceze", 22, 70);

        System.out.println(human1.name);
        human.drink();
    }
}
