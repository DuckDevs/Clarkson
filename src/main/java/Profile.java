/**
 * Created by diego on 23/01/15.
 */
public class Profile {

	private String fullName;

	private Gender gender;

	private String picture;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "Profile{" +
				"fullName='" + fullName + '\'' +
				", gender=" + gender +
				", picture='" + picture + '\'' +
				'}';
	}
}
