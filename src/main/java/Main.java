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

        int i = 0;
        while (i <groupList.size()) {
            GroupMember groupMember = groupList.get(i);
            System.out.println(groupList.get(i));
            i += 1;
        }

        System.out.println("Day one training. WOWOWOW!!! Peter's Power is over 9000!");
        new Scanner(System.in).nextLine();
        System.out.println("I, for one, welcome our CodeLord.");
        new Scanner(System.in).nextLine();
        System.out.println("Shall we start, then?");
        new Scanner(System.in).nextLine();

        System.out.println("Peter uses his teaching skills...I can see the code!");

        groupList.get(6).supportMember(groupList.get(0));
        groupList.get(6).supportMember(groupList.get(1));
        groupList.get(6).supportMember(groupList.get(2));
        groupList.get(6).supportMember(groupList.get(3));
        groupList.get(6).supportMember(groupList.get(4));
        groupList.get(6).supportMember(groupList.get(5));


        i = 0;
        while (i <groupList.size()) {
            GroupMember groupMember = groupList.get(i);
            System.out.println(groupList.get(i));
            i += 1;
        }


        System.out.println("Day two training. Do you want to commence?");
        new Scanner(System.in).nextLine();

        System.out.println("Peter uses his teaching skills...OMG!!!");

        groupList.get(6).supportMember(groupList.get(0));
        groupList.get(6).supportMember(groupList.get(1));
        groupList.get(6).supportMember(groupList.get(2));
        groupList.get(6).supportMember(groupList.get(3));
        groupList.get(6).supportMember(groupList.get(4));
        groupList.get(6).supportMember(groupList.get(5));

        i = 0;
        while (i <groupList.size()) {
            GroupMember groupMember = groupList.get(i);
            System.out.println(groupList.get(i));
            i += 1;
        }

        System.out.println("Day three training. Do you want to commence?");
        new Scanner(System.in).nextLine();

        System.out.println("Peter uses his teaching skills...See how much we have learnt?!?!");

        groupList.get(6).supportMember(groupList.get(0));
        groupList.get(6).supportMember(groupList.get(1));
        groupList.get(6).supportMember(groupList.get(2));
        groupList.get(6).supportMember(groupList.get(3));
        groupList.get(6).supportMember(groupList.get(4));
        groupList.get(6).supportMember(groupList.get(5));

        i = 0;
        while (i <groupList.size()) {
            GroupMember groupMember = groupList.get(i);
            System.out.println(groupList.get(i));
            i += 1;
        }

        System.out.println("Day four training. Do you want to commence?");
        new Scanner(System.in).nextLine();

        System.out.println("Peter uses his teaching skills...Just think of all the possible applications!!!");

        groupList.get(6).supportMember(groupList.get(0));
        groupList.get(6).supportMember(groupList.get(1));
        groupList.get(6).supportMember(groupList.get(2));
        groupList.get(6).supportMember(groupList.get(3));
        groupList.get(6).supportMember(groupList.get(4));
        groupList.get(6).supportMember(groupList.get(5));

        i = 0;
        while (i <groupList.size()) {
            GroupMember groupMember = groupList.get(i);
            System.out.println(groupList.get(i));
            i += 1;
        }

        System.out.println("Day five training. Do you want to commence?");
        new Scanner(System.in).nextLine();

        System.out.println("Peter uses his teaching skills...That's awesome!");

        groupList.get(6).supportMember(groupList.get(0));
        groupList.get(6).supportMember(groupList.get(1));
        groupList.get(6).supportMember(groupList.get(2));
        groupList.get(6).supportMember(groupList.get(3));
        groupList.get(6).supportMember(groupList.get(4));
        groupList.get(6).supportMember(groupList.get(5));

        i = 0;
        while (i <groupList.size()) {
            GroupMember groupMember = groupList.get(i);
            System.out.println(groupList.get(i));
            i += 1;
        }


        System.out.println("It's weekend. Go home.");
        new Scanner(System.in).nextLine();
        System.out.println("No, really. Have some rest.");
        new Scanner(System.in).nextLine();
        System.out.println("Seriously, mate. Go home and chill.");
        new Scanner(System.in).nextLine();
        System.out.println("Ok, I'll see myself out! ");
        new Scanner(System.in).nextLine();
        System.out.println("Bye!");
        new Scanner(System.in).nextLine();
        System.out.println("I'm not good at saying goodbyes...");
        new Scanner(System.in).nextLine();
        System.out.println("This time it's serious, though.");
        new Scanner(System.in).nextLine();
        System.out.println("I've taken the red pill.");
        


    }
}
