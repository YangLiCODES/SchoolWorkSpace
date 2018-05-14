import java.util.ArrayList;

import java.util.Collections;


public class NBATeam {
		String name;
		int age;
		//create two arraylist
		ArrayList<String> ArrayName = new ArrayList<>();
		ArrayList<Integer> ArrayAge = new ArrayList<>();

		 int Max;
		 int Min;
		 int Avg;
		private String NumOfPlayer;
		
	
		public NBATeam(String s) {
	}
		public void addAPlayer(String name, int age) {

		ArrayName.add(name);
		
		
		ArrayAge.add(age);
		
		

		Collections.sort(ArrayAge);
		Max=ArrayAge.get(ArrayAge.size()-1);
		Min=ArrayAge.get(0);
		Avg=(Max+Min)/2;
	
		NumOfPlayer = ArrayName.size()+"";

	
	}

		public String getName() {

		return name;

	}

		public void setName(String name) {

		this.name = name;

	}

		public int getAge() {

		return age;

	}


		public Integer getMaxAge() {

			return Max;

}

		public void setMaxAge(Integer maxAge) {
			this.Max = maxAge;
	}

		public int getMinAge() {
			return Min;
	}
		
		public void setMinAge(int minAge) {
			Min = minAge;
	}

		public int getAvgAge() {
			return Avg;
	}
		
		public void setAvgAge(int avgAge) {

				Avg = avgAge;

				}

		public String getNumOfPlayer() {
				return NumOfPlayer;
	}

		public void setNumOfPlayer(String numOfPlayer) {

			NumOfPlayer = numOfPlayer;

		}
}
