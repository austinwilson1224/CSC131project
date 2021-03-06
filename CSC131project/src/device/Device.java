package device;

import java.util.ArrayList;
import java.util.List;

import notification.Notification;

public class Device {
	//this is the device driver
	//most devices should have a name and an id
	private String name;
	private String location;
	private boolean lost;
	private List<Notification> notifications = new ArrayList<>();
	
	//default constructor
	public Device() {
		this.name = "";
		this.lost = false;
	}
	
	public Device(String name) {
		this.name = name;
	}
	
	// param constructor
	public Device(String name, String id,String location) {
		this.name = name;
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
	
	public String getLocation() {
		return this.location;
	}
	public boolean isLost() {
		return this.lost;
	}
	
	@Override
	public boolean equals(Object obj) {
		 if (this == obj) {
             return true;
         }
         if (obj == null || getClass() != obj.getClass()) {
             return false;
         }
         Device device = (Device) obj;
 		 return (name==device.name && name.equals(device.name));
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name;
	}
	
}
