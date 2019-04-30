package Device;

public class Device {
	//this is the device driver
	//most devices should have a name and an ID
	private String name,ID;
	public Device(String name, String ID) {
		this.name = name;
		this.ID = ID;
	}
	
	
	//setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	
	//getter methods
	public String getName() {
		return this.name;
	}
	public String getID() {
		return this.name;
	}
}
