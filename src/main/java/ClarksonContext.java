import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego on 23/01/15.
 */
public class ClarksonContext {
	private List<AttachmentType> attachmentTypes = new ArrayList<>();
	private List<LifeEventType> lifeEventTypes = new ArrayList<>();
	private List<Gender> genders = new ArrayList<>();

	private List<User> users = new ArrayList<>();
	private User loggedUser;

	public ClarksonContext () {
		AttachmentType attachmentType;
		attachmentType = new AttachmentType();
		attachmentType.setDescription("Photo");
		attachmentTypes.add(attachmentType);

		attachmentType = new AttachmentType();
		attachmentType.setDescription("Video");
		attachmentTypes.add(attachmentType);

		LifeEventType lifeEventType;
		lifeEventType = new LifeEventType();
		lifeEventType.setDescription("Party");
		lifeEventTypes.add(lifeEventType);

		lifeEventType = new LifeEventType();
		lifeEventType.setDescription("Orgy");
		lifeEventTypes.add(lifeEventType);

		lifeEventType = new LifeEventType();
		lifeEventType.setDescription("Class");
		lifeEventTypes.add(lifeEventType);

		lifeEventType = new LifeEventType();
		lifeEventType.setDescription("Work");
		lifeEventTypes.add(lifeEventType);

		Gender gender;
		gender = new Gender();
		gender.setDescription("male");
		genders.add(gender);

		gender = new Gender();
		gender.setDescription("female");
		genders.add(gender);

		gender = new Gender();
		gender.setDescription("who cares?");
		genders.add(gender);
	}

	public List<AttachmentType> getAttachmentTypes() {
		return attachmentTypes;
	}

	public void setAttachmentTypes(List<AttachmentType> attachmentTypes) {
		this.attachmentTypes = attachmentTypes;
	}

	public List<LifeEventType> getLifeEventTypes() {
		return lifeEventTypes;
	}

	public void setLifeEventTypes(List<LifeEventType> lifeEventTypes) {
		this.lifeEventTypes = lifeEventTypes;
	}

	public List<Gender> getGenders() {
		return genders;
	}

	public void setGenders(List<Gender> genders) {
		this.genders = genders;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(User loggedUser) {
		this.loggedUser = loggedUser;
	}
}
