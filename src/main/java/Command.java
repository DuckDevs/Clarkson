/**
 * Created by diego on 23/01/15.
 */
public interface Command {

	public String getName();

	public void execute(ClarksonContext context);
}
