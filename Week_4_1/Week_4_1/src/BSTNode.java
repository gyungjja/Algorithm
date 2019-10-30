
public class BSTNode {
	
	private BSTNode left;
	private int key;
	private BSTNode right;
	
	public BSTNode() {	//持失切
		this.left = null;
		this.key = 0;
		this.right = null;
	}
	
	public BSTNode(int key)	//持失切
	{
		this.left = null;
		this.key = key;
		this.right = null;
	}
	
	public BSTNode getLeft() {	//getter
		return left;
	}
	
	public void setLeft(BSTNode left) {	//setter
		this.left = left;
	}
	
	public int getKey() {	//getter
		return key;
	}
	
	public void setKey(int key) {	//setter
		this.key = key;
	}
	
	public BSTNode getRight() {
		return right;
	}
	
	public void setRight(BSTNode right) {
		this.right = right;
	}

}
