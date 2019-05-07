package server;

import java.util.HashSet;
import java.util.Set;

import device.Device;
import notification.Notification;

/*
* author CJ Angelina Torres
*/

public class ServerService {
	//Composite Patterns (HAS-A relationship)
	private static Set<Device> deviceList = new HashSet<>();
	private static Set<Device> lostDeviceList = new HashSet<>();
	private static Set<Device> foundDeviceList = new HashSet<>();
	
    public void addDevice(Device currentDevice) {
    	if(deviceList.contains(currentDevice)) {
    		System.out.println("ERROR Adding Device: Device already present: " + currentDevice.getName());
    	}
    	else {
    		deviceList.add(currentDevice);
    		System.out.println("SUCCESS Adding Device: " + currentDevice.getName());
    	}
    }

    public Set<Device> getDeviceList(){
    	return deviceList;
    }
    
    public Set<Device> getLostDeviceList(){
    	return lostDeviceList;
    }
    
    public Set<Device> getFoundDeviceList(){
    	return foundDeviceList;
    }
    
    public void addLostDevice(Device currentDevice) {
        System.out.println("Lost Device Mode");	
        if(lostDeviceList.contains(currentDevice)) {
        	System.out.println("ERROR Adding Device to Lost Device List: Device already present in list: " + currentDevice.getName());
        }
        else {
        	lostDeviceList.add(currentDevice);
        	System.out.println("SUCCESS. Current Device " + currentDevice.getName() + " added into Lost Devices list");
        }
    }
    
    
    public void foundDevice(Device currentDevice) {
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
        		System.out.println("SUCCESS. Current Device " + currentDevice.getName() + " added into Found Devices list");
        	}
        }
    }
    
    public void sendNotification(Notification notification) {
    	String currentRecipient = notification.getReceiver();
    }
    
}
