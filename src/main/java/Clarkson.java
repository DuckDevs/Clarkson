import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by diego on 23/01/15.
 */
public class Clarkson {

	public static void main(String[] args) {
		ClarksonContext context = new ClarksonContext();
		List<Command> commands = new ArrayList<>();

		Command userCreationCommand = new UserCreationCommand();
		commands.add(userCreationCommand);

		userCreationCommand.execute(context);

		context.setLoggedUser(context.getUsers().get(0));

		while (true) {
			System.out.println("Select a command:");
			for (int i = 0; i < commands.size(); i++) {
				System.out.println((i + 1) + " - " + commands.get(i).getName());
			}

			Integer selectedCommand = null;
			do {

				if (selectedCommand != null) {
					System.out.println("Comando inválido...");
				}

				Scanner sc = new Scanner(System.in);
				selectedCommand = sc.nextInt();
			} while (selectedCommand < 0 || selectedCommand > commands.size());

			commands.get(selectedCommand - 1).execute(context);
			System.out.println();
		}
	}
}
