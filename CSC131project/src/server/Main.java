package server;
import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Verify(); 
		
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
	public String Create()
	{
		System.out.print("Please enter First name: ");
		String Fname = scan.next();
		System.out.println();
		System.out.print("Please enter Last name: ");
		String Lname = scan.next();
		System.out.println();
		System.out.print("Please enter Device ID: ");
		int ID = scan.nextInt();
		System.out.println();
		User user = new User(Fname, ID);  
		
	}
	
	

}
