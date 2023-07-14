package alexlee;

// Abstraction is to make sure that every entity instantiated of the class has the same methods and declarations. Making able to customize the methods separately later, like a dog that poops or bark a little differently, you can just reconfigure the method.
// An abstract class indicates what the class has to have. It organizes the concept of the class we are creating. Like a dog, we all know what dogs do and have, so, for a subclass of Dog class, like the Chihuahua one, he makes everything a dog does, obviously.
// The abstraction defines the structure and behaviors of the class who's going to inherit it.

abstract class Dog { // The same syntax used to create a class, but before typing "class" we input the keyword "abstract."
//    {} - Curly braces
//    () - brackets or parentheses
    String breed;


    //     Implemented methods are methods that have their code defined within the class. There's no use in doing this if you're searching to use an abstract class
    public void bark() {

        System.out.println("Bark!");
    }

    //    Abstracted methods are methods that are declared but not implemented within the abstract class. It's done within the class that is calling it.
    public abstract void poop(); // That's the idea of the "abstract", the idea of the method exists, but when we call him, the code doesn't know what to do, then we write what we want.
    //    The purpose of declaring a method as abstract is to indicate its existence in the class hierarchy, but the implementation is left to the subclasses that inherit from the abstract class.
}

class Chihuahua extends Dog { // Extending the class makes the abstracted class methods now usable, because, when extending a class, you're inheriting its methods to your new subclass. Dog is the superclass of the class you extended of.
    public void poop() { //
        System.out.println("Dog pooped!");
    }

}

public class AbstractTutorial {
    public static void main(String[] args) {
//        Dog dog = new Dog(); // Abstract classes cannot be instantiated. Abstract classes are used to help create resource classes (classes that we use commonly)
//        dog.bark();

        Chihuahua chihuahua = new Chihuahua();
        chihuahua.bark(); // Not a method inside the Chihuahua class, but a method of its father class.
        System.out.println(chihuahua.breed); // You can also do this.
        chihuahua.poop();

    }
}

