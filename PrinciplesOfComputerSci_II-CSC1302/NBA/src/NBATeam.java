import java.util.Arrays;

/*Student Name:Yang Li		Date:07/10/2017		Program Name: NBA
 * Description:
 * Following is a part of the source codes for NBATeam and NBA classes. 
 * Finish the programs for both classes to produce an output screen similar 
 * to the HW #4's figure.*/


public class NBATeam {

	private String sTeamName;
	private int nWin;
	private int nLoss;	
	
	private int count;

	NBATeam(String n, int w, int l){
		sTeamName=n;
		nWin=w;
		nLoss=l;
	}
	
	public void lossAgame(){
		nLoss++;
	}
	public void winAgame(){
		nWin++;
	}


	// construction
	public NBATeam(String teamName) {
		this.sTeamName=teamName;
	}

	//player array
	
	private String[] playerArray = new String[count];//array length
	

	public String[] getPlayerArry() {
		return playerArray;
	}


	public void addAPlayer(String playerName) {
		String temp[]=playerArray;
		playerArray=Arrays.copyOf(temp, temp.length+1);
		playerArray[count]=playerName;
		count++;
	}

	public String toString(){
		
		return sTeamName+Arrays.toString(playerArray)+" Wins#: "+nWin+" Losses#: "+nLoss;
	
	}
}