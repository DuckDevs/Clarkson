/**
 * Created by diego on 23/01/15.
 */
public class Location {

	private String name;

	private Long lat, lng, altitude;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getLat() {
		return lat;
	}

	public void setLat(Long lat) {
		this.lat = lat;
	}

	public Long getLng() {
		return lng;
	}

	public void setLng(Long lng) {
		this.lng = lng;
	}

	public Long getAltitude() {
		return altitude;
	}

	public void setAltitude(Long altitude) {
		this.altitude = altitude;
	}
}
