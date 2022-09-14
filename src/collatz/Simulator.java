package collatz;

public class Simulator {
	int n;
	
	public Simulator(int n) {
		this.n = n;
	}
	
	// print out the fully-simulated series for a given number
	public String series(int n) {
		if(n < 1) return "Invalid number.";
		String s = "" + n;
		int length = 0;
		
		int t = n;
		
		while(t != 1)
		{
			t = calculate(t);
			s = s + " - " + t;
			length++;
		}
		s = s + "\nFinished in " + length + " steps.";
		return s;
	}
	
	// print out the series for this simulator's specific number
	public String series() {
		return series(n);
	}
	
	// calculate and return the next Collatz number
	// if n is even, return n/2
	// else, return 3n*1, which is always even
	public int calculate(int n) {
		return (n % 2 == 0) ? n / 2 : 3 * n + 1;
	}
	
	// simulate the length of n's series without printing out full series
	public int simulate(int n) {
		if(n < 1) return -1;
		int length = 0;
		int t = n;
		while(t != 1)
		{
			t = calculate(t);
			length++;
		}
		return length;
	}
	
	// simulate with this simulator's specific number
	public int simulate() {
		return simulate(n);
	}
}
