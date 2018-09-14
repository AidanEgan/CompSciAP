import java.util.Scanner;
public class arrayPractice {
	public static void main(String[] args) {
		int[] myList = new int[20];
		String[] myNames = new String[10];
		for(int i = 0; i<20; i++) {
			myList[i] = 0;
		}
		for(int i = 0; i<10; i++) {
			myNames[i] = "your_name";
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Which user would you like to alter? ");
		int userNum = input.nextInt();
		
		System.out.println("What is their new name? ");
		input.nextLine();
		String newName = input.nextLine();
		input.close();
		myNames[userNum] = newName;
		System.out.println(userNum + "'s new name is " + myNames[userNum]);
		
	}
}
