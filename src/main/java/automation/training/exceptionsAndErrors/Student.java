package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.IllegalMarkException;
import automation.training.exceptionsAndErrors.exceptions.StudentHasNoSubjectsException;

import java.util.List;


public class Student {
    private String name;
    private List<Subjects> subjects;

    public Student(String name, List<Subjects> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public double getAverageMarkOfStudent() throws IllegalMarkException, StudentHasNoSubjectsException {
        int sumAllMarks = 0;
        double averageMarkOfStudent = 0.0;
        if (subjects.isEmpty()) {
            throw new StudentHasNoSubjectsException("У студента нет ни одного предмета");
        } else {
            for (Subjects sb : subjects) {
                if (sb.getMark() < 0 || sb.getMark() > 10) {
                    throw new IllegalMarkException("Некорректная оценка (должна быть от 0 до 10)");
                }
                sumAllMarks += sb.getMark();
            }
        }
        return (double) sumAllMarks / subjects.size();
    }
}
