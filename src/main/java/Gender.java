/**
 * Created by diego on 23/01/15.
 */
public class Gender {

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Gender{" +
				"description='" + description + '\'' +
				'}';
	}
}
