
public class MLBP {

	public static void main(String[] args) {
		MLB braves=new MLB("braves");
		MLB yankees=new MLB("yankees");
		braves.winAgame(yankees);
		//braves.winAgame(yankees);
		yankees.lossAgame(braves);
		
		System.out.println(braves);
		System.out.println(yankees);
	}

}
