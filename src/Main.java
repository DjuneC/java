
public class Main {
    public static void main(String[] args) {
        // super = keyword refers to the superclass (parent) of an object
        //         very similar to the "this" keyword

        Hero hero = new Hero("Batman", 42, "$$$");
        Hero hero1 = new Hero("Superman", 43, "Everything");

        System.out.println(hero);
    }
}
