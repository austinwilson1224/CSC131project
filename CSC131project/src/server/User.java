package server;


/**
 * 
 * this is the user class
 * @author austinwilson
 *
 */
public class User {
	private String Fname;
	private String Lname; 
	private int id;
	public User(String name,int id) {
		this.Fname = Fname;
		this.Lname = Lname; 
		this.id = id; 
	}
	
	//setters djh
	public void setFirstName(String Fname) {
		this.Fname = Fname;
	}
	public void setLastName(String Lname)
	{
		this.Lname = Lname; 
	}
	
	public void setId(int Id) {
		this.id = Id;
	}
	
	//getters
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public String getInformation()
	{
		return this.name;
	}
}

	
