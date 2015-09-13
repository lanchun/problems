package problems;

public class Hannotower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void hanno(int n, int from, int to, int by) {
		if (n <= 0)
			return;
		hanno(n - 1, from, by, to);
		move(from, to);
		hanno(n - 1, by, to, from);
	}

	private static void move(int from, int to) {
		System.out.printf("move disk from %d to %d\n", from, to);
	}
}
