package application;
import java.util.Scanner;

import device.Device;
import user.User;

public class Main {
	//test
	//test2
	private static Scanner scan = new Scanner(System.in);
	static String answer; 
	static String anotherDevice; 
	
	
	public static void main(String... args)
	{
		int choice;
		do {
		System.out.println("1. Create User\t2.Add Device\t3.Lost Device\t4.Found Device\t5.Block Device\t0.Exit");
		System.out.print("Enter your choice\t");
		choice = scan.nextInt();
	    switch(choice) {
	    case 1:
	    	createUser();
	    	break;
	    case 2:
	    	Device device = new Device();
	    	System.out.print("What is your name?");
	    	String name = scan.next();
	    	//get id
	    	
	    	//get location
	    	//addDevice();
	    	break;
	    case 3:
	    	//return device 
	    	//lostDevice();
	    	break;
	    case 4: 
	    	//foundDevice();
	    	break;
	    case 5:
	    	//blockDevice();
	    	break;
	    case 0:
	    	break;
	    default:
	    	System.out.println("Wrong option. Try again");
	    }
		}
		while(choice!=0);
		System.out.println("Exiting application.");
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
	
	public static User createUser()
	{
		System.out.println(" CREATE USER MODE");
		System.out.println("******************");
		scan = new Scanner(System.in);
		System.out.print("Please enter First name: ");
		String fname = scan.next();
		System.out.println();
		System.out.print("Please enter Last name: ");
		String lname = scan.next();
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
		
		User user = new User(fname, lname); 
		return user; 
	}
	

}