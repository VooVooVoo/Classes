/**
 * Created by Wojt on 2016-07-31.
 */
public class Groupmember {

    private String name;
    private long codepower;
    private long codespeed;

    public Groupmember(String name, long codepower, long codespeed) {

        this.name = name;
        this.codepower = codepower;
        this.codespeed = codespeed;
    }

    public String toString() {
        return "Member: " + name + ", The Power of Code " + codepower + ", Coding speed: " + codespeed;
    }
    public void supportMember(Groupmember groupmembera, Groupmember groupmemberb) {
        groupmemberb.codepower += 0.01 * groupmembera.codepower;
        groupmemberb.codespeed += 0.01 * groupmembera.codespeed;
    }

}
