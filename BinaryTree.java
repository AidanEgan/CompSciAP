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
	//Tree Height
	public int height(TreeNode p){
		if (p == null){
			return 0;
		} else {
			int heightOne = height(p.getLeft());
			int heightTwo = height(p.getRight());
			if (heightOne > heightTwo){
				return heightOne+1;
			}else{return heightTwo+1;}
		}
	}
	
	//Part of Breadth-First Search
	public void printOneRow (TreeNode p ,int level){ 
		if(p != null){
	        if (level == 1) 
	            System.out.print(p.getData() + " "); 
	        else { 
	            printOneRow(p.getLeft(), level-1); 
	            printOneRow(p.getRight(), level-1); 
	        } 
		}
	} 
	
	//Breadth-First Search:
	public void printByRow(){
		int Height = this.height(root);
		for(int i = 1; i<=Height; i++){
			System.out.print(i + ": ");
			this.printOneRow(root,i);
			System.out.println();
		}
	}
	
	//Depth First Search Methods:
	
	//InOrder Traversal
	public void printInOrder(TreeNode p){
		if (p.getLeft() != null) {
			printInOrder(p.getLeft());
		}
		System.out.print(p.getData()+ " ");
		if(p.getRight() != null) {
			printInOrder(p.getRight());
		}
	}
	
	//PreOrder Traversal
	public void printPreOrder(TreeNode p) {
		System.out.print(p.getData() + " ");
		if (p.getLeft() != null) {
			printPreOrder(p.getLeft());
		}
		if(p.getRight() != null) {
			printPreOrder(p.getRight());
		}
	}
	
	//PostOrder Traversal
	public void printPostOrder(TreeNode p){
		if (p.getLeft() != null) {
			printPostOrder(p.getLeft());
		}
		if(p.getRight() != null) {
			printPostOrder(p.getRight());
		}
		System.out.print(p.getData()+ " ");
	}
	
	public boolean isEmpty() {
		return (root == null);
	}
	public static void main(String[] args) {
		//Example tree 15-2-7-9-20-25-30-1-31-13
		//New Tree 10,5,20,4,6,18,25,2,7,16,23,30,32
		//Tree Three 25,15,50,10,22,35,70,4,12,18,24,31,44,66,90
		int[] nodeData = {15,50,10,22,35,70,4,12,18,24,31,44,66,90};
		TreeNode t1 = new TreeNode(25);
		BinaryTree tre = new BinaryTree(t1);
		for (int i = 0; i<nodeData.length; i++) {
			tre.addNodeLeaf(new TreeNode(nodeData[i]));
		}
		System.out.println("PreOrder:");
		tre.printPreOrder(t1);
		System.out.println("InOrder:");
		tre.printInOrder(t1);
		System.out.println("PostOrder:");
		tre.printPostOrder(t1);
		System.out.println("\n");
		tre.printByRow();
	}
}
