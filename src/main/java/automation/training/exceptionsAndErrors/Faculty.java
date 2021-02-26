package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.NoGroupsAtFacultyException;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private List<Group> groups;

    public Faculty() {
        this.groups = new ArrayList<>();
    }

    public List<Group> getGroups() throws NoGroupsAtFacultyException {
        if(groups.isEmpty()) {
            throw new NoGroupsAtFacultyException("Нет групп на данном факультете");
        }
        return groups;
    }
    public void addGroup(Group group) {
        groups.add(group);
    }
}
