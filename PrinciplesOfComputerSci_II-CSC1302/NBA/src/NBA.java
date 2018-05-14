import java.util.Random;
import java.util.Scanner;

/*Student Name:Yang Li		Date:07/10/2017		Program Name: NBA
 * Description:
 * Following is a part of the source codes for NBATeam and NBA classes. 
 * Finish the programs for both classes to produce an output screen similar 
 * to the HW #4's figure.*/

public class NBA {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String ifAddPlayer;
		String playerName;
		
		//construct Team Heat
		System.out.println("Creat the NBA team of Heats ...... ");
		NBATeam heat= new NBATeam("Heats");
		
		System.out.print("Add a play to Heats? (yes/no): ");
		ifAddPlayer= input.next();
		
		while (ifAddPlayer.equalsIgnoreCase("yes")){
	    		System.out.print("What is the name to be added? ");
		    	playerName=input.next();
		    	
		    	heat.addAPlayer(playerName);
		    	
			
	    		System.out.print("Add one more play to Heats? (yes/no): ");
			ifAddPlayer= input.next();
		 }
		
		//construct Team spurs
		System.out.println("Creat the NBA team of Spurs ...... ");
		NBATeam spurs= new NBATeam("Spurs");
		
		System.out.print("Add a play to Spurs? (yes/no): ");
		ifAddPlayer= input.next();
		
		while (ifAddPlayer.equalsIgnoreCase("yes")){
	    		System.out.print("What is the name to be added? ");
		    	playerName=input.next();
		    	spurs.addAPlayer(playerName);
		    	
			
	    		System.out.print("Add one more play to Spurs? (yes/no): ");
	    		ifAddPlayer= input.next();
		 }
		
		System.out.println("\nGame on Now.....\n");
		
		
		//simulate a series of 7 games
		
		Random rand=new Random();
		int HnWins=0;
		int SnWins=0;
		
		
		for(int i =0; i<7;i++){
		Double num=rand.nextDouble();

			if(num>0.5){
			heat.winAgame();
			HnWins++;
			spurs.lossAgame();
			//if Heats wins 4 system stop
			if(HnWins==4){
				break;
			}
			}
			
			else{
			heat.lossAgame();
			spurs.winAgame();
			SnWins++;
			//if Spurs wins 4 system stop
			if(SnWins==4){
				break;
			}
			}

			
		}	
		if(HnWins>SnWins){
			System.out.print("HEATS ***WIN THIS SERIES***\n");
		}
		else{
			System.out.print("SPURS ***WIN THIS SERIES***\n");
		}
		//print out results
		System.out.println(heat);
		System.out.println(spurs);
		input.close();
		}
}