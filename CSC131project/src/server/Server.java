package server;

public class Server {
	private int serverID;
	
	public Server(int serverID) {
		this.serverID = serverID;
	}
	
	
	/**
	 * setter methods
	 */
	
	
	public void setID(int id) {
		this.serverID = id;
	}
	
	
	
	/**
	 * getter method
	 */
	public int getID() {
		return this.serverID;
	}
	
	
	
}
