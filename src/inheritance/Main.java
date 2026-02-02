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
        professor.printDetail();
//      System.out.println(professor.getName() + " " + professor.getSurname() + " " + professor.getSubjectName());

        Student student = new Student();
        student.setName("Toshmat");
        student.setSurname("Toshmatov");
        student.setLevel(4);
        student.printDetail();
        student.printLevel();

        System.out.println();
        Asistant asistant = new Asistant();
        asistant.setName("Nurlan");
        asistant.setSurname("Alimonov");
        asistant.printDetail();
        asistant.setLevel(4);
        asistant.printLevel();
        asistant.setProfessorName("Vali");
    }
}
