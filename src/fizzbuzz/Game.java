package fizzbuzz;

public class Game {
	
	private int round = 1;
	
	public String next() {
		return String.format("%d", round++);
	}
	
}
