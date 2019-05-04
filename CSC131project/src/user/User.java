package user;

import java.util.ArrayList;
import java.util.List;

import device.Device;

/**
 * 
 * this is the user class
 * @author austinwilson
 *
 */
public class User {
	private String fname;
	private String lname; 
	private String id;
	private List<Device> devices= new ArrayList<Device>(); 
	
	
	public User(String fname, String lname) {
		this.fname = fname;
		this.lname = lname; 
	}
	
	public String getFname() {
		return fname;
	}




	public void setFname(String fname) {
		this.fname = fname;
	}




	public String getLname() {
		return lname;
	}




	public void setLname(String lname) {
		this.lname = lname;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public List<Device> getDevices() {
		return devices;
	}




	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}




	public void addDevice(Device device) {
		this.devices.add(device);
	}


}