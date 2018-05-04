
public class Fibonacci {
public static void main(String[] args) {
	System.out.println(0);
	int prev = 0;
	int next = 1;
	int prev2=0;
	for (int i=0; i<12; i++) {
		System.out.println(next);
		prev2=prev;
		prev=next;
		next=next+prev2;
	}
}
}
