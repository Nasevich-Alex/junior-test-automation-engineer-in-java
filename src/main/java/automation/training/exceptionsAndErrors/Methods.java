package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.NoFacultiesException;
import automation.training.exceptionsAndErrors.exceptions.NoGroupsAtFacultyException;
import automation.training.exceptionsAndErrors.exceptions.NoStudentsInGroupException;

import java.util.List;
import java.util.Set;

public class Methods {
    public static double averageMarkOfAllSubjectsOfStudent(Student student) {
        double value = 0.0;
        Set<Subjects> allSubjectsOfStudent = student.getSubjectsWithMarks().keySet();
        for (Subjects currentSubject : allSubjectsOfStudent) {
            value += student.getSubjectsWithMarks().get(currentSubject);
        }
        return value / allSubjectsOfStudent.size();
    }

    public static double averageMarkOfSubjectOfGroupOfFaculty(Subjects subject, int group, Faculty faculty)
            throws NoGroupsAtFacultyException, NoStudentsInGroupException {
        double value = 0.0;
        for(Group currentGroup : faculty.getGroups()) {
            if(currentGroup.getGroupId() == group) {
                List<Student> students = currentGroup.getListOfStudents();
                for (Student currentStudent : students) {
                    Set<Subjects> subjectsOfCurrentStudent = currentStudent.getSubjectsWithMarks().keySet();
                    for (Subjects currentSubject : subjectsOfCurrentStudent) {
                        if(currentSubject.equals(subject)) {
                            value += currentStudent.getSubjectsWithMarks().get(currentSubject);
                        }
                    }
                }
                return value / students.size();
            }
        }
        return 0;
    }
    public static double averageMarkOfSubjectInUniversity(Subjects subject, University university)
            throws NoFacultiesException, NoGroupsAtFacultyException, NoStudentsInGroupException {
        double value = 0.0;
        for (Faculty currentFaculty : university.getFaculties()) {
            for (Group currentGroup : currentFaculty.getGroups()) {
                List<Student> studentsOfCurrentGroup = currentGroup.getListOfStudents();
                for (Student student : currentGroup.getListOfStudents()) {
                    Set<Subjects> subjectsOfStudent = student.getSubjectsWithMarks().keySet();
                        for (Subjects currentSubject : subjectsOfStudent) {
                            if(currentSubject.equals(subject)) {
                                value += student.getSubjectsWithMarks().get(subject);
                            }
                        }
                }
                return value / studentsOfCurrentGroup.size();
            }
        }
        return 0;
    }
}
