package accessmodifiers;

import accessmodifiers.person.Person;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Alish");
//        student.setAge(10);
//        student.printDetails();

        Person person = new Person();
        person.setName("Valish");
        person.setAge(24);
        person.printDetail();

        Person person2 = person.getDefaultPerson();
        person2.printDetail();

        Person person3 = new Person("yolchi");

//        TestCase testCase = new TestCase();
//        testCase.startTest();
    }
}
