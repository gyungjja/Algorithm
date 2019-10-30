package week1;

public class ListNode {
	private Object data;
	private ListNode link;
	
	public ListNode(){	//아무것도 없는 생성자
		this.data = null;
		this.link = null;
		
	}
	public ListNode(Object data){	//데이터값이 있는 생성자
		this.data = data;
		this.link = null;
		
	}
	public ListNode(Object data, ListNode link) {	//데이터값과 주소값이 있는 생성자
		this.data = data;
		this.link = link;
	}
	public Object getData(){	//데이터 값의 getter 메소드
		return data;
		
	}
	public ListNode getLink(){	//주소값의 getter 메소드
		return link;
	}
	public void setData(Object data){	//setter
		this.data = data;
		
	}
	public void setLink(ListNode link){ //setter
		this.link = link;
	}

}

