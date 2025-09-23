package oop.objects.accessmodifiers.nestedclasses;

public class Main {
    public static void main(String[] args) {

        // Using the static nested class:
        // Since NestedClass is declared as static, it can be accessed
        // directly through the OuterClass without creating an instance of OuterClass.
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        nestedClass.printMessage();

        // Using the non-static inner class:
        // InnerClass is tied to an instance of OuterClass.
        // First, create an OuterClass object, then use it to create the inner class.
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printMessage();

        // Using the local inner class:
        // LocalInnerClass is defined inside the printMessage() method of OuterClass.
        // To use it, you call the method where it is defined.
        OuterClass outerClass1 = new OuterClass();
        outerClass1.printMessage();
    }

}
