package application;
import java.util.Random;
import java.util.Scanner;

import device.Device;
import server.ServerService;
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
		System.out.println("-------------------\nMAIN MENU\n");
		System.out.println("1. Create User\n2.Add Device\n3.Lost Device\n4.Found Device\n5.ListUsers\n6.List Devices\n7.List Lost Devices\n0.Exit");
		System.out.println("-------------------\n");
		System.out.print("Enter your choice: ");
		choice = scan.nextInt();
	    switch(choice) {
	    case 1:
	    	//create new user...
	    	createUser();
	    	break;
	    case 2:
	    	//create new device
	    	createDevice();
	    	break;
	    case 3:
	    	lostDevice();
	    	break;
	    case 4: 
	    	findDevice();
	    	break;
	    case 5:
	    	listUsers();
	    	break;
	    case 6:
	    	listDevices();
	    	break;
	    case 7:
	    	listLostDevices();
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
	
	private static void listLostDevices() {
		System.out.println(ServerService.getLostDeviceList());
		
	}

	private static void lostDevice() {
		System.out.println("LOST DEVICE MODE");
		System.out.print("Enter Device Name: ");
		String deviceName = new Scanner(System.in).nextLine();
		Device currentDevice = ServerService.getDevice(deviceName);
		ServerService.addLostDevice(currentDevice);
	}

	private static void listUsers() {
		System.out.println(ServerService.getUserList());
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
		System.out.print("Please enter First name: ");
		String fname = scan.next();
		System.out.println();
		System.out.print("Please enter Last name: ");
		String lname = scan.next();
		System.out.println();
		String id = String.valueOf(Math.abs(new Random().nextInt()));
		User user = new User(fname, lname, id); 
		ServerService.addUser(user);
		return user; 
	}
	
	//creat device is case 2
	public static void createDevice() {
		System.out.print("Please enter Device Name: ");
		String deviceName = new Scanner(System.in).nextLine();
		String id = String.valueOf(Math.abs(new Random().nextInt()));
		Device currentDevice = new Device(deviceName);
		ServerService.addDevice(currentDevice);
	}
	
	public static void listDevices() {
		System.out.println(ServerService.getDeviceList());
	}
	
	
	public static void findDevice() {
		System.out.print("Please enter Device Name: ");
		String deviceName = new Scanner(System.in).nextLine();
		String id = String.valueOf(Math.abs(new Random().nextInt()));
		Device currentDevice = new Device(deviceName);
		ServerService.addFoundDevice(currentDevice);

	}
	

	

}