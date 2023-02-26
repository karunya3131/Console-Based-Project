/**The title of the project is Airline Reservation System.
 * 
 * @author karunya
 *
 */
//It is stored in a airlinereservationsystem package.
package airlinereservationsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Here we created a class Airline which contains public,private attributes and methods.
public class Airline {

	//Created all attributes in private so that no one can access them, only inside the class we can have the access.
	private String airline_name, origin, destination,airlineUnique_id;
	private int seating_availability, fare;

	private static final Scanner constant = new Scanner(System.in);	


	/* Created a list of Airline type of object airlinelist with new arraylist memory.
	 * Also it is a Run time polymorphism.
	 */
	List<Airline> newairlinelist = new ArrayList<Airline>();

	//It is a no argument constructor of Airline class.First it will get called  and display the print statements.
	public Airline() {

		//First it will print all the print statement listed below
		System.out.println("      WELCOME TO ROYAL AIRLINES        \n");
		System.out.println("TO LOG IN,GIVE THE NECESSARY DETAILS BELOW\n");
	}

	//we created an anonymous object 'Airline'  which doesn't have any name, but it occupies memory.
	public Airline(String airlineUnique_id,String airline_name,String origin,String destination,int seating_availability,int fare){

		//This keyword is refers to the current class object and also as the names are similar we used this keyword.

		this.airlineUnique_id = airlineUnique_id ;
		this.airline_name = airline_name ;
		this.origin = origin ;
		this.destination=  destination;
		this.seating_availability = seating_availability;
		this.fare = fare;
	}


	/*Here we used setter method for the airline_id to set the value
	 *This keyword is refers to the current class object and also as the names are similar we used this keyword.
	 *Here we used used getter method for the airline_id to return it's value in a string type.
	 */
	public void setairline_id(String airlineUnique_id)
	{
		this.airlineUnique_id = airlineUnique_id;
	}
	public String getairline_id()
	{
		return airlineUnique_id;
	}


	/*Here we used setter method for the airline_name to set the value
	 *This keyword is refers to the current class object and also as the names are similar we used this keyword.
	 *Here we used used getter method for the airline_name to return it's value in a string type.
	 */
	public void setairline_name(String airline_name)
	{
		this.airline_name = airline_name;
	}
	public String getairline_name()
	{
		return airline_name;
	}


	/*Here we used setter method for the origin to set the value
	 *This keyword is refers to the current class object and also as the names are similar we used this keyword.
	 *Here we used used getter method for the origin to return it's value in a string type.
	 */
	public void setorigin(String origin)
	{

		this.origin = origin;
	}
	public String getorigin()
	{
		return origin;
	}

	/*Here we used setter method for the destination to set the value
	 *This keyword is refers to the current class object and also as the names are similar we used this keyword.
	 *Here we used used getter method for the destination to return it's value in a string type.
	 */
	public void setdestination(String destination)
	{
		this.destination = destination;
	}
	public String getdestination()
	{
		return destination;
	}


	/*Here we used setter method for the seating_availability to set the value
	 *This keyword is refers to the current class object and also as the names are similar we used this keyword.
	 *Here we used used getter method for the seating_availability to return it's value in a string type.
	 */
	public void setseating_availability(int seating_availability)
	{
		this.seating_availability = seating_availability;
	}
	public int getseating_availability()
	{
		return seating_availability;
	}

	/*Here we used setter method for the fare to set the value
	 *This keyword is refers to the current class object and also as the names are similar we used this keyword.
	 *Here we used used getter method for the fare to return it's value in a string type.
	 */
	public void setfare(int fare)
	{
		this.fare = fare;
	}
	public int getfare()
	{
		return fare;
	}

	/* It is an overridden method from the parent class Object.
	 * Usually [ tostring()] method will give the string type as a return type value
	 * Here whenever anyone calls the objectname it will print the values for that,
	 * it won't print the address because we have overridden the method
	 */
	public String toString() {
		return airlineUnique_id+" "+airline_name+" "+origin+" "+destination+" "+seating_availability+" "+fare;
	}


	/* Login is a static method and also a parameterized method 
	 * Inside this method we have a if condition which checks whether the entered ownername and password matches the given values
	 * If it is true it will execute the following print statements.
	 * if above condition fails it will come to else condition and execute the print statement
	 * Also in else condition if the credentials are wrong it will call the recheckingcredentials method
	 * Suddenly it will go to that method which is in ReservationClass class.
	 */
	public static void loginDetails(String admin_name,String admin_password) 
	{
		if(admin_name.equals("ROYAL") && admin_password.equals("karunya@31"))  
		{
			System.out.println("\nYOU HAVE SUCCESSFULLY LOGGED IN..");
			System.out.println("\n..........| WELCOME TO ROYAL AIRLINES |..........\n");
			//These statement are used to get the input from the user to perform the followings.
			System.out.println(" * TO ADD AN AIRLINE      --> PRESS 1");
			System.out.println(" * TO DISPLAY THE AIRLINE --> PRESS 2");
			System.out.println(" * TO SEARCH AN AIRLINE   --> PRESS 3");
			System.out.println(" * TO DELETE AN AIRLINE   --> PRESS 4");
			System.out.println(" * TO UPDATE AN AIRLINE   --> PRESS 5");
			System.out.println(" * TO LOGOUT              --> PRESS 6");

		}
		else
		{
			System.out.println("\nPLEASE CHECK YOUR CREDENTIALS");
			checkingcredentials();
		}
	}

	// Created a static method to get the name and password from the user as input .
	public static void checkingcredentials() {

		System.out.print("\nENTER THE ADMIN NAME: ");
		String admin_name = constant.next();

		System.out.print("\nENTER THE ADMIN PASSWORD: ");
		String admin_password = constant.next();

		loginDetails(admin_name,admin_password);
	}

