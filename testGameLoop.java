package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testGameLoop {
	private GameLoop game;
	@Before 
	public void setUp() {
		game = new GameLoop();
	}

	@Test
	public void testplayAgain() {
		assertFalse(game.playAgain(1));
		assertTrue(game.playAgain(2));
	}
	@Test (expected = IllegalArgumentException.class)
	public void testEmpty() {
		game.playAgain(7);
		game.playAgain( 10);
		game.playAgain(0);
	}

}
