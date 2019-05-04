package application;
import java.util.Scanner;

import user.User;

public class Main {
	
	private static Scanner scan;
	static String answer; 
	static String anotherDevice; 
	public static void main(String[] args)
	{
		
		Create();
		Present();
		
		
		//Test
	}
	public static void isLost()
	{
		System.out.println("Have you lost your device? \n Reply with \"Yes\" or \"No\" ");
		answer = scan.next();
		if(answer.equalsIgnoreCase("Yes"))
		{
			
		}
	}
	public static void Present()
	{
		System.out.println("*************************");
		//System.out.print("User: " +User.getFirstName()+ " "+User.getLastName()+"\n");
		//System.out.println("Saved Device ID: " +User.getId());
		System.out.println("*************************");
	}
	public static void Verify()
	{
		scan = new Scanner(System.in);
		System.out.print("Please enter Device ID: ");
		//String ID = scan.next();
//		while(User.getId() != ID)
//		{
//			System.out.print("ID not found. Please try again \n Please enter Device ID: ");
//			ID = scan.next(); 
//		}
//		if(User.getId() == ID)
//		{
//			System.out.println("Searching ... ");
//		}
//		
		
		System.out.println();
	}
	public static User Create()
	{
		System.out.println(" CREATE USER");
		System.out.println("******************");
		scan = new Scanner(System.in);
		System.out.print("Please enter First name: ");
		String Fname = scan.next();
		System.out.println();
		System.out.print("Please enter Last name: ");
		String Lname = scan.next();
		System.out.println();
		System.out.print("Please enter Device ID: ");
		//String ID = scan.next();
		//User.setId(ID);
		System.out.println();
		do
		{
			System.out.print("Would you like to add another device? (Yes/No)");
			anotherDevice = scan.next(); 
			if(anotherDevice.equalsIgnoreCase("Yes"))
	
				System.out.print("Please enter Device ID: ");
				//ID = scan.next();
			//	User.setId(ID);
		}while (anotherDevice.equalsIgnoreCase("Yes"));
		User user = new User(Fname,Lname); 
		return user; 
		
	}
	
	

}
