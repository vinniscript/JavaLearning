package alexlee;

// Below is the syntax of how you create an interface.
interface WaterBottleInterface { // It's kinda a sketch of a class, they contain variables and methods that has to be called in your code when using an interface

    // Interfaces can contain variables, which are implicitly public, static, and final.
    String color = "Blue";

    // Interfaces define methods that must be implemented by classes that implement the interface.

    void fillUp(); // Interfaces have no curly brackets, you just type your method like you should, but it has no code block at all. We define that later.
    void porOut(); //  There is no need to use access modifiers like public or private in interfaces.

} // Interfaces provide a blueprint for classes to follow.

public class InterfacesRFun implements WaterBottleInterface {   // To use an interface, we have to use the "implements" key word after the nome of our class. Its makes mandatory the use of all the methods that our interface contains, or an error will pop.

    public static void main(String[] args) {
        System.out.println(color); // implementing an interface gives direct access to its variable and methods.

        InterfacesRFun ex = new InterfacesRFun();

        ex.fillUp();
    }

    @Override
    public void fillUp() { // I just pressed Alt + enter (IntelliJ) to make the IDE input all the methods of our interface automatically to this class (In this case, we just have the fillUp method, but it brings all the methods).
        System.out.println("It's filled"); // Like you can see, we defined what this method should do later than when we created he. In the interface, we just make clear what should have, but not how this should work, this part comes later in your class.
    }

    @Override
    public void porOut() {

    }

}
