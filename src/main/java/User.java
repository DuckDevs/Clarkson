import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by diego on 23/01/15.
 */
public class User {

	public User() {
	 	lifeEvents = new ArrayList<>();
	}

	private String username, password;

	private String email;

	private Date birthDate;

	private Profile profile;

	private List<LifeEvent> lifeEvents;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<LifeEvent> getLifeEvents() {
		return lifeEvents;
	}

	public void setLifeEvents(List<LifeEvent> lifeEvents) {
		this.lifeEvents = lifeEvents;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", birthDate=" + birthDate +
				", profile=" + profile +
				", lifeEvents=" + lifeEvents +
				'}';
	}
}
