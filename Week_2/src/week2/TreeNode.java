package week2;

public class TreeNode {
	private Object data;	//��ü ������
	private TreeNode left;	//���� ���
	private TreeNode right;	//������ ���
	
	public TreeNode(Object data){	//data ������
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
