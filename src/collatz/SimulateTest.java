package collatz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimulateTest {

	@Test
	void simulateBaseCase() {
		Simulator sim = new Simulator(1);
		int n = sim.simulate();
		assertEquals(n, 0);
		String s = sim.series();
		
	}
	
	@Test
	void simulate7() {
		// series is 16 steps long: (7)-22-11-34-17-52-26-13-40-20-10-5-16-8-4-2-1
		Simulator sim = new Simulator(7);
		int n = sim.simulate();
		assertEquals(n, 16);
	}
	
	@Test
	void series13() {
		Simulator sim = new Simulator(13);
		int n = sim.simulate();
		String s = sim.series();
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '-')
				n--;
		}
		assertEquals(n, 0);
	}
	
	@Test
	void negative() {
		Simulator sim = new Simulator(-2);
		int n = sim.simulate();
		String s = sim.series();
		assertEquals(n, -1);
		assertEquals(s, "Invalid number.");
	}

}
