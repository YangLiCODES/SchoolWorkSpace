/*Yang Li		Date 06/29		Program Name: Circle
 *Description:
 *Define a call named circle. A circle object stores a radius
 **/
public class CircleClient {
	
	
	
	public static void main(String[] args){

		Point p= new Point(10,5);
		Point p2=new Point(5,7);
		int radius=7;
		Circle c= new Circle(p, radius);
		System.out.println(c);
		System.out.println("Circumference is: "+c.getCircumference()+"\nCircle Area is: "+c.getArea());
		
		if(c.contains(p2)){
			System.out.println("(5,7) lies within the ircle");
		}
		else{
			System.out.println("(5,7) does not lie within the circle");
		}
		
	}
	
}
