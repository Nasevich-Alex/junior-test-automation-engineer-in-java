package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.NoFacultiesException;
import automation.training.exceptionsAndErrors.exceptions.NoGroupsAtFacultyException;
import automation.training.exceptionsAndErrors.exceptions.NoStudentsInGroupException;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Methods {
    public static double averageMarkOfAllSubjectsOfStudent(Student student) {
        double value = 0.0;
        for(Map.Entry<Subjects, Integer> item : student.getSubjectsWithMarks().entrySet()) {
            value += item.getValue();
        }
        return value / student.getSubjectsWithMarks().size();
    }

    public static double averageMarkOfSubjectOfGroupOfFaculty(Faculty faculty, int groupId, Subjects subject)
            throws NoGroupsAtFacultyException, NoStudentsInGroupException {
        return faculty
                .getGroupOfFaculty(groupId)
                .averageMarkAllStudentsInGroupForSubject(subject);
    }
    public static double averageMarkOfSubjectInUniversity(University university, Subjects subject)
            throws NoFacultiesException, NoGroupsAtFacultyException, NoStudentsInGroupException {



        double value = 0.0;
        for (Faculty currentFaculty : university.getFaculties()) {
            for (Group currentGroup : currentFaculty.getGroups()) {
               value += currentGroup.averageMarkAllStudentsInGroupForSubject(subject) / currentFaculty.getGroups().size();
            }
        }
        return value / university.getFaculties().size();
    }
}
