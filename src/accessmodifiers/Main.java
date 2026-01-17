package accessmodifiers;

import accessmodifiers.person.Person;
import accessmodifiers.test.TestCase;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alish");
        student.setAge(10);
        student.printDetails();

        Person person = new Person();
        person.name = "Alibek";
        person.setName("Valish");
        person.setAge(24);
        person.printDetails();

        TestCase testCase = new TestCase();
        testCase.startTest();
    }
}
