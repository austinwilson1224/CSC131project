package device;

import notification.Notification;

public class DeviceService{
    
    public void readNotifications(Device currentDevice) {
    	// Iterator pattern
    	for(Notification currentNotification:currentDevice.getNotifications()) {
    		System.out.println(currentNotification);
    	}
    }
    
    
    
}


