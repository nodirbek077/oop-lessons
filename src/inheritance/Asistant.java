package inheritance;

public class Asistant extends Student{
    private String professorName;

//    public Asistant(String name) {
//        super(name);
//    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
}
