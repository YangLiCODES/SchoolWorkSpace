/* Student Name: Yang Li				Date:07/16				Program Name: Tickets
 * Purpose:
 * 
 * The task of representing types of tickets to campus events.
 * Each ticket has unique number and a price. There are three types of tickets:
 * Walk-up tickets, advance tickets, and student advance tickets.
 * 
 * Walk-up tickets are purchased the day of event and cost $50.
 * Advance tickets purchased 10 more more days before the event cost $30, and
 * advance tickets purchased fewer than 10 days before the event cost $40.
 * 
 * Student advance tickets are sold at half the price of normal advance tickets:
 * When they are purchased 10 or more days early they cost $15, and when they are 
 * purchased fewer than 10 days early they cost $20.
 * 
 * Each actual ticket will be an object of a subclass type.
 * 
 * The ability to construct a ticket by number.
 * The ability to ask for a ticket's price.
 * The ability to print out a ticket object as a String. 
*/
import java.util.Scanner;
public class TicketMain {

	public static void main(String[] args) {
		
		//walkup ticket test
		System.out.println("Walkup Ticket Info:\n");
		WalkupTicket t1= new WalkupTicket(1);
		System.out.println(t1);;
		
		Scanner console = new Scanner(System.in);
		
		
		// advance ticket test: user input an int for advance ticket's price
		
		
		System.out.println("\nFor Advance Tickets: \nif you purchase the ticket more than 10 days in advance, the ticket price is $30.0.");
		System.out.println("If you purchase the ticket less than 10 days in advance, the ticket price is $40.0.");
		System.out.println("\nFor Advance Tickets: Please Enter How Many Days in Advance?");
		int advanceDays=console.nextInt();
		AdvanceTicket at1= new AdvanceTicket(2, advanceDays);
		System.out.println(at1);
		
		//advance student ticket test
		System.out.println("\nAdvance Tickets rules also apply to Student Tickets");
		System.out.println("Additional discount will be applied.");
		System.out.println("\nPlease Enter How many Days in Advance is this student ticket been purchased?");
		advanceDays=console.nextInt();
		StudentAdvanceTicket sat1= new StudentAdvanceTicket(3, advanceDays);
		System.out.println(sat1);
		
		
		console.close();
	}

}
