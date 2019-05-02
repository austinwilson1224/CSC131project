package server;
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		
		Create();
		Present();
		
	}
	public static void Present()
	{
		System.out.println("*************************");
		System.out.print("User: " +User.getFirstName()+ " "+User.getLastName()+"\n");
		System.out.println("Saved Device ID: " +User.getId());
		System.out.println("*************************");
	}
	public static void Verify()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter First name: ");
		String Fname = scan.next();
		System.out.println();
		System.out.print("Please enter Last name: ");
		String Lname = scan.next();
		System.out.println();
		System.out.print("Please enter Device ID: ");
		String ID = scan.next();
		System.out.println();
	}
	public static User Create()
	{
		System.out.println(" CREATE USER");
		System.out.println("******************");
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter First name: ");
		String Fname = scan.next();
		System.out.println();
		System.out.print("Please enter Last name: ");
		String Lname = scan.next();
		System.out.println();
		System.out.print("Please enter Device ID: ");
		int ID = scan.nextInt();
		System.out.println();
		User user = new User(Fname,Lname, ID); 
		return user; 
		
	}
	
	

}
