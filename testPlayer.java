package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testPlayer {
	private Player player;
	@Before 
	public void setUp() {
		player = new Player(1,1,1);
	}

	@Test
	public void testGetPlayer() {
		assertEquals("pikachu", player.getPlayer(1));
		assertEquals("celebi", player.getPlayer(2));
		assertEquals("snorlax", player.getPlayer(3));
		assertEquals("charizard", player.getPlayer(4));
		assertEquals("ditto", player.getPlayer(5));
		assertEquals("eevee", player.getPlayer(6));
	}
	@Test (expected = IllegalArgumentException.class)
	public void testEmpty() {
		player.getPlayer(7);
		player.getPlayer( 10);
		player.getPlayer(0);
	}
	
	
	
}
