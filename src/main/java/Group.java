import java.util.ArrayList;

public class Group {

    private String name;
    private ArrayList<GroupMember> groupList;

    public Group(String name, ArrayList<GroupMember> groupList) {
        this.name = name;
        this.groupList = groupList;
    }

    public void powerUpGroup() {
        for (GroupMember groupMember :groupList){
            groupList.get(6).supportMember(groupMember);
        }
    }

}
