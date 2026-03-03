package interfaces.asTemplate;

public class Driver implements Worker{
    @Override
    public void work() {
        System.out.println("Driving...");
    }

    @Override
    public void detail() {
        System.out.println("I'm a driver");
    }
}
