
public class Main {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member

        Friend friend = new Friend("Kass");
        Friend friend1 = new Friend("Patricia");
//        System.out.println(Friend.numberOfFriends);
        Friend.displayAmountOfFriends();
    }
}
