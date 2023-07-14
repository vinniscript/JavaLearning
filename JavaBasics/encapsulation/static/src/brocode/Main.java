package brocode;

public class Main {
    public static void main(String[] args) {
        float a = 1.55F;
//        Static = modifier. A single copy of a variabel/method is created and shared.
//                  The class "owns" the static member.

        Friend friend1 = new Friend("Spongebob"); // Without the static keyword, it's being like every object of the class has its single copy of the value of the static variable.
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        System.out.println(Friend.numberOfFriends); //The best practice to work with a static member, but only works if the static is declared.
        System.out.println(friend1.numberOfFriends); // It's possible to call a static member like this, but not recommended.
        System.out.println(friend2.numberOfFriends);
        // it works that way because the 'static' keyword on the beginning of the declaration of the variable makes that statement be accessible by all the class. If you try to remove the static word, you're going to have an error.
        // it´s like when you declare something that is static, you are creating a global copy of that thing, which any object of that class will have access to its value

        Friend.displayFriends(); // We cannot do this if our method is not static. If it's only defined like 'public void' you would need to create an object of it, so then you would be able to call its methods.

        int arrendondacao = Math.round(a); // This is a static method of java. That's why you can just summon it in the middle of your code without defining anything else.
        System.out.println(arrendondacao);
        // That's the basics of the static method.
    }
}
