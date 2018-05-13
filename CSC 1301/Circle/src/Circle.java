/*Yang Li		Date 06/29		Program Name: Circle*/
public class Circle {
	
	private Point center;
	private int radius;
	

	
	public Circle(Point c, int r){
		center =c;
		radius=r;
	}
	public Point getCenter(){
		return center;
	}
	public int getradius(){
		return radius;
	}
	public double getArea(){
		return Math.PI*(Math.sqrt(radius));
	}
	public double getCircumference(){
		return 2*Math.PI*radius;
	}
	public String toString(){
		return "Circle[center="+center+",radius="+radius+"]";
	}
	public boolean contains(Point p2){
		
		return center.distance(p2)<=radius;
	

	}
		
	
}
