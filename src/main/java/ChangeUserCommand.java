import java.util.Scanner;

/**
 * Created by Lucas on 1/23/2015.
 */
public class ChangeUserCommand implements Command {
    @Override
    public String getName() {
        return "Change logged user";
    }

    @Override
    public void execute(ClarksonContext context) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tell me your username");
        String username = sc.nextLine();

        System.out.println("Okay, great. Now tell me your password");
        String password = sc.nextLine();

        User foundUser = null;
        for(User user : context.getUsers()){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                foundUser = user;
                break;
            }
        }

        if(foundUser != null) {

            context.setLoggedUser(foundUser);
            System.out.println("Welcome, " + foundUser.getProfile().getFullName() + ". Have a great day!");
        } else {

            System.out.println("Sorry bro, didn't find anyone with those credentials ;-;");
        }
    }
}
