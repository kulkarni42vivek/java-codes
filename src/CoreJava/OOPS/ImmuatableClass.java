package CoreJava.OOPS;

import java.util.HashMap;

final class Immut111{
    private String str = "";
    private HashMap<String, String> hmap = new HashMap<String, String>();

    Immut111(String str , HashMap<String, String> hmap){
        this.str = str;
        HashMap<String , String> temp = new HashMap<>();
        hmap.forEach((key , value)->{
            temp.put(key, value);
        });
        this.hmap = temp;
    }

    public String getStr() {
        return str;
    }

    public HashMap<String, String> getHmap() {
        HashMap<String , String> tempMap  = new HashMap<>();
        this.hmap.forEach((key, value)->{
            tempMap.put(key, value);
        });
        return tempMap;
    }
}

public class ImmuatableClass {
    public static void main(String[] args) {

    }
}
