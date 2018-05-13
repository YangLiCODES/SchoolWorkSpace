//Student Name: Yang Li
//Quiz#3

public class Mother {

	
	 int ValueA;
	 int ValueB;
	 int result=0;


	public Mother(){
		//ValueA=0;
		//ValueB=0;
	}
	public Mother(int ValueA, int ValueB){
		this.ValueA=ValueA;
		this.ValueB=ValueB;
	}
	
	public int Add(int x, int y, int z){
		
		result=x*y;
		result=result+z;
		return result;
	}
	
	
	//getter and setters
	public int getValueA() {
		return ValueA;
	}
	public void setValueA(int valueA) {
		this.ValueA = valueA;
	}
	public int getValueB() {
		return ValueB;
	}
	public void setValueB(int valueB) {
		this.ValueB = valueB;
	}
	
	public String toString(){
		return "The result is "+result;
	}
	
}
