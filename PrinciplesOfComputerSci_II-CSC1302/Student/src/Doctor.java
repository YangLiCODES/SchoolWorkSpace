
public class Doctor extends Human{
	private int year;
	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	private String Speciality;


	
	public String getSpeciality() {
		return Speciality;
	}



	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}



	Doctor(double weight, double height, int age,int year,String speciality) {
		super(weight, age,height);
		
		this.Speciality=speciality;
		this.year=year;
	}
	
	
	public int getSalary(){
		return 40000+5000*(this.year-1);
	}
	public String Print(){
    	String s=this.getSpeciality()+" "+this.getHeight()+" "+this.getSalary();
    	
    	return s;
	
	
	}
}
