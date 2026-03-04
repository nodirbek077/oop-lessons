package interfaces.interfaceAndInterface;

public interface Job {
    void looking();

    void searching();

    default void makingJob() {
        System.out.println("making a jon");
    }
}
