
public class clientclass {

	public static void main(String[] args) {
		Student alex=new Student("CS",3.4,54,170.0,150.0,18);
		System.out.print(alex.Print());
		Doctor jack=new Doctor(179,173,40,4,"Dermatology");
		System.out.println("");
		System.out.println(jack.Print());
		//Mammal mam1=jack;
		//System.out.println(mam1.getSalary());
		//there is an error because mam1 is a Mammal and in Mammal 
		//object does not have Salary method. 
		
		Human hum1=alex;
		System.out.println(hum1.getHeight());
		
		Mammal mam1=jack;
		System.out.println(mam1.getWeight());
	}

}
