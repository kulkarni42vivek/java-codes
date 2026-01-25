package CoreJava;

public class StringClass {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d'};
        String str  = new String(arr);
        System.out.println(str);
        // string is immutable - it means that it cannot be modified.
        // strings are stored  in the sting constant pool which is in the heap

        System.out.println(str.charAt(0));
        System.out.println(str.length());
        System.out.println(str.substring(1));
        System.out.println(str.substring(0,2));

        System.out.println(str.contains("abc"));
        System.out.println(str.contains("a"));

        char[] charArray = {'a','b','c','d','e','f'};
        String str1 = new String(charArray);
        System.out.println(str1);
        String[] arr1 = {"arr","saf"};
        String value = String.join("," , arr1);
        System.out.println(value);

        System.out.println(arr.equals(value));
        System.out.println(value.isEmpty());
        System.out.println(value.concat(str));
        System.out.println(value.replace("a", "was"));

        // string comparison
        // equals - it compares object with the values also
        // == - it compares only reference

        // compareTo() - > it compares string lexigraphically
        // s1 == s2 return 0
        // s1 > s2 return positive
        // s2 > s1 return negative

        
    }
}
