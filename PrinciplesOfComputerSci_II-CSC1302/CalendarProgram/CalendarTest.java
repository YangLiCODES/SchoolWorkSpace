/*Student Name: Yang Li		Date:07/25		Program:HomeWork 6 Calendar program
 * 
 */
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		
		Date display = new Date(1989,12,28);
		
	
		// display current date
		System.out.println(display);
		
		// add 2 days to the current date
		display.addDays(2);
		System.out.println(display);
		
		//add 7 days and pass to next year
		display.addWeeks(1);
		
		System.out.println(display);
		
		//set date back to the Today's date
		display.daysTo(2017,7,26);
		System.out.println(display);
		
	}

}
