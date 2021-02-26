package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.NoFacultiesException;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Faculty> faculties;

    public University() {
        this.faculties = new ArrayList<>();
    }

    public List<Faculty> getFaculties() throws NoFacultiesException {
        if(faculties.isEmpty()) {
            throw new NoFacultiesException("Нет факультетов в данном университете");
        }
        return faculties;
    }

    public void addFaculties(Faculty faculty) {
        faculties.add(faculty);
    }
}
