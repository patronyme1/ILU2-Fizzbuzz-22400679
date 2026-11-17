package fizzbuzz;

public class Game {
	
	private static int[] MAGIC_KEYS = { 3,5 };
	private static String[] MAGIC_VALUES = {"Fizz", "Buzz"};
	private int round = 1;
	
	public String next() {
		String answer = checkForMagic();
		if (answer.isEmpty()) {
			answer = String.format("%d", round);
		}

		round++;
		return answer;
	}
	
	private String checkForMagic() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < MAGIC_KEYS.length; i++) {
			if (round % MAGIC_KEYS[i] == 0) {
				sb.append(MAGIC_VALUES[i]);
			}
		}
		
		return sb.toString();
	}
	
}
