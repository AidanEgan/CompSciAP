import java.util.*;

public class quadraticFormula {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the 'a' value?");
		double a = in.nextDouble();
		System.out.println("What is the 'b' value?");
		double b = in.nextDouble();
		System.out.println("What is the 'c' value?");
		double c = in.nextDouble();
		in.close();
		if ((b*b -4*a*c) > 0) {
			double posQuad = ((-1*b + Math.sqrt(b*b - 4 *a*c))/(2*a)); 
			double negQuad = ((-1*b - Math.sqrt(b*b - 4 *a*c))/(2*a)); 
			System.out.println("Your answer is either " + posQuad + " or " + negQuad);
		} else {
			System.out.println("Your discriminate is negative, therefore there are no real solutions.");
		}
	}
}
