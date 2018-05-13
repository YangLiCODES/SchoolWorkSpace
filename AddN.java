
public class AddN {

	public static void main(String[] args) {

		
		System.out.println(addN(500));
		
	}
	
	public static int addN(int n){
		if (n==1) return 1;
		else return addN(n-1)+n;
	}

}
