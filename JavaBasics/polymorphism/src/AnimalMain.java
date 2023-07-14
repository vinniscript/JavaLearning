public class AnimalMain {
    public static void main(String[] args) {

        // Our main will work for us to instantiate our classes and call it´s methods
        AnimalSounds animal = new AnimalSounds(); // Our super class
        Cow cow = new Cow(); // And your subclasses (who is extending the AnimalSounds).
        Dog dog = new Dog();

        animal.sound(); // Our father class -> "Animals make different sounds"

        cow.sound(); // With the same method name, we are just replacing the method existing, but this one returning a different string. -> "The cow says: moo moo"

        dog.sound(); // The Dog class has 2 methods with the exactly same name "sound", but one of them have a parameter to be passed on your call, which will return a different result if a string is passed. -> "The dog says: woof woof"
        dog.sound("angry demais"); // -> "The dog says: *demoniac sounds*, and whisperings of the souls he ate coming all along the room"

        // This is polymorphism.

        // Polymorphism is good for some reasons, like the allowing the coder to reuse a code pre-written without having to copy this again in a different context.
        // But it makes harder to read your code.
    }
}
