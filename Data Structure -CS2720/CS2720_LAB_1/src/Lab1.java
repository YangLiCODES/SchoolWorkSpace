
public class Lab1 {

	
		private int hour;
		private int minute;
		private int second;
		
		
		
		public Lab1(){
			hour =1 ;
			minute =30;
			second =54;
		}
		
		
		public Lab1(int h, int m, int s){
			// you have to make sure hour is less than 25 , otherwise hour equals to 0
			hour=(h<24) ? h:0;
			//you have to make sure minute is less than 60, otherwise hour equals to 0
			minute=(m<60) ? m:0; 
			//you have to make sure minute is less than 60, otherwise hour equals to 0
			second=(s<60) ? s:0;
			
			
		}
		
		
		
		public String Lab1(){
			return String.format("%02d:%02d:%02d %s",hour,minute,second,(hour>=12)? "PM":"AM");
		}
		
		
		public static void main(String [] args){
			Lab1 obj=new Lab1(16,45,60);
			System.out.println(obj.Lab1());
		}

}
