package interfacetheme;

public class Teacher implements Worker{

    @Override
    public void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void detail() {
        System.out.println("Teacher details");
    }
}
