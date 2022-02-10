package Tamrin4;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Hashmap<Integer, String> hashmap = new Hashmap<>();
        hashmap.put(1,"shahed");
        hashmap.put(2,"shariati");
        hashmap.put(3,"sssss");
        System.out.println(hashmap.containsKey(3));
        for (Integer key:hashmap.keySet()) {
            System.out.println(hashmap.get(key));
        }
        System.out.println(hashmap.containsKey(2));
        System.out.println(hashmap.isEmpty());
        System.out.println(hashmap.get(1));
        hashmap.replace(1,"ssss");
        System.out.println(hashmap.get(1));
    }
}
