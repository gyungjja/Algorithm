
public class BSTNode {
	private BSTNode left;	//노드의 왼쪽
	private int key;	//키값
	private BSTNode right;	//노드의 오른쪽
	
	public BSTNode() {	//생성자 초기값
		this.left = null;
		this.key = 0;
		this.right = null;
	}
	
	public BSTNode(int key)	//생성자
	{
		this.left = null;
		this.key = key;
		this.right = null;
	}
	
	public BSTNode getLeft(){	//getter
		return left;
	}
	public void setLeft(BSTNode left){	//setter
		this.left = left;
	}
	public int getKey(){	//getter
		return key;
	}
	public void setKey(int key){	//setter
		this.key = key;
	}
	public BSTNode getRight(){	//getter
		return right;
	}
	public void setRight(BSTNode right) {	//setter
		this.right = right;
	}

}