import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Wojt on 2016-07-31.
 */
public class Main {
    public static void main(String[]args) {

        ArrayList<GroupMember> groupList = new ArrayList<>();
        groupList.add(new GroupMember("Anawoj", 100, 100 ));
        groupList.add(new GroupMember("Karo", 100, 100));
        groupList.add(new GroupMember("Merrylouiss",100, 100));
        groupList.add(new GroupMember("Michalina", 100, 100));
        groupList.add(new GroupMember("Youlek", 100, 100));
        groupList.add(new GroupMember("Voyt", 100, 100));
        groupList.add(new GroupMember("Piotr", 9001, 3000));

        Group żabki = new Group("Żabki", groupList);

        Scanner scanner = new Scanner(System.in);


// Shorter version
//        writeListToConsole(groupList);
//        for(int dayNumber = 1; dayNumber <= 5; dayNumber++){
//            writeAndWait(scanner, "Day number: " + dayNumber+ ". Shall we start, then?");
//            powerUpGroup(groupList);
//            writeListToConsole(groupList);
//        }




        writeListToConsole(groupList);

        writeAndWait(scanner, "Day one training. WOWOWOW!!! Peter's Power is over 9000!");
        writeAndWait(scanner, "I, for one, welcome our CodeLord.");
        writeAndWait(scanner, "Shall we start, then?");

        System.out.println("Peter uses his teaching skills...I can see the code!");

        żabki.powerUpGroup();

        // Each memeber support each member
//        for (GroupMember supportingGroupMember :groupList){
//            for(GroupMember supportedGroupMember :groupList) {
//                supportingGroupMember.supportMember(supportedGroupMember);
//            }
//        }


        writeListToConsole(groupList);
        writeAndWait(scanner, "Day two training. Do you want to commence?");

        System.out.println("Peter uses his teaching skills...OMG!!!");

        żabki.powerUpGroup();
        writeListToConsole(groupList);

//        ArrayList<GroupMember> membersList = żabki.getMembersList();
//        writeListToConsole(membersList);
//
//        żabki.writeToConsole();

        writeAndWait(scanner, "Day three training. Do you want to commence?");

        System.out.println("Peter uses his teaching skills...See how much we have learnt?!?!");

        żabki.powerUpGroup();
        writeListToConsole(groupList);

        writeAndWait(scanner, "Day four training. Do you want to commence?");

        System.out.println("Peter uses his teaching skills...Just think of all the possible applications!!!");

        żabki.powerUpGroup();
        writeListToConsole(groupList);

        writeAndWait(scanner, "Day five training. Do you want to commence?");

        System.out.println("Peter uses his teaching skills...That's awesome!");

        żabki.powerUpGroup();
        writeListToConsole(groupList);

        writeAndWait(scanner, "It's weekend. Go home.");
        writeAndWait(scanner, "No, really. Have some rest.");
        writeAndWait(scanner, "Seriously, mate. Go home and chill.");
        writeAndWait(scanner, "Ok, I'll see myself out! ");
        writeAndWait(scanner, "Bye!");
        writeAndWait(scanner, "I'm not good at saying goodbyes...");
        writeAndWait(scanner, "This time it's serious, though.");
        System.out.println("I've taken the red pill.");

    }

    private static void writeAndWait(Scanner scanner, String x) {
        System.out.println(x);
        scanner.nextLine();
    }


    private static void writeListToConsole(ArrayList<GroupMember> groupList) {
        int i = 0;
        while (i <groupList.size()) {
            GroupMember groupMember = groupList.get(i);
            System.out.println(groupMember);
            i += 1;
        }
    }
}
