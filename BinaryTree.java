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
}
