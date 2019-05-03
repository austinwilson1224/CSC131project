package server;


/**
 * 
 * this is the user class
 * @author austinwilson
 *
 */
public class User {
	private static String Fname;
	private static String Lname; 
	private static String id;
	public static String[] devices = new String[5];
	public static boolean getID;
	private Device device;
	public User(String Fname,String Lname, String id) {
		this.Fname = Fname;
		this.Lname = Lname; 
		this.id = id; 
	}
	
	
	public User(String Fname, String Lname) {
		this.Fname = Fname;
		this.Lname = Lname; 
	}


	public void setFirstName(String Fname) {
		this.Fname = Fname;
	}
	public void setLastName(String Lname)
	{
		this.Lname = Lname; 
	}
	
	public static void setId(String Id) {
		//String[] devices = new String[5]; 
		for(int i = 0; i < devices.length; i++)
		{
			while(devices[i] != null)
			{
				i++;
			}
			devices[i] = User.id;
		}
	}
	public void setDevice(String name,String ID,String location) {
		device  = new Device(name,ID,location);
	}
	
	//getters
	public static String getFirstName() {
		return Fname;
	}
	public static String getLastName() {
		return Lname;
	}
	public static String getId() {
		for(int i = 0; i < devices.length; i++)
		{
			System.out.print("Device: "+devices[i]);
		}
		return id;
	}
	public String getInformation()
	{
		return this.Fname;
		//return this.Lname;
		//return this.id; 
	}
	public Device getDevice() {
		return this.device;
	}
}

	
