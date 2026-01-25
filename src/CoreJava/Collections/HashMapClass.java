package CoreJava.Collections;
import java.util.*;
import java.util.stream.Collectors;

// java map interface --
// java map interface is implemented by the hashmap class or it is extended by sorted map interface which is then implemented  by
// the treemap where order is maintained in the sorted order.
// hashmap is implemented by the linked hash map. hashmap and linked hash map can have null key or null values . tree map cannot
// hashmap is unordered . insertion order is maintained in the linked hash map and tree map sort in the ascending order.
// tree map cannot have null key or value.



// how hashmaps works internally ?
// hashmap - key value pair - stored in the bucket - bucket is like table . It has threshold  value
// bucket is assigned with 16 values - bucket size incresed as key value pairs are added. bucket size is increaseed when pair reaches 12
// each bucket has nodes. multiple nodes are in the bucket , they are in the form of the linked list format .
// node has - hashcode , key , value , next. next contains reference to the next node.
// you will get hashcode from key that will be used- linked list structure is made in the  bucket
// hash collision - when key is same as previous key or the hashcode generated is same as the previous one, then hash gets collided
// if hashcode value is same , then == operator is worked on the key of the bucket. if key are not the same -> new node is added and address of second is put in the first node.


public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer, String > map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("one"));

        HashMap<Integer, String > map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);

        map2.putIfAbsent(3,"hello");
        System.out.println(map2);

        map.clear();
        System.out.println(map);

        System.out.println(map2.remove("hello"));
        System.out.println(map2);

        System.out.println(map2.keySet());
        System.out.println(map2.entrySet());
        
        Map<Integer , String> hmap = new HashMap<>();
        hmap.put(11,"sadf");
        hmap.put(12,"wer");
        hmap.put(13,"wrew");
        hmap.put(15,"werter");
        Map<Integer, String> hmap2 = new HashMap<>();
        hmap2.putAll(hmap);

        hmap2.putIfAbsent(14,"asds");
        System.out.println(hmap2);
        hmap2.remove(11);
        System.out.println(hmap2);

        Set<Integer> keyvalue = hmap2.keySet();
        List<String> valuesList = hmap2.values().stream().collect(Collectors.toList());
        System.out.println(valuesList);

        for(Map.Entry entry  : hmap2.entrySet()){
            System.out.println(entry.getKey()
             + " --> " + entry.getValue()
             );
        }
        System.out.println(hmap2.containsValue("asds"));
        System.out.println(hmap2.containsKey(12));

        // sorting a hashmap

        List<Integer> sortedKeys  = new ArrayList<>(hmap2.keySet());
        Collections.sort(sortedKeys);
        for(Integer key : sortedKeys){
            System.out.println(key  + " -- " + hmap2.get(key));
        }
    }
}
