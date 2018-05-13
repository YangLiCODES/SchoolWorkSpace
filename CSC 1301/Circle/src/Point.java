/*Yang Li		Date 06/29		Program Name: Circle*/
public class Point {
	private int x,y;
	
	Point(int xp, int yp){
		x=xp;
		y=yp;
	}
	public int getxp(){
		return x;
	}
	public int getyp(){
		return y;
	}
	
	public double distance(Point other) {
	    int dx = x - other.x;
	    int dy = y - other.y;
	    return Math.sqrt(dx * dx + dy * dy);
	}

	public String toString(){
		
		return "("+x+","+y+")";
	}
}
