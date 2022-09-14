package collatz;

public class Simulator {
	int n;
	
	public Simulator(int n) {
		this.n = n;
	}
	
	public String series(int n) {
		String s = "" + n;
		int length = 0;
		
		int t = n;
		
		while(t != 1)
		{
			t = calculate(t);
			s = s + " - " + t;
			length++;
		}
		s = s + " - 1\nFinished in " + length + " steps.";
		return s;
	}
	
	public String series() {
		return series(n);
	}
	
	public int calculate(int n) {
		return (n % 2 == 0) ? n / 2 : 3 * n + 1;
	}
	
	public int simulate(int n) {
		int length = 0;
		int t = n;
		while(t != 1)
		{
			t = calculate(t);
			length++;
		}
		return length;
	}
	
	public int simulate() {
		return simulate(n);
	}
}
