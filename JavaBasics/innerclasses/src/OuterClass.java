public class OuterClass {
    int number = 6;

    public void heyThere() {
        System.out.println("Hey there!");

        class LocalInnerClass { // A class inside a method of another class can only be used inside the method. Like you can see in this example
            String localInnerClassVariable = "piriri";

            public void printLocalInnerClassVariable(){
                System.out.println(localInnerClassVariable);
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerClassVariable();

        // Its accessible only in this method. You cant use this in any other part of your code. I don´t see usages for this.
    }

//    public class InnerClass { // Non-static method we need to write that weird syntax to acess
//        int innerNumber = 8;
//        public void whatsUp(){
//            System.out.println("What´s up from the inner Class!");
//        }

    public static class InnerClass{
        int innerNumber = 10;

        public void whatsUp(){
            System.out.println("Hey there from the static inner class!");
        }
    }

}

