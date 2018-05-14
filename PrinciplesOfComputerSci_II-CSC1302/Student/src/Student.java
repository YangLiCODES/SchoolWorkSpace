
public class Student extends Human{
	private int creditHours;
	private String major;
	private String  Year;
	
	public Student(String M,double gpa,int credit,double height,double weight, int age ){
		super(weight,age,height);
		
		this.major = M;
		this.gpa=gpa;
		this.creditHours=credit;
			
		
	}
	public String getYear() {
		int x=this.creditHours;
		if(x<32){
			return "freshman";
		}
		else if((x>=32)&&(x<64)){
			return "sophomore";
		}
		else if((x>=64)&&(x<96)){
			return "jounior";
		}
		else if(x>96){
			return "senior";
			}
		else{
			return "error";
		}
	}






	public void setYear(String year) {
		Year = year;
	}






	public String getMajor() {
		return major;
	}






	public void setMajor(String major) {
		this.major = major;
	}






	private double gpa;






	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	
    public String Print(){
    	String s=this.getMajor()+" "+this.getGpa()+" "+this.getYear()+" "+this.getAge();
    	return s;
    	
    }
}
