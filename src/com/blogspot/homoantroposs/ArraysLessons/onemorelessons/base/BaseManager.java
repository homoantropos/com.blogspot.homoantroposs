package arrLessons.base;

import arrLessons.groups.GroupOfUser;

public class BaseManager {
    GroupOfUser group;

    public void addGroupToBase(GroupOfUser group) {
        BaseOfGroups.getBase().add(group);
    }

    public GroupOfUser getGroup(GroupOfUser group) {
        Integer index = BaseOfGroups.getBase().indexOf(group);
        return group = BaseOfGroups.getBase().get(index);
    }

    public GroupOfUser getGroup(String nameOfGroup) {

        for (GroupOfUser g : BaseOfGroups.getBase()) {
            if (g.getGroupName().equals(nameOfGroup)) {
                Integer index = BaseOfGroups.getBase().indexOf(g);
                group = BaseOfGroups.getBase().get(index);
            }
        }
        return group;
    }
}
