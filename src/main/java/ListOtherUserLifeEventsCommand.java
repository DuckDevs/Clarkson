import java.util.Scanner;

/**
 * Created by Lucas on 1/23/2015.
 */
public class ListOtherUserLifeEventsCommand implements Command {
    @Override
    public String getName() {
        return "Show other people Life Events";
    }

    @Override
    public void execute(ClarksonContext context) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tell me the username for the person you want to stal ... I mean, see the Life Events");
        String queryUsername = sc.nextLine();

        User foundUser = null;
        for(User user : context.getUsers()){
            if(user.getUsername().equals(queryUsername)){
                foundUser = user;
                break;
            }
        }

        if(foundUser != null) {

            if(foundUser.getLifeEvents().size() > 0) {
                System.out.println("Here it goes: " + foundUser.getLifeEvents().toString());
            } else {
                System.out.println("Maan, thi pearson has no Life Events, what a noob!");
            }
        } else {

            System.out.println("User not found, I'm so sorry ;-;");
        }
    }
}
