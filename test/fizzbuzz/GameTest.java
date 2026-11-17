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
	
	@Test
	void someValues() {
		tour(6);
		assertEquals("7", game.next());
		assertEquals("8", game.next());
		tour(2);
		assertEquals("11", game.next());
	}
	
	@Test
	void someFizz() {
		tour(5);
		assertEquals("Fizz", game.next());
		tour(5);
		assertEquals("Fizz", game.next());
		// tour 15 retiré pour laisser fizzbuzz
	}
	
	@Test
	void someBuzz() {
		tour(9);
		assertEquals("Buzz", game.next());
		tour(9);
		assertEquals("Buzz", game.next());
		tour(29);
		assertEquals("Buzz", game.next());
	}
	
	@Test
	void fizzbuzzTest() {
		tour(14);
		assertEquals("FizzBuzz", game.next());
	}
	
	@Test
	void fullGameTest() {
		String game = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz,";
		assertEquals(game, tour(30));
	}
	
	private String tour(int round) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < round ; i++) {
			sb.append(game.next());
			sb.append(", ");
		}
		return sb.toString().trim();
	}

}