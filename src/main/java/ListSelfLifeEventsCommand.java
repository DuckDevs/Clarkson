/**
 * Created by Lucas on 1/23/2015.
 */
public class ListSelfLifeEventsCommand implements Command {
    @Override
    public String getName() {
        return "List my very own Life Events";
    }

    @Override
    public void execute(ClarksonContext context) {

        if(context.getLoggedUser().getLifeEvents().size() == 0) {

            System.out.println("Oh man, you have no life events so far. Wouldn't it be nice if you added one? ;)");
            return;
        }

        System.out.println("Here are your Life Events, how cool is this?\n" + context.getLoggedUser().getLifeEvents().toString());
    }
}
