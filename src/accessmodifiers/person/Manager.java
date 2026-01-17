package accessmodifiers.person;

public class Manager {
    public void test(){
        Person person = new Person();
        person.name = "Eshmat";
        person.age = 30;
        person.printDetails();
    }
}
