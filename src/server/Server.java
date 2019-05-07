package server;

public class Server {
	
	private int id;
	private static Server server = new Server();
	
	private Server() {
	}
	
	public static Server getInstance() {
		return server;
	}
		
	public Server(int serverID) {
		this.id = serverID;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return this.id;
	}
	
}
