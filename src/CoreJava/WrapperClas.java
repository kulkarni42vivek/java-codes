package CoreJava;

public class WrapperClas {
    public static void main(String[] args) {
        // wrapper class are used to convert primitive to object // or object to primitive \
        //        Primitive Type	Wrapper class
        //        boolean	Boolean
        //        char	Character
        //        byte	Byte
        //        short	Short
        //        int	Integer
        //        long	Long
        //        float	Float
        //        double	Double


        // autoboxing-- convert primitive to object
        int a = 15;
        Integer i =a;
        System.out.println(i);

        // unboxing - convert object to primitive
        Integer b = new Integer(15);
        int value = b.intValue();
        System.out.println(value);


    }
}
