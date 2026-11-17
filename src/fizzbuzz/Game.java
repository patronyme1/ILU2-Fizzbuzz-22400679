package fizzbuzz;

public class Game {
	
	private static int MAGIC_KEY = 3;
	private static String MAGIC_VALUE = "Fizz";
	private int round = 1;
	
	public String next() {
		String answer = "";
		if (round == MAGIC_KEY) {
			answer = MAGIC_VALUE;
		}else {
			answer = String.format("%d", round);
		}
		
		round++;
		return answer;
	}
	
}
