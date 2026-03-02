package interfacetheme;

public class Student implements Worker {
    @Override
    public void work() {
        System.out.println("Working student...");
    }

    @Override
    public void detail() {
        System.out.println("I'm a student");
    }
}
