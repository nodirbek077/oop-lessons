package inheritance.article;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Ali";
        person.walk();

        Sportsman sportsman = new Sportsman();
        sportsman.name = "Alishjon";
        sportsman.medalAmount = 10;
        sportsman.walk();
        sportsman.run();
    }
}
