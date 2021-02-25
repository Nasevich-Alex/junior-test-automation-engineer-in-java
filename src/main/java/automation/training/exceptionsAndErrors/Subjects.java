package automation.training.exceptionsAndErrors;

public class Subjects {
    private String nameOfSubject;
    private int mark;

    public Subjects(String nameOfSubject, int mark) {
        this.nameOfSubject = nameOfSubject;
        this.mark = mark;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public int getMark() {
        return mark;
    }
}
