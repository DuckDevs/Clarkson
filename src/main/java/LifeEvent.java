import java.util.Date;
import java.util.List;

/**
 * Created by diego on 23/01/15.
 */
public class LifeEvent {

	private Date date;

	private LifeEventType lifeEventType;

	private Location location;

	private Message message;

	private Attachment attachment;

	private List<Comment> comments;

	private List<Like> likes;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public LifeEventType getLifeEventType() {
		return lifeEventType;
	}

	public void setLifeEventType(LifeEventType lifeEventType) {
		this.lifeEventType = lifeEventType;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Like> getLikes() {
		return likes;
	}

	public void setLikes(List<Like> likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "LifeEvent{" +
				"date=" + date +
				", lifeEventType=" + lifeEventType +
				", location=" + location +
				", message=" + message +
				", attachment=" + attachment +
				", comments=" + comments +
				", likes=" + likes +
				'}';
	}
}
