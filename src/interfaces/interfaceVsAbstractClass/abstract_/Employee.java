package interfaces.interfaceVsAbstractClass.abstract_;

/**
 * We have many class which are the same fields and methods. Instead of rewriting such kind of fields in every single class such as Driver, Teacher and Superman, I mean that
 * avoiding repetastion, we can create abstract class as base class where needs to all fields to that class. Other classes extends from it.
 * In that situation, we can use abstract class. And that is like partly abstraction
 * <p>
 * Qolgan classlar shu base classning methodlari o'zlari xohlaganday qilib override qilib ishlatadi
 */
public abstract class Employee {
    private String name;
    private String surname;

    public abstract void start();

    public abstract void stop();

    public void test() {
        System.out.println("Testing...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
