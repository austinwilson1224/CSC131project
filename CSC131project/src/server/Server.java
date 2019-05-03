package server;

public class Server {
	/**
	 * this is where we need to code the listener method
	 * 
	 * there will be an instance of an object of maybe a user
	 * when the person loses their device they need to notify the server
	 * that the device is gone
	 * the listener will listen for when this call goes out and will update 
	 * the device status to show that it has been lost
	 */
	
	
	
	private User user;
	//private Device device;
	private int serverID;
	
	
	/**
	 *user notifies that the device has been lost){
	  update device status
	  also when the device is found then update to not lost....
	 */
	
	  public void listener(){
	  		if(user.getDevice().isLost()) {
	  			
	  			//finish later
	  			//return user.getDevice().getLocation();
	  		}
	  				

	  
	  
	  }

	
	
	
	public Server(int serverID) {
		this.serverID = serverID;
	}
	
	
	
	public void setID(int id) {
		this.serverID = id;
	}
	
	public int getID() {
		return this.serverID;
	}	
	
	
}
