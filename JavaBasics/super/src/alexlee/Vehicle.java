package alexlee;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor.");
    }
            // Polymorphism
    Vehicle(int maxSpeed) {
        System.out.println("Vehicle constructor.");
        this.maxSpeed = maxSpeed;
    }

    int maxSpeed = 120;

    public void vroom() {
        System.out.println("Vroom vroom");
    }
}


class Car extends Vehicle { // It's only possible to use super keyword when extending a class. It's an inheritance keyword.
    Car() {
//        super(); // This goes to the super constructor (the Vehicle constructor), but not necessary. If you are extending a class with a constructor, its constructor will be called no matter what.

        System.out.println("Car constructor"); // Since by creating an object in Main, all inside this block code will be done.

    }

    public void display() {
        System.out.println(maxSpeed); // To show the current class variable (Car).
    }

    public void displayS() {  // When super is typed it turns purple, witch means that's a keyword in java.
        System.out.println(super.maxSpeed); // To show the super class variable (Vehicle).
    }

    public void vroom() {
        System.out.println("SKUUURT"); // It's prioritizing this output because the "vroom" method in Car class; witch is the one who we are working in the main class. If we wanted the vroom output of the class Vehicle, we should use the super keyword.
    }

    public void vroomS() {
        super.vroom();
    }

}


