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
        System.out.println(hashmap.isEmpty());
        HashMap<Integer,String> hss = new HashMap<>();
        hss.put(1,"shahed");
        hss.put(2,"shariato");
        hss.put(1,"samrand");
        System.out.println(hss.get(1));
    }
}
