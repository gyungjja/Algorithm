package Week_3;

public class Week3 {
	public static void main(String[] args) {
		BTree root,leftTree,rightTree,equal_test;
		
		leftTree = new BTree(new BTree(), 'A', new BTree());
		rightTree = new BTree(new BTree(), 'B', new BTree());
		root = new BTree(leftTree, '+', rightTree);
		
		leftTree = root;
		rightTree = new BTree(new BTree(),'C',new BTree());
		root = new BTree(leftTree,'*',rightTree);
		
		leftTree = root;
		rightTree = new BTree(new BTree(), 'D', new BTree());
		root = new BTree(leftTree,'/',rightTree);
		equal_test = new BTree(rightTree,'A',leftTree);
		
		System.out.println("===Inorder Traversal===");
		root.inorder();
		
		System.out.println("\n\n===Level Order Traversal===");
		root.levelOrder();
		
		System.out.println("\n\n===Tree Copy===");
		BTree copy_tree = root.copy();
		System.out.println("Inorder Traversal of basic Tree");
		root.inorder();
		System.out.println("\nInorder Traversal of copy Tree");
		copy_tree.inorder();
		
		System.out.println("\n\nanswer : " + root.Equal(copy_tree));
		System.out.println("answer : " + root.Equal(equal_test));
		
	}
		
}
