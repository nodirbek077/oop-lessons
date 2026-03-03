package interfaces.asTemplate;

public class Teacher implements Worker{
    @Override
    public void work() {
        System.out.println("Teaching...");
    }

    @Override
    public void detail() {
        System.out.println("I'm a teacher");
    }
}
