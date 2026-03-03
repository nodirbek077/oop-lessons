package interfaces.java1_8_version_features;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.test();

        Driver driver = new Driver();
        driver.test();

        Worker.run();
    }
}
