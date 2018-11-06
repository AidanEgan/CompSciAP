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
			last++;
		}
		Node<LinkedList<Character>> one = new Node<LinkedList<Character>>(addLinkedList(input, 0,last));
		LinkedList<LinkedList<Character>> MasterLinkedList = new LinkedList<LinkedList<Character>>(one);
		int i = last+1;
		while(i<input.length){
			if(input[i] == ' '){
				MasterLinkedList.insertAtEnd(new Node<LinkedList<Character>>(addLinkedList(input, last+1, i)));
				last = i;
				i = i+1;
			}
			if(i == input.length-1) {
				MasterLinkedList.insertAtEnd(new Node<LinkedList<Character>>(addLinkedList(input, last+1, i+1)));
			}
			i++;
		}
		MasterLinkedList.print();
		System.out.println();
		//System.out.println(MasterLinkedList.getNode(1));
		//System.out.println(MasterLinkedList.getNode(2));
		//System.out.println(MasterLinkedList.getNode(3));
		for(int x = 1; x<=MasterLinkedList.countNodes(); x++) {
			MasterLinkedList.getNode(x).getData().print();
			System.out.println();
		}
	}
	
}
