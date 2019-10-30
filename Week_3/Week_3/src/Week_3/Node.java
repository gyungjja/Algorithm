package Week_3;

public class Node {
	private TreeNode node;	//���
	private Node link;		//��ũ
	
	public Node(TreeNode node){	//��� ������
		this.node = node;
		this.link = null;
	}
	public Node(TreeNode node, Node top){	//���,��ũ ������
		this.node = node;
		this.link = top;
	}
	public TreeNode getNode(){	//getter
		return this.node;
	}
	public Node getLink(){	//getter
		return this.link;
	}
	public void setNode(TreeNode node){	//setter
		this.node = node;
	}
	public void setLink(Node link){	//setter
		this.link = link;
	}
}