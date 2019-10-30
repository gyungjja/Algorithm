package Week_3;

public class Node {
	private TreeNode node;	//노드
	private Node link;		//링크
	
	public Node(TreeNode node){	//노드 생성자
		this.node = node;
		this.link = null;
	}
	public Node(TreeNode node, Node top){	//노드,링크 생성자
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