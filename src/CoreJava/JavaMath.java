package CoreJava;

public class JavaMath {
    public static void main(String[] args) {
        double a = 25 ;
        double b = 45 ;
        System.out.println(Math.max(a,b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.abs(a));
        System.out.println(Math.log(a));
        System.out.println(Math.log10(a));
        System.out.println(Math.pow(a,2));
        System.out.println(Math.exp(5));

        // angle

        int angle = 30;
        double radian = Math.toRadians(angle);
        System.out.println(Math.sin(radian));
        System.out.println(Math.cos(radian));
        System.out.println(Math.tan(radian));

    }
}
