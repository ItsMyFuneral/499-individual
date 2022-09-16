package collatz;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the Collatz Conjecture (or 3n+1 Problem) simulator!");
		System.out.println("Would you like to simulate a single number, or find the longest sequence up to a particular number?");
		System.out.println("Type 'a' to simulate one number, or 'b' to find the longest.");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		while(!s.equals("a") && !s.equals("b")) {
			System.out.println("Invalid input. Try again.");
			System.out.println("Type 'a' to simulate one number, or 'b' to find the longest.");
			s = sc.nextLine();
		}
		
		System.out.println("Input a positive integer. (1 or greater)");
		int n = sc.nextInt();
		while(n < 1) {
			System.out.println("That number is not positive. Try again.");
			System.out.println("Input a positive integer. (1 or greater)");
			n = sc.nextInt();
		}
		sc.close();
		
		if(s.equals("a")) {
			Simulator sim = new Simulator(n);
			String series = sim.series();
			System.out.println(series);
		}
		else //s is "b"
		{
			int num = 1;
			int len = 0;
			Simulator sim;
			for(int i = 2; i <= n; i++)
			{
				sim = new Simulator(i);
				int t = sim.simulate();
				if(t > len)
				{
					num = i;
					len = t;
				}
			}
			System.out.println("The number less than " + n + " with the longest series is " + num + ", with length " + len + ".");
		}
	}
}
