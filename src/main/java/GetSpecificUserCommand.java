import java.util.Scanner;

/**
 * Created by Lucas on 1/23/2015.
 */
public class GetSpecificUserCommand implements Command {
    @Override
    public String getName() {
        return "Get an user";
    }

    @Override
    public void execute(ClarksonContext context) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tell me the username for the user that you want, please!");
        String queryUser = sc.nextLine();

        User foundUser = null;
        for(User user : context.getUsers()){
            if(user.getUsername().equals(queryUser)){
                foundUser = user;
                break;
            }
        }

        if(foundUser != null) {

            System.out.println("I found someone that matched that criteria, here have it: " + foundUser.toString());
        } else {

            System.out.println("User not found, I'm so sorry ;-;");
        }
    }
}
