package week1;

public class ListNode {
	private Object data;
	private ListNode link;
	
	public ListNode(){	//�ƹ��͵� ���� ������
		this.data = null;
		this.link = null;
		
	}
	public ListNode(Object data){	//�����Ͱ��� �ִ� ������
		this.data = data;
		this.link = null;
		
	}
	public ListNode(Object data, ListNode link) {	//�����Ͱ��� �ּҰ��� �ִ� ������
		this.data = data;
		this.link = link;
	}
	public Object getData(){	//������ ���� getter �޼ҵ�
		return data;
		
	}
	public ListNode getLink(){	//�ּҰ��� getter �޼ҵ�
		return link;
	}
	public void setData(Object data){	//setter
		this.data = data;
		
	}
	public void setLink(ListNode link){ //setter
		this.link = link;
	}

}

