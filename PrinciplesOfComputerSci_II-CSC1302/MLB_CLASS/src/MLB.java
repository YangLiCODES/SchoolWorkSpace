
public class MLB {

	private int nwin;
	private int nloss;
	private String name;
	
	public MLB(String name){
		this.name=name;
	}
	
	public void winAgame(){
		nwin++;
	}
	
	public void lossAgame(){
		nloss++;
	}
	public void winAgame(MLB teamB){
		this.nwin++;
		teamB.lossAgame();
	}
	public void lossAgame(MLB teamB){
		this.nloss++;
		teamB.winAgame();;
	}
	
	public String toString(){
		return "Team "+ name+ " win "+nwin+" loss "+nloss;
	}
	
}
