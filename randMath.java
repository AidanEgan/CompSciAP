import java.util.*;
public class randMath {

	public static void main(String[] args) {
		int[] myList = new int[20];
		int[] myGroup = new int[20];
		String diviNums = new String();
		int odds = 0;
		int temp;
		for(int i = 0; i<20;i++) {
			int x = (int) (Math.random()*100);
			int y = (int) (Math.random()*100);
			myList[i] = x;
			myGroup[i] = y;
			if (x%2 != 0) {
				odds++;
			}
		}
		System.out.println("myList has " + odds + " odds in the set");
		Scanner in = new Scanner(System.in);
		System.out.println("Find all numbers divisible by: ");
		int target = in.nextInt();
		in.close();
		for(int i =0; i<myList.length; i++){
			if(myList[i]%target == 0){
				diviNums = diviNums + myList[i] + " ";
			}
		}
		System.out.println("They are: " + diviNums + "\n");
		System.out.println("Here is the full array MyList and it reversed: ");
		for (int x = 0; x < myList.length; x++){
			System.out.print(myList[x] + " ");
		}
		System.out.println("\nReversed: ");
		for (int x = 0; x < (myList.length/2)-1; x++){
			temp = myList[x];
			myList[x] = myList[19-x];
			myList[19-x] = temp;
			
		}
		for (int x = 0; x < myList.length; x++){
			System.out.print(myList[x] + " ");
		}
		System.out.println("\n\nFinally here's myGroup once its been replaced with myList:");
		//Swaps myList and myGroup 
		for(int z = 0; z < myList.length; z++){
			temp = myList[z];
			myList[z] = myGroup[z];
			myGroup[z] = temp;
			System.out.print(myGroup[z] + " ");
		}
	}
	
}
