
public class Scores {
	
	int amount = 0;
	int score = 0;
	
	double newScores[] = new double[100];
	
	public Scores(int amount, int score) {
		super();
		this.amount = amount;
		this.score = score;
	}
	
	public Scores(){
		this.amount = 0;
		this.score = 0;
	}
	
	

	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public double getAverageScores(){
		double average = 0;
		double total = 0;
		int count;
		
		for(count = 0; count < amount; count++){
			total = (total + newScores[count]);
			
		}
		average = total / count;
		return average;
	}
	
	public void setScores(double score, int count)
				
		      throws IllegalArgumentException {
		    if (score >= 0 && score <= 100){
		    	newScores[count] = score;
		    }
		    	else{
		      throw new IllegalArgumentException(
		        "Score cannot be above 100 or below 0");
		    }
		  }

	
	
	
	

}
