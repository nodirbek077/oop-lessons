package interfacetheme.asTemplate;

public class SuperMan implements Worker{
    @Override
    public void work() {
        System.out.println("Superman...");
    }

    @Override
    public void detail() {
        System.out.println("I'm a superman");
    }
}
