package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.NoFacultiesException;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Faculty> faculties;

    public University(String name) {
        this.faculties = new ArrayList<>();
    }


    public List<Faculty> getFaculties() throws NoFacultiesException {
        if(faculties.isEmpty()) {
            throw new NoFacultiesException("There are no faculties at this university");
        }
        return faculties;
    }

    public Faculty getCertainFaculty(String faculty) throws NoFacultiesException {
        for(Faculty currentFaculty : getFaculties()) {
            if(currentFaculty.getName().equals(faculty)) {
                return currentFaculty;
            }
        }
        throw new NoFacultiesException("There are no faculties at this university");
    }

    public void addFaculties(Faculty faculty) {
        faculties.add(faculty);
    }
}
