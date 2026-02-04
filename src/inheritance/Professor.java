package inheritance;

public class Professor extends Person {
    private String subjectName;

    public Professor() {
        super();
        System.out.println("Professor");
    }

    public void startTeaching() {
        System.out.println("Lets start lesson.");
    }

    @Override
    public void walk() {
        System.out.println("I am walking...");
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

//    @Override
//    public String toString() {
//        return "Mazgi";
//    }
}
