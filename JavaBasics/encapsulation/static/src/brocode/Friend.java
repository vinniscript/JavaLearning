package brocode;

public class Friend {

    String name;
    static int numberOfFriends; // This variable can be accessed by any other class on the package. You can see she in the Main class, just typing "System.out.println(Friend.numberOfFriends)", but not the "name" one.
    // In a static context you can accumulate the numbers of objects you have of this class, if not static, it will be always 1, because will be created a copy of the variable to each object, but individually, never gaining a new value
    // Note that static variables are shared among all instances (objects) of the class, so modifying the variable in one instance will affect its value in all other instances.


//    int numberOfFriends; // remove the comment for you to see what happen when you try to access Friend.numberOfFriends.
    Friend(String name){
        this.name = name;
        numberOfFriends++; // Every time there is a new object created of this generator class, out variable will be increased by 1
    }

    static public void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends.");
    }

}
