package basics.methods;

public class VoidMethod {
    public static void main(String[] args) {
            printHello();
            printHello("John Doe");
    }

    public static void printHello(){
        System.out.println("Hello");
    }

    public static void printHello(String name){
        System.out.println("Helllo "+name+ "!");
    }

}
