package server;

//Jorge, jorge, jorge of el jungle


public class Device {
	//this is the device driver
	//most devices should have a name and an ID
	private String name,ID;
	private String location;
	private boolean lost;
	
	//default constructor
	public Device() {
		this.name = "";
		this.ID = "";
		this.lost = false;
	}
	public Device(String name, String ID,String location) {
		this.name = name;
		this.ID = ID;
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
	public void setID(String ID) {
		this.ID = ID;
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
	public String getID() {
		return this.name;
	}
	public String getLocation() {
		return this.location;
	}
}
