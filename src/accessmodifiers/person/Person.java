package accessmodifiers.person;

public class Person {
    //o'zgaruvchining hech qanday access modifier yozilmagan bo'lsa ham aslida default bo'ladi, methodda ham shu ahvol
    String name;
    int age;

    public Person() {
//        this("Default name", 12);
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetail() {
        System.out.println(name + " " + age);
    }

    public Person getDefaultPerson(){
        return new Person("DefaultName", 12);
    }
}
