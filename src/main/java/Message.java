import java.util.List;

/**
 * Created by diego on 23/01/15.
 */
public class Message {

	private String text;

	private List<Mention> mentions;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Mention> getMentions() {
		return mentions;
	}

	public void setMentions(List<Mention> mentions) {
		this.mentions = mentions;
	}
}
