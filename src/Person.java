public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name: " + this.name + "\n" + "Age: " + this.age + " years old";
    }
}
