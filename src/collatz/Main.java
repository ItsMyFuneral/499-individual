package collatz;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the Collatz Conjecture simulator!");
		System.out.println("Would you like to simulate a single number, or find the longest number up to a particular number?");
		System.out.println("Type 'a' to simulate one number, or 'b' to find the longest.");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		while(!s.equals("a") && !s.equals("b")) {
			System.out.println("Invalid input. Try again.");
			System.out.println("Type 'a' to simulate one number, or 'b' to find the longest.");
		}
	}
}
