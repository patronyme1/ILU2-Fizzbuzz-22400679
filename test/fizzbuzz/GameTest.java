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

}