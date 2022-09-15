package collatz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindHighestTest {

	@Test
	void findhighBaseCase() {
		int num = 1;
		int len = 0;
		for(int i = 2; i < 1; i++) {
			// 1 as upper bound
			Simulator sim = new Simulator(i);
			int t = sim.simulate();
			if(t > len) {
				num = i;
				len = t;
			}
		}
		assertEquals(num, 1);
	}
	
	@Test
	void findhighGEQ() {
		int num1 = 13;
		int num2 = 25; //>= num1
		
		int[] num = {1,1};
		int[] len = {0,0};
		
		for(int i = 2; i < num2; i++){
			Simulator sim = new Simulator(i);
			int t = sim.simulate();
			if(t > len[1]) {
				len[1] = t;
				num[1] = i;
				if(i <= num1) {
					len[0] = t;
					num[0] = i;
				}
			}
		}
		assertTrue(num[1] >= num[0]);
		assertTrue(len[1] >= len[0]);
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
