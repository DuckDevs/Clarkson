import java.util.Scanner;

/**
 * Created by Lucas on 1/23/2015.
 */
public class AddLifeEventCommand implements Command {
    @Override
    public String getName() {
        return "Add life event";
    }

    @Override
    public void execute(ClarksonContext context) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Oh great, what is this event all about?");

        Integer lifeEventType = -1;
        do {

            System.out.println("Please, choose one of the following:");
            for (int i = 0; i < context.getLifeEventTypes().size(); i++) {
                System.out.println((i + 1) + " - " + context.getLifeEventTypes().get(i).getDescription());
            }

            lifeEventType = sc.nextInt();
        } while (lifeEventType <= 0 || lifeEventType > context.getLifeEventTypes().size());
        sc.nextLine();

        Message message = new Message();

        System.out.println("Great, now say something about this event:");
        message.setText(sc.nextLine());

        LifeEvent newLifeEvent = new LifeEvent();
        newLifeEvent.setLifeEventType(context.getLifeEventTypes().get(lifeEventType - 1));
        newLifeEvent.setMessage(message);

        context.getLoggedUser().getLifeEvents().add(newLifeEvent);
        System.out.println("Life event added like a boss!");
    }
}
