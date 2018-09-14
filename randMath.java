import java.util.*;
public class randMath {

	public static void main(String[] args) {
		int[] myList = new int[20];
		String[] names = new String[10];
		int[] myGroup = new int[20];
		int odds = 0;
		for(int i = 0; i<20;i++) {
			int x = (int) (Math.random()*100);
			myList[i] = x;
			if (x%2 != 0) {
				odds++;
			}
		}
		System.out.println("myList has " + odds + " odds in the set");
		Scanner in = new Scanner(System.in);
		System.out.println("Find all numbers divisible by: ");
		int divi = in.nextInt();
	}
	
}
