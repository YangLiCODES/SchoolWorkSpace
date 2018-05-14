import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
/*Student Name: Yang Li
 * Quiz #1
 * Program Purpose:
 * Declare an ArrayList to hold 15 random integers ranging from 1-50, and then sort the contents of arraylist.
 * display both arraylist and sorted arraylist.
 */
public class Q1_YANG_LI {

	public static void main(String[] args) {
		//create an arraylist fill with random number range between 1-50.
		Random r= new Random();
		ArrayList <Integer> list= new ArrayList<Integer>(15);
		
		for(int i =0;i<15;i++){
			list.add(r.nextInt(50)+1);
		}
		System.out.println("ArrayList: ");
		for(int j=0;j<15;j++){
			System.out.print(" "+list.get(j));
		}
		storting(list);
	}
	// sort the arraylist.
	public static void storting(ArrayList<Integer>n){
		
	System.out.println("");
	System.out.println("Sorted ArrayList: ");
		
		for(int i=0;i<15;i++){
			for(int j=14;j>i;j--){
				if(n.get(i)>n.get(j)){
					int tmp=n.get(i);
					n.set(i,n.get(j));
                    n.set(j,tmp);
				}
			}
		}
		for(int i:n){
			System.out.print(" "+i);
		}
		
		
		
	}
}