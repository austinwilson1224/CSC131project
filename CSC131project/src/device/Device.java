package device;

public class Device {
	//this is the device driver
	//most devices should have a name and an id
	private String name,id;
	private String location;
	private boolean lost;
	
	//default constructor
	public Device() {
		this.name = "";
		this.id = "";
		this.lost = false;
	}
	public Device(String name, String id,String location) {
		this.name = name;
		this.id = id;
		this.location = location;
		//this.lost = false;
	}
	
	
	/**
	 * setter methods
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void setid(String id) {
		this.id = id;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setLost() {
		this.lost = true;
	}
	public void setFound() {
		this.lost = false;
	}
	
	
	
	
	/**
	 * getter methods
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	public String getid() {
		return this.id;
	}
	public String getLocation() {
		return this.location;
	}
	public boolean isLost() {
		return this.lost;
	}
}
