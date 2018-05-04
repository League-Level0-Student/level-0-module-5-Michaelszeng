import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String num = JOptionPane.showInputDialog("what number would you like to prime check?");
	int num2 = Integer.parseInt(num);
	for (int i=2; i<num2; i++) {
		if (num2%(i)==0) {
			System.out.println("Your number is not prime!");
			System.exit(0);
		}
	}
		System.out.println("Your number is prime!");
	}
}

