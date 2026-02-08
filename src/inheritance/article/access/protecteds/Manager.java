package inheritance.article.access.protecteds;

public class Manager {
    public String name;
    protected String surname;

    public Manager() {

    }

    protected void detail() {
        System.out.println("Name: " + name + " Surname: " + surname);
    }
}
