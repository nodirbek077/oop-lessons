package inheritance;

public class Person {
    private String name;
    private String surname;

    public void walk(){
        System.out.println("I am walking ...");
    }

    public void printDetail() {
        System.out.println(name + " " + surname);
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

    @Override
    public String toString() {
        return "From person";
    }
}
