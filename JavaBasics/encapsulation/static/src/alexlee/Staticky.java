package alexlee;

public class Staticky {

    /*static*/int a = 0;
    static int c = 5;

    static int months = 12;

    public static void main(String[] args) {
        int b = 1; // a method variable.

        Staticky s= new Staticky(); // Creating an object of our main class alexlee.Staticky, so then we can finally use its variables and methods.

//        System.out.println(a); do not work, because the IDE says that cannot referer n non-static variable to a static context. But why?

        System.out.println(s.a); // This works, but is ugly and not a decent way to do it.
        // Static key-word came to make the coders life easier, making no mandatory what we made above, only using "static int a = 0;" solve the problem.

        System.out.println(b);
        System.out.println(c);

    }
}
