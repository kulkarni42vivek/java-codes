package CoreJava;

public class CharAtInternal {
    public static char getCharacter(String name , int number){
        char[] charArray = name.toCharArray();
        int length = charArray.length;
        if(number>length)
            throw new StringIndexOutOfBoundsException(number);
        else
            return charArray[number];
    }
    public static void main(String[] args) {
        String name = "twentyfive";
        System.out.println(name.charAt(3));
        char value = name.charAt(3);
        System.out.println();
        char vlue = getCharacter(name,3);
        name.contains("a");
    }
}
