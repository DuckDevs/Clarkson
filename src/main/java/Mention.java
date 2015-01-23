/**
 * Created by diego on 23/01/15.
 */
public class Mention {

	private User mentioned, mentioner;

	public User getMentioned() {
		return mentioned;
	}

	public void setMentioned(User mentioned) {
		this.mentioned = mentioned;
	}

	public User getMentioner() {
		return mentioner;
	}

	public void setMentioner(User mentioner) {
		this.mentioner = mentioner;
	}
}
