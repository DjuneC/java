import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<String>();

        bakeryList.add("pasta");
        bakeryList.add("garlic breads");
        bakeryList.add("donuts");

        ArrayList<String> productsList = new ArrayList<String>();

        productsList.add("tomatoes");
        productsList.add("zucchini");
        productsList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<String>();

        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(productsList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(0).get(2));
    }
}
