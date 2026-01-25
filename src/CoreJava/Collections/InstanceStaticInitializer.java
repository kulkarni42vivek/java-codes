package CoreJava.Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstanceStaticInitializer {

    public static void main(String[] args) {
        Map<String , String> map  = new HashMap<>();

        map.put("hello", "wordl");
        map.put("sf","aer");
        map.put("wer","ew");

        // iteration
        for(Map.Entry entry : map.entrySet()){
            System.out.print(entry.getKey()+ "-->");
            System.out.println(entry.getValue());
        }

        Iterator<Map.Entry<String , String>>iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry  entry = iterator.next();
            System.out.println("---" + entry.getKey());
            System.out.println("----" + entry.getValue());
        }
        map.entrySet().forEach(x->{
            System.out.println(x.getValue());
        });
    }
}
