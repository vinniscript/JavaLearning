public class Cow extends AnimalSounds{
    // Whe can use the @Override method too, just to make clear that it is an existing method of the superclass, and make clear out readability of the code.
    public void sound(){ // If you comment this method, in the main will have no error at all. The method will be called anyway, but will be the AnimalSounds (the Superclass) one who will be called.
        System.out.println("The cow says: moo moo");

    }
}
