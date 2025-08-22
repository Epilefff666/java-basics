package basics.methods;

public class ParameterPassingMechanism {
    public static void main(String[] args) {
        // in this case x is the name of the reference for pass the value to the changeValue method
        int x = 10;
        System.out.println("Before calling the method x = "+ x);
        changeValue(x);
        System.out.println("After calling the method x = "+x);

        // in this case numbers is the name of the reference for pass the values to the changeArray method
        // but numbers is a non-primitive data type because it is an array, inside that, there are some different values
        // like this [1,2,3], when number in the first position "number[0]" is called the value is 1

        int[] numbers = {1,2,3};
        System.out.println("Before calling the method numbers[0] = "+ numbers[0]);
        changeArray(numbers);
        System.out.println("After calling the method numbers[0] = "+numbers[0]);
    }

    public static void  changeValue(int num){
        num += 10;
        System.out.println("inside the method, num = "+num);
    }

    public static void  changeArray(int[] array){
        array[0] += 10;
        System.out.println("inside the method, array[0] = "+ array[0]);
    }
}
