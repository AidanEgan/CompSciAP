import java.util.ArrayList;

//Example tree 15-2-7-9-20-25-30-1-31-13
public class BinaryTree {
	private TreeNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	public BinaryTree(TreeNode r) {
		root = r;
	}
	
	public void addNodeLeaf(TreeNode p) {
		TreeNode backer = null;
		TreeNode snaker = root;
		while(snaker != null) {
			backer = snaker;
			if(snaker.getData() > p.getData()) {
				snaker = snaker.getLeft();
			}else {
				snaker = snaker.getRight();
			}
		}
		if(backer.getData() > p.getData()) {
			backer.setLeft(p);
		}else {
			backer.setRight(p);
		}
	}
	
	public void printVertically(TreeNode p) {
		//ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.print(p.getData() + " ");
		if (p.getLeft() != null) {
			printVertically(p.getLeft());
		}
		if(p.getRight() != null) {
			printVertically(p.getRight());
		}
	}
	
	public boolean isEmpty() {
		return (root == null);
	}
	public static void main(String[] args) {
		//Example tree 15-2-7-9-20-25-30-1-31-13
		//New Tree 5,20,4,6,22,25,2,7,21,23,30,32
		int[] nodeData = {5,20,4,6,22,25,2,7,21,23,30,32};
		TreeNode t1 = new TreeNode(10);
		BinaryTree tre = new BinaryTree(t1);
		for (int i = 0; i<nodeData.length; i++) {
			tre.addNodeLeaf(new TreeNode(nodeData[i]));
		}
		tre.printVertically(t1);
	}
}
