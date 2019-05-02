package server;

public class Server {
	private int serverID;
	
	public Server(int serverID) {
		this.serverID = serverID;
	}
	

	
	public static void main(String[] args) {
		Device Austin = new Device("Austin","1","Sacramento");
		Austin.setLost();
		System.out.println("You device is in " + Austin.getLocation());
	}

	
	
	public void setID(int id) {
		this.serverID = id;
	}
	
	public int getID() {
		return this.serverID;
	}	
	
	
}
