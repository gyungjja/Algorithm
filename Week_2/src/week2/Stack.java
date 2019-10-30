package week2;

public class Stack {
	private Node top;	//����� top
	public Stack(){	//������
		this.top = null;
	}
	public boolean isEmpty(){	//������ ����ִ��� Ȯ���ϴ� �޼���
		return top == null;		//null�� ��ȯ
		
	}
	public void push(TreeNode node){	//�����͸� �־��ִ� �޼ҵ�
		Node sn = new Node(node,top);
		top = sn;
	}
	public TreeNode pop(){	//�����͸� ���ִ� �޼ҵ�
		if(this.isEmpty())	//���������
		{
			System.out.println("Stack is empty.");
			return null;	//����
		}
		Node node = top;	
		top = node.getLink();
		return node.getNode();	//������ ��ȯ
		
	}
	public TreeNode peek(){	//top�� �����Ͱ� �ִ��� Ȯ���ϴ� �޼ҵ�
		if(this.isEmpty())	//���������
		{
			System.out.println("Stack is empty.");
			return null;	//����
		}
		return top.getNode();	//top ������ ��ȯ
	}
}