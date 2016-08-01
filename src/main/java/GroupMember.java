/**
 * Created by Wojt on 2016-07-31.
 */
public class GroupMember {

    private String name;
    private long codepower;
    private long codespeed;

    public GroupMember(String name, long codepower, long codespeed) {

        this.name = name;
        this.codepower = codepower;
        this.codespeed = codespeed;
    }

    public String toString() {
        return "Member: " + name + ", The Power of Code " + codepower + ", Coding speed: " + codespeed;
    }
    public void supportMember(GroupMember groupmemberb) {
        groupmemberb.codepower += 0.01 * codepower;
        groupmemberb.codespeed += 0.01 * codespeed;
    }

}
