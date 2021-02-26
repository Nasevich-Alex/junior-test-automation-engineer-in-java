package automation.training.exceptionsAndErrors;

import java.util.Objects;

public class Subjects {
    private String nameOfSubject;

    public Subjects(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subjects subjects = (Subjects) o;
        return Objects.equals(nameOfSubject, subjects.nameOfSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSubject);
    }
}
