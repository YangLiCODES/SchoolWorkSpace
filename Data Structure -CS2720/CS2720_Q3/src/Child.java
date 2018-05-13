//Student Name: Yang Li
//Quiz#3

public class Child extends Mother{
	int resultC=0;
	public int getValueC() {
		return ValueC;
	}
	public void setValueC(int valueC) {
		this.ValueC = valueC;
	}
	 int ValueC;
	 public int getValueD() {
		return ValueD;
	}
	public void setValueD(int valueD) {
		this.ValueD = valueD;
	}
	int ValueD;
	int result;
	public Child(int x, int y){

	}
	public Child(int a, int b, int c, int d){
		super(a,b);
		this.ValueC=c;
		this.ValueD=d;
		
	}
	
	public int Add(int a, int b, int c){
		
		resultC= a/b;
		resultC=resultC-c;
		return resultC;
	}
	
	public String toString(){
		return "The result is "+resultC;
	}
	
	
	
	
	
	
}
