package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.NoStudentsInGroupException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Group {
    private int groupId;
    private List<Student> listOfStudents;

    public Group(int groupId) {
        this.groupId = groupId;
        this.listOfStudents = new ArrayList<>();
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public List<Student> getListOfStudents() throws NoStudentsInGroupException {
        if(listOfStudents.isEmpty()) {
            throw new NoStudentsInGroupException("There are no students in this group");
        }
        return listOfStudents;
    }

    public double averageMarkAllStudentsInGroupForSubject(Subjects subject) throws NoStudentsInGroupException {
        double value = 0.0;
        for (Student currentStudent : getListOfStudents()) {
            for(Map.Entry<Subjects, Integer> item : currentStudent.getSubjectsWithMarks().entrySet()) {
                if(item.getKey().equals(subject)) {
                    value += item.getValue();
                }
            }
        }
        return value / getListOfStudents().size();
    }

    public void addStudent(Student student) {
        listOfStudents.add(student);
    }

}
