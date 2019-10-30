package week2;

public class Stack {
	private Node top;	//노드의 top
	public Stack(){	//생성자
		this.top = null;
	}
	public boolean isEmpty(){	//스택이 비어있는지 확인하는 메서드
		return top == null;		//null값 반환
		
	}
	public void push(TreeNode node){	//데이터를 넣어주는 메소드
		Node sn = new Node(node,top);
		top = sn;
	}
	public TreeNode pop(){	//데이터를 빼주는 메소드
		if(this.isEmpty())	//비어있으면
		{
			System.out.println("Stack is empty.");
			return null;	//종료
		}
		Node node = top;	
		top = node.getLink();
		return node.getNode();	//데이터 반환
		
	}
	public TreeNode peek(){	//top에 데이터가 있는지 확인하는 메소드
		if(this.isEmpty())	//비어있으면
		{
			System.out.println("Stack is empty.");
			return null;	//종료
		}
		return top.getNode();	//top 데이터 반환
	}
}