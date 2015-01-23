/**
 * Created by Lucas on 1/23/2015.
 */
public class UserListingCommand implements Command {
    @Override
    public String getName() {
        return "User listing";
    }

    @Override
    public void execute(ClarksonContext context) {

        System.out.println(context.getUsers().toString());
    }
}