	public void toAddTheDetails() 
	{
		/* we are going to add the airline details step by step by getting the details from the user
		 * And finally after getting the values we are going to add the details in the list with the help of an object created for list
		 */
		System.out.println("TO ADD AN AIRLINE FILL THE REQUIRED DETAILS GIVEN BELOW\n");

		System.out.println("ENTER THE AIRLINE_ID: ");
		String airlineUnique_id = constant.next();
		constant.nextLine();
		System.out.println("ENTER THE AIRLINE_NAME: ");
		String airline_name = constant.nextLine();

		System.out.println("ENTER THE AIRLINE_ORIGIN: ");
		String origin = constant.nextLine();

		System.out.println("ENTER THE AIRLINE_DESTINATION: ");
		String destination = constant.nextLine();

		System.out.println("ENTER THE AIRLINE_SEATING_CAPACITY: ");
		int seating_availability = constant.nextInt();  //

		System.out.println("ENTER THE AIRLINE_FARE:: ");
		int fare = constant.nextInt();

		newairlinelist.add(new Airline(airlineUnique_id,airline_name,origin,destination,seating_availability,fare));
		System.out.println("Airline Details Are Added Successfully!");
	}

	public  void toDisplayTheDetails()
	{
		/* we are going to display the airline details in the list using iterator 
		 * In iterator we have 2 important methods [hasnext() and next()]
		 * [ hasnext()] is used to see whether the list has any values or not and returns true or false.
		 * [ next()] is used to display the next values in the list
		 * Here we created an object which gets the values present in the airLinelist.
		 */

		System.out.println("THE ARILINE WE HAVE CURRENTLY ARE LISTED BELOW:\n");

		Iterator <Airline> displaydetails = newairlinelist.iterator();
		while(displaydetails.hasNext()) 
			System.out.println(displaydetails.next());

	}

	public void toSearchTheDetails(){
		/* we are going to display the airline details when the user search for a particular id in the list 
		 * Initially we placed a boolean condition as false to check if the id is found or not 
		 * Then we get the input id from user and then to display the details we used for loop here
		 * Inside the for loop we are checking if condition that the given id and id in the list is equal or not
		 * Atlast we placed another condition .
		 */

		System.out.println("TO SEARCH THE AIRLINE FILL THE DETAILS LISTED BELOW..\n");

		boolean search_condition = false;

		System.out.print("ENTER THE AIRLINE_ID TO SEARCH: ");
		String search_id = constant.next();

		for(Airline showdetails:newairlinelist) 
		{
			if(showdetails.getairline_id().equals(search_id))
			{
				search_condition = true;
				System.out.println("Airline Detail Found");
				break;
			}
		}
		if(search_condition == false)
		{
			System.out.println("Airline Detail Not Found");
		}
	}

	public void toDeleteTheDetails()

	{
		/* we are going to delete the airline details when the user want to delete a particular id in the list .
		 * The same operation which we have done in case 3 follows here.
		 * here we removes the id details given by the user
		 */
		System.out.println("TO DELETE AN ID DETAILS ENTER THE DETAILS ASKED BELOW..\n");
		boolean delete_condition= false;

		System.out.print("ENTER THE AIRLINE_ID TO DELETE: ");
		String delete_id= constant.next();

		for(Airline deletedetails:newairlinelist) 
		{
			if(deletedetails.getairline_id().equals(delete_id)) {
				delete_condition = true;
				newairlinelist.remove(deletedetails);
				System.out.println("Deleted succesfully");
				break;
			}
		}

		if(delete_condition == false) 
			System.out.println("Airline Detail Not Found");

	}

	public void toUpdateTheDetails() {

		/* we are going to update the details when the user gave the particular id to update
		 * Inititally we gave a count value as -1 so that when it enters into the enhanced forloop it will make the count as count+1.
		 * Now the count value have been changed and we get the neccessary input from the user to update
		 * Then finally we use set method to set the updated details in the list using set method by passing the (index,value)
		 * Atlast we have used if condition to check whether the user have given the correct id
		 */

		System.out.println("TO UPDATE THE AIRLINE DETAILS FILL THE BELOW DETAILS..\n");

		boolean update_condition = false;

		System.out.print("ENTER THE AIRLINE_ID TO UPDATE : ");
		String unique_id = constant.next();

		System.out.print("ENTER THE AIRLINE NAME TO UPDATE: ");
		String newairline_name = constant.next();

		int count=-1;
		for(Airline details:newairlinelist)
		{
			count++;    
			if(details.getairline_id().equals(unique_id))
			{
				update_condition = true;

				System.out.print("ENTER THE AIRLINE_SEATING_CAPACITY: ");
				int update_seatingAvailability = constant.nextInt();

				System.out.print("ENTER THE AIRLINE_ORIGIN: ");
				String update_origin = constant.next();

				System.out.print("ENTER THE AIRLINE_DESTINATION: ");
				String update_destination = constant.next();

				System.out.print("ENTER THE AIRLINE_FARE: ");
				int update_fare = constant.nextInt();

				System.out.println("You Have Updated Successfully..");
				newairlinelist.set(count,new Airline(unique_id,newairline_name,update_origin,update_destination,update_seatingAvailability,update_fare));

				break;
			}
		}
		if(update_condition == false) {
			System.out.println("The Entered ID Doesn't Match With The Registered ID..");

		}
	}

	public void toLogOut() {

		// Here it simply logged out if we enter the matching value

		System.out.println("Logged out successfully!!");

	}



}
