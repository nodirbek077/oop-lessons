package interfaces;

public class Driver implements Worker {

    @Override
    public void work() {
        System.out.println("Driver works");
    }

    @Override
    public void detail() {
        System.out.println("Driver details");
    }
}
