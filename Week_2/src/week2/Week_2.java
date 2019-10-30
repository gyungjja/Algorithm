package week2;

public class Week_2 {
	public static void main(String[] args) {
		BTree root, leftTree, rightTree;
		
		leftTree = new BTree(new BTree(), 'A', new BTree());
		rightTree = new BTree(new BTree(), 'B', new BTree());
		root = new BTree(leftTree,'+',rightTree);
		
		leftTree = root;
		rightTree = new BTree(new BTree(), 'C', new BTree());
		root = new BTree(leftTree,'*',rightTree);
		
		leftTree = root;
		rightTree = new BTree(new BTree(), 'D', new BTree());
		root = new BTree(leftTree,'/',rightTree);
		
		System.out.println("===Preorder Traversal===");
		root.preorder();
		
		System.out.println("\n\n===Inorder Traversal===");
		root.inorder();
		
		System.out.println("\n\n===Postorder Traversal===");
		root.postorder();
		
		System.out.println("\n\n===iterative Preorder Traversal===");
		root.iterPreorder();
		
		System.out.println("\n\n===iterative Inorder Traversal===");
		root.iterInorder();
	}
}