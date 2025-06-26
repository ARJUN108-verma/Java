// Define a class named Car
class Car {
    // Properties (data members)
    String color;
    String model;
    int year;

    // Method (function inside a class)
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();

        // Assign values to the object
        myCar.model = "Toyota Corolla";
        myCar.color = "Red";
        myCar.year = 2022;

        // Call method using the object
        myCar.displayDetails();
    }
}
