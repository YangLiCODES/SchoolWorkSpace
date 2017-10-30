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
public class Ticket {
	private int number;
	private double ticketPrice;
	
	
	public Ticket(int number){
		this.number=number;
		ticketPrice=50;
	}
	public int getNumber(){
		return number;
	}
	
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double d) {
		this.ticketPrice = d;
	}
	
	public String toString(){
		return "Ticket Number is: "+number+"  Ticket Price is: $"+ticketPrice;
	}
		
	
	
	
}
