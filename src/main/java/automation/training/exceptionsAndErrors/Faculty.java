package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.NoGroupsAtFacultyException;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private List<Group> groups;
    public String name;

    public Faculty(String name) {
        this.groups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() throws NoGroupsAtFacultyException {
        if(groups.isEmpty()) {
            throw new NoGroupsAtFacultyException("There are no groups in this faculty");
        }
        return groups;
    }

    public Group getGroupOfFaculty(int groupId) throws NoGroupsAtFacultyException {
        for(Group currentGroup : getGroups()) {
            if (currentGroup.getGroupId() == groupId) {
                return currentGroup;
            }
        }
        throw new NoGroupsAtFacultyException("There are no groups in this faculty");
    }

    public void addGroup(Group group) {
        groups.add(group);
    }
}
