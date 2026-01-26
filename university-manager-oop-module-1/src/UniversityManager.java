public class UniversityManager {
    private String universityName;
    private Subject[] subjectArray = new Subject[10];
    public int subjectIndex = 0;

    public UniversityManager(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    /**
     * Subject
     */
    public Subject createSubject(String name, int semester) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setSemester(semester);

        Subject exists = getSubjectByName(name);
        if (exists != null){
            System.out.println("Subject name exits!");
            return null;
        }

        if (subjectArray.length == subjectIndex) {
            Subject[] newArray = new Subject[subjectArray.length * 2];
            for (int i = 0; i < subjectArray.length; i++) {
                newArray[i] = subjectArray[i];
            }
            subjectArray = newArray;
        }
        subjectArray[subjectIndex++] = subject;
        return subject;
    }

    public Subject getSubjectById() {
        return null;
    }

    public Subject getSubjectByName(String name) {
        for(Subject s : subjectArray) {
            if (s != null && s.getName().equals(name)){
                return s;
            }
        }
        return null;
    }
}
