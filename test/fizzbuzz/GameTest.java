package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;
	
	@BeforeEach
	void setUp() throws Exception {
		game = new Game();
	}

	@Test
	void firstRoundTest() {
		assertEquals("1", game.next());
	}
	
	@Test
	void firstSecoundRoundTest() {
		game.next();
		assertEquals("2", game.next());
	}
	
	@Test
	void firstFizzTest() {
		tour(2);
		assertEquals("Fizz", game.next());
	}
	
	@Test
	void firstFourthTest() {
		tour(3);
		assertEquals("4", game.next());
	}
	
	@Test
	void firstBuzz() {
		tour(4);
		assertEquals("Buzz", game.next());
	}
	
	private void tour(int round) {
		for (int i = 0; i < round ; i++) {
			game.next();
		}
	}

}