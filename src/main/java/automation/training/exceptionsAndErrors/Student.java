package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.IllegalMarkException;
import automation.training.exceptionsAndErrors.exceptions.StudentHasNoSubjectsException;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private Map<Subjects, Integer> subjectsWithMarks;

    public Student(Subjects subjects, int mark) throws StudentHasNoSubjectsException {
        if(subjects == null) {
            throw new StudentHasNoSubjectsException("The student has no subjects");
        }
        this.subjectsWithMarks = new HashMap<>();

    }

    public Map<Subjects, Integer> getSubjectsWithMarks() {
        return subjectsWithMarks;
    }

    public void addSubjectWithMark(Subjects subject, int mark) throws IllegalMarkException {
        if(mark > 10 || mark < 0) {
                throw new IllegalMarkException("Incorrect mark (must be between 0 and 10)");
        }
        subjectsWithMarks.put(subject, mark);
    }
}
