package urokijava;

public class Main {
    public static void main(String[] args) {
        int a = -8;
        double b = 5.6;
        double c = 16.0;


        System.out.println(Math.abs(a)); // 8
        System.out.println(Math.ceil(b)); // 6.0
        System.out.println(Math.floor(b)); // 5.0
        System.out.println(Math.sqrt(c)); // 4.0
        System.out.println(Math.pow(2, 32));
        System.out.println("--------");

        double degree = 45.0;
        double radians = Math.toRadians(degree);
        System.out.println(radians);

        System.out.println(Math.sin(radians));
        System.out.println(Math.sqrt(Math.cos(radians)));
        System.out.println(Math.tan(radians));
        System.out.println(Math.ceil(Math.tan(radians)));

        double x = 100.0;

        System.out.println(Math.log(x));
        System.out.println(Math.log10(x));
    }
}
