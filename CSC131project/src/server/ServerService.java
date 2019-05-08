package server;

import java.util.HashSet;
import java.util.Set;

import device.Device;
import user.User;

/*
* author CJ Angelina Torres
*/

public class ServerService {
	//Composite Patterns (HAS-A relationship)
	private static Set<Device> deviceList = new HashSet<>();
	private static Set<Device> lostDeviceList = new HashSet<>();
	private static Set<Device> foundDeviceList = new HashSet<>();
	private static Set<User> userList = new HashSet<>();
	
    public static Set<User> getUserList() {
		return userList;
	}

	public static void setUserList(Set<User> userList) {
		ServerService.userList = userList;
	}
	public static Device getDevice(String deviceName) {
		for(Device currentDevice: deviceList) {
			if(currentDevice.getName().equalsIgnoreCase(deviceName)) {
				return currentDevice;
			}
		}
		System.out.println("No Such Device present");
		return null;
	}

	public static Device getLostDevice(String deviceName) {
		for(Device currentDevice: deviceList) {
			if(currentDevice.getName().equalsIgnoreCase(deviceName)) {
				return currentDevice;
			}
		}
		System.out.println("No Such Device present");
		return null;
	}
	
	public static void addUser(User currentUser) {
		userList.add(currentUser);
	}
	
	public static void addDevice(Device currentDevice) {
    	if(deviceList.contains(currentDevice)) {
    		System.out.println("ERROR Adding Device: Device already present: " + currentDevice.getName());
    	}
    	else {
    		deviceList.add(currentDevice);
    		System.out.println("SUCCESS Adding Device: " + currentDevice.getName());
    	}
    }
	
    public static Set<Device> getDeviceList(){
    	return deviceList;
    }
    
    public static Set<Device> getLostDeviceList(){
    	return lostDeviceList;
    }
    
    public static Set<Device> getFoundDeviceList(){
    	return foundDeviceList;
    }
    
    public static void addLostDevice(Device currentDevice) {
        System.out.println("Lost Device Mode");	
        if(lostDeviceList.contains(currentDevice)) {
        	System.out.println("ERROR Adding Device to Lost Device List: Device already present in list: " + currentDevice.getName());
        }
        else {
        	lostDeviceList.add(currentDevice);
        	System.out.println("SUCCESS. Current Device " + currentDevice.getName() + " added into Lost Devices list");
        }
    }
    
    
    public static void addFoundDevice(Device currentDevice) {
        System.out.println("Found Device Mode");	
        if(!lostDeviceList.add(currentDevice)) {
        	System.out.println("ERROR Adding Device to Found Device List: Device was not reported as lost in the past: " + currentDevice.getName());
        }
        else {
        	if(foundDeviceList.contains(currentDevice)) {
        	  	System.out.println("Device already present in Found Devices List: " + currentDevice.getName());
        	}
        	else {
        		foundDeviceList.add(currentDevice);
        		lostDeviceList.remove(ServerService.getLostDevice(currentDevice.getName()));
        		System.out.println("SUCCESS. Current Device " + currentDevice.getName() + " added into Found Devices list");
        	}
        }
    }
    
}
