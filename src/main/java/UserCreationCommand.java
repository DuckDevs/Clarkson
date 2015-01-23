import java.util.Scanner;

/**
 * Created by diego on 23/01/15.
 */
public class UserCreationCommand implements Command {
	@Override
	public String getName() {
		return "User creation";
	}

	@Override
	public void execute(ClarksonContext context) {
		User user = new User();
		Profile profile = new Profile();
		user.setProfile(profile);

		Scanner sc = new Scanner(System.in);

		System.out.println("User creation command :)\n");

		System.out.println("Enter your full name:");
		profile.setFullName(sc.nextLine());

		System.out.println("Enter your username:");
		user.setUsername(sc.nextLine());

		System.out.println("Enter your password:");
		user.setPassword(sc.nextLine());

		System.out.println("Enter your email:");
		user.setEmail(sc.nextLine());

		profile.setGender(context.getGenders().get(0));

		context.getUsers().add(user);

		System.out.println("User created:\n" + user.toString());
	}
}
