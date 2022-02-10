package Tamrin3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(5);
        System.out.println(arrayList);

        getList(arrayList);

    }



    private static void getList(ArrayList<Integer> arrayList){
        ArrayList<Integer> temp = new ArrayList<>();
        Iterator<Integer> iterable = arrayList.iterator();
        while (iterable.hasNext()){
            try {
                Integer firstNumber = iterable.next();
                Integer secondNumber = iterable.next();
                if(firstNumber <= secondNumber){
                    temp.add(firstNumber);
                    temp.add(secondNumber);
                }

            }catch (NoSuchElementException e){
                System.out.print("");
            }
        }

        System.out.println(temp);
    }
}
