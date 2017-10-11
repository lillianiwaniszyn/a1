package Tests;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class testBattle {
	private Battle bat;
	private Random rand;
	@Before 
	public void setUp() {
		bat = new Battle();
		rand = new Random();
	}
	@Test
	public void testGetRandomWithExclusion() {
		assertNotEquals(2, bat.getRandomWithExclusion(1,5,2));
		assertNotEquals(1, bat.getRandomWithExclusion(1,5,1));
		assertNotEquals(5, bat.getRandomWithExclusion(1,5,5));
		assertTrue(bat.getRandomWithExclusion(1,5,5) >= 1);
		assertTrue(bat.getRandomWithExclusion(1,5,5) <= 5);
	}
	
	

}
