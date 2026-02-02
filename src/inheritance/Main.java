package inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ali");
        person.setSurname("Aliyev");
        System.out.println(person.getName() + " " + person.getSurname());

        Professor professor = new Professor();
        professor.setName("Vali");
        professor.setSurname("Valiyev");
        professor.setSubjectName("Java");
        System.out.println(professor.getName() + " " + professor.getSurname() + " " + professor.getSubjectName());
    }
}
