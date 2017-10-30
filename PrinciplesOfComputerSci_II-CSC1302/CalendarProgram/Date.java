/*Student Name: Yang Li		Date:07/25		Program:HomeWork 6 Calendar program
 * 
 * 
 */
public class Date {

	private static final int January =01;
	private static final int February =2;

	private static final int December =12;
 
	private int year;
	private int month;
	private int day;
	
	private static final int[] DAYS_PER_MONTH=
//				  1    2   3   4   5   6   7   8   9   10  11   12        month
//array index	0    1   2   3   4   5   6   7   8   9   10   11
			   {31, 28,  31,30, 31, 30, 31, 31, 30, 31,  30,  31};

	public Date(int year, int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
		
		if(day<1 || month<1|| month>12){
			System.out.println("day or month is invalid"+toString());
		}
	}
	// moves this date object forward 
	public void addDays(int days){
		while (days > getDaysInYear()){
			days-=getDaysInYear();
			year++;
		}
		for (int i=1;i<=days;i++){
			nextDay();
		}
	}
	public void nextDay(){
		day++;
		if(day > getDaysInMonth()){
			month++;
			day=1;
			if(month>December){
				year++;
				month =January;
			}
		}
	}
	//move this date object forwards by 7 days
	public void addWeeks(int weeks){
			
		while (day > getDaysInYear()){
			day-=getDaysInYear();
			year++;
		}
		for (int i=1;i<=1;i++){
			nextWeeks();
		}
	}
	public void nextWeeks(){
		day+=7;
		if(day > getDaysInMonth()){
			month++;
			day=1;
			if(month>December){
				year++;
				month =January;
			}
		}
	}

	 public Date daysTo(int x,int y,int z){
		day=z;
		month=y;
		year=x;
		return new Date(x,y,z);

	}
	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}



	// days in each month
	public int getDaysInMonth(){
		int MONTHDAY=DAYS_PER_MONTH[month-1];
		if(month==February && Leapyear()){
			MONTHDAY++;
		}
		return MONTHDAY;
	}
	
	// days in year
	public int getDaysInYear(){
		if(Leapyear()){
			return 366;
		}
		else{
			return 365;
		}
	}
	//determine leap year 
	public boolean Leapyear(){
		return(year%400==0)||(year%4==0 && year % 100!=0);
	}
	
	public String toString(){
		return year+"/"+format(month)+"/"+format(day);
	}
	//clean format
	public String format(int n){
		if(n<10){
			return "0"+n;
		}
		else{
			return ""+n;
		}
	}

}
