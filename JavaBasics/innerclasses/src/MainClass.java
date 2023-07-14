public class MainClass {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.heyThere(); // Calling thid method you bring the output of our inner class inside him too.


      // OuterClass.InnerClass inner = outer.new InnerClass(); // To create a object of a inner class who is not static, you should use this syntax

        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.whatsUp();
    }
}
