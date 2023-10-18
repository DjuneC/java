import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // for-each = traversing technique to iterate through the elements in an array/collection
        // less steps, more readable
        // less flexible

        String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animalsArrayList = new ArrayList<String>();

        animalsArrayList.add("cat");
        animalsArrayList.add("dog");
        animalsArrayList.add("rat");
        animalsArrayList.add("bird");

        for(String animal: animals){
            System.out.println(animal.toUpperCase());
        }

        for(String animal: animalsArrayList){
            System.out.println(animal.toUpperCase());
        }
    }
}
