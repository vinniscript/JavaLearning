public class ThisIsFun { // Top-class name.
    // "This" always refers to the instance of the object you're working with. That means that you can have the same 3 objects of the same class, but each one of them having different values and outputs.

    int a;
    int b;

    // In the case of difficulties using the "this" to indicate the parameters of a method, you can simply use different names that are declared in the instance class variable.

//    int c;
//    int d;


    public void setData(int a, int b) {
//        a = a;    //Doing like this is redundant, the compiler does not understand that the first 'a' is referring to the variable 'a' of our class "ThisIsFun" so we can use the "this.a" to make it clear to what are we referring to.
//        b = b;

//        c = a;
//        d = b;    // It would work, inasmuch as there is no possible confusion with names with method variables and the class variables.

        this/*ThisIsFun*/.a = a;
        this/*ThisIsFun*/.b = b;
        // "This" does not work with the key work "static" so, if you want to refer to a variable of the class using the "this.", make sure that your method is not declared static.

        // Trying to do this way:

        /*
         *
         * ThisIsFun dis = new ThisIsFun();
         * dis.a = a;
         * dis.b = ;
         *
         * */

        // will not work because you are creating a brand-new object of the class, you are not referring to the class like you do when using the "this" statement

    }

    public static void main(String[] args) {
//        setData(4 ,3); // When deleting the static keyword of the method "setData" we get an error in this line, because it's not static anymore, so we can no longer call this method by any place in the package without creating an object of it

        // This is a creation of an object/instance.
        ThisIsFun dis = new ThisIsFun(); // We're making this cuz the setData class is not static.

        // This is how we call a method of a not-static object.
        dis.setData(4, 3);

        System.out.println(dis.a);
        System.out.println(dis.a);

//        System.out.println(dis.d);
//        System.out.println(dis.c);
    }
}
