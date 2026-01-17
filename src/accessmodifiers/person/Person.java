package accessmodifiers.person;

public class Person {
    //o'zgaruvchining hech qanday access modifier yozilmagan bo'lsa ham aslida default bo'ladi, methodda ham shu ahvol
    String name;
    int age;

    void printDetails() {
        System.out.println(name + " " + age);
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }
}
