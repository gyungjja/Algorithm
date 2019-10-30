
public class Week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSTree bst = new BSTree();
		bst.insert(18); bst.insert(7); bst.insert(26);
		bst.insert(3); bst.insert(12); bst.insert(21);
		bst.insert(31); bst.insert(23); bst.insert(10);
		bst.print();
		
		bst.delete(10);
		bst.print();
		
		bst.delete(21);
		bst.print();
		
		bst.delete(26);
		bst.print();
		
		bst.delete(18);
		bst.print();
		
		bst.delete(23);
		bst.print();
		
		bst.delete(7);
		bst.print();
		
		BSTNode searchNode_1 = bst.search(31);
		if(searchNode_1 == null)
			System.out.println("search fail...");
		else
			System.out.println("search success : " + searchNode_1.getKey());
		
		BSTNode searchNode_2 = bst.search(40);
		if(searchNode_2 == null)
			System.out.println("search fail...");
		else
			System.out.println("search success : " + searchNode_2.getKey());
	}
}
