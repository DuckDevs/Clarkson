import java.util.Scanner;

/**
 * Created by Lucas on 1/23/2015.
 */
public class RemoveUserCommand implements Command {
    @Override
    public String getName() {
        return "Remove an user";
    }

    @Override
    public void execute(ClarksonContext context) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tell the username for the user you want to remove!");

        String removeUser = sc.nextLine();

        if(context.getUsers().size() <= 1){
            System.out.println("There is only one user and I don't want to remove him, he's pretty you know?");
            return;
        }

        User foundUser = null;
        for(User user : context.getUsers()){
            if(user.getUsername().equals(removeUser)){
                foundUser = user;
                break;
            }
        }
        if(foundUser != null) {

            context.getUsers().remove(foundUser);
            System.out.println("User removed!");
        } else {

            System.out.println("User not found, I'm so sorry ;-;");
        }

    }
}
