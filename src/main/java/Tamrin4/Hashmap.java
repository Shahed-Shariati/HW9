package Tamrin4;

import java.util.ArrayList;

public class Hashmap <K ,V>{
  private ArrayList<K> keys;
  private  ArrayList<V> values;

            public Hashmap() {

                this.keys = new ArrayList<>();
                this.values = new ArrayList<>();
            }


           public V get(K key){
                if(keys.contains(key)){
                    int index = keys.indexOf(key);
                    return values.get(index);
                }
                return null;
           }

           public Boolean containsKey(K key){
                if(keys.contains(key)){
                    return true;
                }
                return false;
           }
            public void put(K key, V value) {
             if(keys.contains(key)){
                 int index = keys.indexOf(key);
                 values.set(index,value);
             }else {
                 keys.add(key);
                 values.add(value);
             }

            }

            public ArrayList<K> keySet(){
                return keys;
            }

        public Boolean isEmpty(){
          if (keys.size() == 0){
             return true;
          }
         return false;
       }

       public void replace(K key, V value){
                V oldValue = get(key);
                int index = values.indexOf(oldValue);
                values.set(index,value);
       }

}
