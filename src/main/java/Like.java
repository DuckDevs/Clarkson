import java.util.Date;

/**
 * Created by diego on 23/01/15.
 */
public class Like {

	private User liker;

	private Date date;

	public User getLiker() {
		return liker;
	}

	public void setLiker(User liker) {
		this.liker = liker;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
