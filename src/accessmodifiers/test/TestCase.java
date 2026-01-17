package accessmodifiers.test;

import accessmodifiers.person.Person;

public class TestCase {
    public void startTest(){
        Person person = new Person();
        person.setName("Toshmat");
        person.setAge(50);
        person.printDetails();


    }
}
