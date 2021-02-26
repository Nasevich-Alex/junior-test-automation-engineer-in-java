package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.NoStudentsInGroupException;

import java.util.ArrayList;
import java.util.List;

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
            throw new NoStudentsInGroupException("В этой группе нет студентов");
        }
        return listOfStudents;
    }

    public void addStudent(Student student) {
        listOfStudents.add(student);
    }

}
