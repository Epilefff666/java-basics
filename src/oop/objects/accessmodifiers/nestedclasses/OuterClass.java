package oop.objects.accessmodifiers.nestedclasses;

public class OuterClass {

    // Creating a static nested class.
    // A static nested class belongs to the OuterClass itself,
    // not to an instance of it. This means you can create an object of
    // NestedClass without creating an instance of OuterClass first.
    static class NestedClass {
        public void printMessage() {
            System.out.println("Hello from the static nested class");
        }
    }

    // Creating a non-static inner class.
    // This class is tied to an instance of OuterClass.
    // To instantiate InnerClass, you must first create an OuterClass object,
    // then use it to create the inner class object.
    class InnerClass {
        public void printMessage() {
            System.out.println("Hello from the inner class");
        }
    }

    // Creating a local inner class.
    // A local inner class is defined inside a method of the OuterClass.
    // It is only accessible within that method's scope.
    public void printMessage() {
        class LocalInnerClass {
            public void printMessage() {
                System.out.println("Hello from the local inner class");
            }
        }

        // Creating and using the local inner class instance inside the method.
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.printMessage();
    }
}

