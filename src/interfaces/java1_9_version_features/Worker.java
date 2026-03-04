package interfaces.java1_9_version_features;

public interface Worker  {
    void work();

    void detail();

    default void test() {
        getBonus();
        System.out.println("Test");
    }

    static void check() {
//        print();//in static method, you cannot call non-static method
        System.out.println("Check");
    }

    /**
     * From java 1.9 version, also added private and private static methods
     */
    private void print() {
        System.out.println("Pri");
    }

    private static void getBonus() {
        System.out.println("Bonus");
    }
}
