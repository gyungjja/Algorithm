package week2;

public class TreeNode {
	private Object data;	//자체 데이터
	private TreeNode left;	//왼쪽 노드
	private TreeNode right;	//오른쪽 노드
	
	public TreeNode(Object data){	//data 생성자
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public TreeNode getLeft(){	//getter
		return left;
	}
	public Object getData(){	//getter
		return this.data;
	}
	public TreeNode getRight(){	//getter
		return right;
	}
	public void setLeft(TreeNode left){	//setter
		this.left = left;
	}
	public void setData(Object data){	//setter
		this.data = data;
	}
	public void setRight(TreeNode right){	//setter
		this.right = right;
	}

}
