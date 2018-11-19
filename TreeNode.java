
public class TreeNode {
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode() {
		data = 0;
		left = null;
		right = null;
	}
	public TreeNode(int i, TreeNode l, TreeNode r) {
		data = i;
		left = l;
		right = r;
	}
	
	public int getData() {
		return data;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public void setData(int i) {
		data = i;
	}
	
	public void setLeft(TreeNode l) {
		left = l;
	}
	public void setRight(TreeNode r) {
		right = r;
	}
	
}
