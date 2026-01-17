package accessmodifiers.test;

import accessmodifiers.person.Person;

public class TestCase {
    public void startTest(){
        Person person = new Person();
        person.name = "Toshmat";
        person.age = 50;
        person.printDetails();


    }
}
