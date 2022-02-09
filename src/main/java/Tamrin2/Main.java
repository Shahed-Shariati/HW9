package Tamrin2;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Character> treeSet1 = new TreeSet<>();
        TreeSet<Character> treeSet2 = new TreeSet<>();


        Random random = new Random();

       while (treeSet1.size() != 10){
            int charAt = random.nextInt(26) + 97;
            treeSet1.add((char) charAt);
        }
        Iterator<Character> iterator = treeSet1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
       while (treeSet2.size() != 10){
            int charAt = random.nextInt(26) + 97;
            treeSet2.add((char) charAt);
        }

         Iterator<Character> iterator1 = treeSet2.iterator();
        while (iterator1.hasNext())
        {
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();
       union(treeSet1,treeSet2);
       community(treeSet1,treeSet2);


    }

    private static void union(TreeSet<Character> treeSet1,TreeSet<Character> treeSet2){

       TreeSet<Character> treeSetTemp = new TreeSet<>();
       treeSetTemp.addAll(treeSet1);
       treeSetTemp.addAll(treeSet2);
        System.out.println("Union");
        System.out.println(treeSetTemp);

    }

    private static void community(TreeSet<Character> treeSet1,TreeSet<Character> treeSet2){
        TreeSet<Character> treeSetTemp = new TreeSet<>();
        Iterator<Character> iterator = treeSet1.iterator();
        System.out.println("community");
       /* while (iterator.hasNext()){
            Character item = iterator.next();
            if(treeSet2.contains(item)){
                treeSetTemp.add(item);
            }
        }*/
        treeSetTemp.addAll(treeSet1);
        treeSetTemp.retainAll(treeSet2);
        System.out.println(treeSetTemp);
    }
}
