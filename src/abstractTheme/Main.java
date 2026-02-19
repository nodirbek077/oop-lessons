package abstractTheme;

public class Main {
    public static void main(String[] args) {
        // driver
        Driver d = new Driver();
        d.setName("Ali");
        d.setAge(19);

        d.show();
        d.workInfo();

        // teacher
        Person t = new Teacher();
        t.setName("Vali");
        t.setAge(22);
        t.show();
        t.workInfo();

//        Person person = new Person(); abstract classdan obyekt olib bo'lmaydi
    }
}
