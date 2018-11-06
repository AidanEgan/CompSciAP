import java.util.Scanner;
public class CharacterLinkedList {
	
	public static LinkedList<Character> addLinkedList(char[] c, int first, int last){
		LinkedList<Character> List = new LinkedList<Character>(new Node<Character>(c[first]));
		for(int i = first+1; i < last; i++){
			List.insertAtEnd(new Node<Character>(c[i]));
		}
		return List;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char[] input = s.nextLine().toCharArray();
		s.close();
		int last = 0;
		while(input[last] != ' '){
			System.out.print(input[last] + " ");
			last++;
		}
		Node<LinkedList<Character>> one = new Node<LinkedList<Character>>(addLinkedList(input, 0,last-1));
		LinkedList<LinkedList<Character>> MasterLinkedList = new LinkedList<LinkedList<Character>>(one);
		System.out.println("\n" + MasterLinkedList.getNode(0));
		for(int i = last; i<input.length; i++){
			System.out.print(input[i] + " ");
			if(input[i] == ' ' || i == input.length-1){
				//System.out.print(" huh ");
				MasterLinkedList.insertAtEnd(new Node<LinkedList<Character>>(addLinkedList(input, last, i+1)));
				last = i+1;
			}
		}
		MasterLinkedList.print();
		System.out.println();
		//System.out.println(MasterLinkedList.getNode(1));
		//System.out.println(MasterLinkedList.getNode(2));
		//System.out.println(MasterLinkedList.getNode(3));
		MasterLinkedList.getNode(1).getData().print();
		System.out.println("Hwer");
		MasterLinkedList.getNode(2).getData().print();
		System.out.println("Hwer");
		MasterLinkedList.getNode(3).getData().print();
	}
	
}
