import java.util.Date;
import java.util.List;

/**
 * Created by diego on 23/01/15.
 */
public class Comment {

	private User commentator;

	private String comment;

	private List<Mention> mentions;

	private Date date;

	public User getCommentator() {
		return commentator;
	}

	public void setCommentator(User commentator) {
		this.commentator = commentator;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<Mention> getMentions() {
		return mentions;
	}

	public void setMentions(List<Mention> mentions) {
		this.mentions = mentions;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
