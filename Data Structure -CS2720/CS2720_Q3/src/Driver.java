//Student Name: Yang Li
//Quiz#3

public class Driver {

	public static void main(String [] args){
		
		Mother a = new Mother(2,5);
		
		
		
		//test for above 
		
		System.out.println("This is Mother class ValueA "+a.getValueA());
		System.out.println("This is Mother class ValueB "+a.getValueB());
		
		Child b= new Child(100, 2,1,1);
		
		//test for child class
		System.out.println("This is Child class ValueA "+b.getValueA());
		System.out.println("This is Child class ValueB "+b.getValueB());
		System.out.println("This is Child class ValueC "+b.getValueC());
		System.out.println("This is Child class ValueD "+b.getValueD());
		
	
		b.setValueA(11);
		
		System.out.println(b.getValueA());
		
		System.out.println(a.getValueA());
		
		
		
		System.out.println(a.Add(1, 2, 3));
		
		//System.out.println(a.toString());
		
		
		System.out.println(b.Add(1, 2, 3));
		
		
		
		
		a.Add(1, 2, 3);
		b.Add(100,2,1);
		System.out.println(b.toString());
		
		b.setValueA(2);
		b.setValueB(3);
		b.setValueC(4);
		b.setValueD(4);
		System.out.println(b.getValueA());
		System.out.println(b.getValueB());
		System.out.println(b.getValueC());
		System.out.println(b.getValueD());
		
		System.out.println(a.toString());
		
	}

}
