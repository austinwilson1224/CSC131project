package device;

import java.util.ArrayList;
import java.util.List;
import notification.Notification;

public class Device {
	//this is the device driver
	//most devices should have a name and an id
	private String name,id;
	private String location;
	private boolean lost;
	private List<Notification> notifications = new ArrayList<>();
	//this is a list to store the id numbers of all devices in existence 
	//private ArrayList<Integer> existingIds = new ArrayList<Integer>();
	
	//default constructor
	public Device() {
		this.name = "";
		this.id = "";
		this.lost = false;
	}
	
	// param constructor
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
	
	@Override
	public boolean equals(Object obj) {
		 if (this == obj) {
             return true;
         }
         if (obj == null || getClass() != obj.getClass()) {
             return false;
         }
         Device device = (Device) obj;
 		 return (id==device.id && name==device.name && name.equals(device.name));
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}
	
	public void addNotification(Notification notification) {
		this.notifications.add(notification);
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "Id: " + this.id;
	}
	
}
