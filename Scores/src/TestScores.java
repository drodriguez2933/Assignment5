import java.util.*;

public class TestScores {
	
	public static void main(String Args[]){
		int counter;
		int amountScores;
		int score = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("How many scores will you be entering today?");
		amountScores = scan.nextInt();
		
		Scores average = new Scores(amountScores, score);
		
		
		for(counter = 0;counter < amountScores;counter++){
			System.out.println("Enter a score into the array: ");
			score = scan.nextInt();
			
			try{
				average.setScores(score,counter);
				}
				catch(IllegalArgumentException e){
					System.out.println("Can not enter a value over 100 for under 0.");
					counter--;
				}
			
		}
		
		
		
		
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("The average test score was: " + average.getAverageScores());
		System.out.println("-------------------------------------");
		
		scan.close();
	}

}
