package alexlee;

class Main {
    public static void main(String[] args) {
        Car c = new Car(); // Default constructor
        c.display(); // Car display
        c.displayS(); // Vehicle display

        c.vroom(); // Car SKUUURT
        c.vroomS(); // Vehicle Vroom vroom

        // What super is doing there is referencing the variables and methods of the father class, the class who got extended by others, in this case, the Vehicle class.
    }
}
