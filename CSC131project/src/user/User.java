package user;


/**
 * 
 * this is the user class
 * @author austinwilson
 *
 */
public class User {
	private String name;
	private int id;
	public User(String name,int id) {
		this.name = name;
	}
	
	//setters 
	public void setName(String name) {
		this.name = name;
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
	
}

	
