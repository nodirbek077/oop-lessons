package statics;

public class Car {
    //static variables
    public static String model;
    public final static int wheel;

    //static block
    static {
        System.out.println("Static block");
        model = "Spark";
        wheel = 4;
    }

    //static method
    public static void detail() {
        System.out.println("In detail");
    }
}
