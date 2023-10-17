
public class Main {
    public static void main(String[] args) {
        // String = a reference data type that can store one or more characters
        // reference data type have access to useful methods

        String name = "Cesar";

//        boolean result = name.equals("Cesar");
//        int result = name.length();
//        char result = name.charAt(0);
//        int result = name.indexOf("B");
//        boolean result = name.isEmpty();
//        String result = name.toUpperCase();
//        String result = name.toLowerCase();
//        String result = name.trim();
        String result = name.replace("s", "z");
        System.out.println(result);
    }
}
