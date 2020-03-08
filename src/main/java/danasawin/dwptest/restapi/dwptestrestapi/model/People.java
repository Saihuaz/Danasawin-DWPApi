package danasawin.dwptest.restapi.dwptestrestapi.model;

import org.springframework.stereotype.Component;

@Component
public class People extends Object {
	private int id;
	private String firstName;
	private String lastName;
	
	private double latitude;
	private double longitude;
	
	public People() {}
	public People(int id, String firstName, String lastName, double latitude, double longitude) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}



	@Override
	public String toString() {
		return "People [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
	
	

}
