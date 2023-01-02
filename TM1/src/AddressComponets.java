public class AddressComponets {

	String apt;
	String section;
	String postCode;
	String city;
	String state;
	String street;

	//setter and getter
	public String getApt() {
		return apt;
	}

	public void setApt(String apt) {
		this.apt = apt;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	//provide public get and set methods to access and update the value of a variable

	//parameter constructor
	public AddressComponets(String apt, String section, String postCode, String city, String state, String street) {
		this.apt = apt;
		this.section = section;
		this.postCode = postCode;
		this.city = city;
		this.state = state;
		this.street = street;
	}

	//default constructor
	public AddressComponets() {

	}

}
