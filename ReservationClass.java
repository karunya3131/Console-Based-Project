package airlinereservationsystem;

import java.util.Scanner;
// Imported the [ java.util.* ] package instead of importing each classes separately.


// Here we created a class ReservationClass which contain a method called recheckingcredentials.
public class ReservationClass {

	private static final Scanner scan = new Scanner(System.in);

	/* This is the main method from where the program starts 
	 * Before this method gets called static block will be called.
	 * Then jvm automatically call this main method
	 * Made it as public so that we can access anywhere and the return type is void as it doesn't return anything
	 */
	public static void main(String[] args) {



		// Created an object for the airline class and we are going to call the method with the help of this.
		Airline userinput = new Airline();
		Airline.checkingcredentials();

		//In byte type we are getting the input from the user,here we just initialized and going to get the input inside the do while loop.
		byte adminChoice ;

		/* Here we used do while loop and inside the do loop we have the switch case
		 * By entering the choice it will go inside the switch case if the entered choice is within 6
		 */
		do 
		{
			adminChoice = scan.nextByte();

			switch(adminChoice) 
			{

			case 1:

				userinput.toAddTheDetails();
				break;

			case 2:

				userinput.toDisplayTheDetails();
				break;

			case 3:

				userinput.toSearchTheDetails();
				break;

			case 4:

				userinput.toDeleteTheDetails();
				break;

			case 5:

				userinput.toUpdateTheDetails();
				break;

			case 6:

				userinput.toLogOut();
				break;

			}

		}	

		while (adminChoice != 6) ;
		scan.close();
	}
}
