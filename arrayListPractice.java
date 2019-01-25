import java.util.*;
public class arrayListPractice {

	public static void main(String[] args) {
		//Declare and instantiate an arraylist of strings
		ArrayList<String> arlistr = new ArrayList<String>();
		//Copy and paste some code
		System.out.print("Enter numbers and when done enter end:\n");
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		while(!in.equals("end")) {
			arlistr.add(in);
			in = s.nextLine();
		}
		s.close();
		//End 
		for(String str : arlistr) {
			System.out.println(str);
		}
		
		//Declare and instantiate an arraylist of random Integers from the user. Remove all negatives from the list
		
		ArrayList<Integer> arlistint = new ArrayList<Integer>();
		for(int i = 0; i<100; i++) {
			arlistint.add(i,(int)((Math.random()-0.5)*100));
		}
		for(int x = arlistint.size()-1; x>=0;x--) {
			if(arlistint.get(x) < 0) {
				arlistint.remove(x);
			}
		}
	
		//Declare an iterator over the list. You may use one of your existing lists. Print all members of the list.
		Iterator<Integer> listIterator = arlistint.iterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
	}
	
}
