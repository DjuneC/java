public class Car {
    String make;
    String model;
    String color;
    int year;

    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String toString(){
        return "Brand: " + make + "\n" + "Model: " + model + "\n" + "Color: " + color + "\n" + "Released year: " + year;
    }
}
