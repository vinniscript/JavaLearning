public class Dog extends AnimalSounds{
    public void sound(){
        System.out.println("The dog says: woof woof");
    }

    public void sound(String angry){
        System.out.println("The dog says: *demoniac sounds*, and whisperings of the souls he ate coming all along the room");
        super.sound();
    }
}
