
public class Human extends Mammal {
	private double height;
	
	Human(){
		
	}
	Human(double weight, int age, double height) {
		super(weight, age);
		this.height = height;
	}
	Human(double weight, int age) {
		super(weight, age);
	}
	
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	

	
	

}
