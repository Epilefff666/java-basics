package basics.methods;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class RecursiveMethodsExamples {
    public static void main(String[] args) {

        //using rangeTo
        System.out.println(rangeTo(5));

        //using listFromTo
        System.out.println(listFromTo(3, 10));

        //using additionTo
        System.out.println(additionTo(5));

        //using removeAllFromListRecursive
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(1);
        int number = 1;
        System.out.println("without method list = "+list);
        System.out.println("with recursive removeAllFromListRecursive(list,"+number+"): "+ removeAllFromListRecursive(list,1));

        List<String> listA = new ArrayList<>();
        listA.add("1");
        listA.add("2");
        listA.add("3");
        List<String> listB = new ArrayList<>();
        listB.add("A");
        listB.add("B");
        listB.add("C");

        System.out.println(matchLists(listA,listB));

    }

    //list From '0' to 'n'
    public static List<Integer> rangeTo(int n) {

        if (n == 0) {
            List<Integer> base = new ArrayList<>();
            base.add(0);
            return base;
        } else {
            List<Integer> outPutList = rangeTo(n - 1);
            outPutList.add(n);
            return outPutList;
        }
    }

    //list from 'a' to 'b'
    public static List<Integer> listFromTo(int a, int b) {
        if (b == a) {
            List<Integer> base = new ArrayList<>();
            base.add(a);
            return base;
        } else {
            List<Integer> outPutList = listFromTo(a, b - 1);
            outPutList.add(b);
            return outPutList;
        }
    }

    //addition  numbers from 0 to 'n'
    public static int additionTo(int n) {
        return n == 0 ? 0 : n + additionTo(n - 1);
    }


    //remove all the same numbers from a list when it's specified
    public static List<Integer> removeAllFromListRecursive(List<Integer> list, int number){

        if(list.toArray().length == 0){
            return new ArrayList<>();
        }else{

            if(list.toArray()[0].equals(number)){
                list.removeFirst();
                return removeAllFromListRecursive(list,number);
            }else{
                int value = (int)list.toArray()[0];
                list.removeFirst();
                List<Integer> output = removeAllFromListRecursive(list,number);
                output.addFirst(value);
                return output;
            }
        }

    }

    //matching two lists

    public static List<String> matchLists(List<String> firstList, List<String> secondList){

        if( firstList.toArray().length == 0 || secondList.toArray().length == 0){
            return new ArrayList<>();
        }else{

            String value1 = firstList.getFirst();
            String value2 = secondList.getFirst();
            firstList.removeFirst();
            secondList.removeFirst();
            List<String> output = matchLists(firstList,secondList);
            output.addFirst(value1+value2);

            return output;

        }

    }




}
