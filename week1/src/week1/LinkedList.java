package week1;

public class LinkedList {
private ListNode head = null; // head 노드 생성.
	
	public void addLastNode(Object data){ // 마지막에 노드추가
		ListNode newNode = new ListNode(data); // newnode 생성.
		
		if(head == null){ //head가 null 비어있다면,
			this.head = newNode; //newnode를 head가 가르킨다.
			return;
		}
		ListNode temp = head;	//헤드를 temp가 가르킨다
		while(temp.getLink() != null) {	// temp를 마지막합으로 만듬
			temp = temp.getLink();	
		}
		temp.setLink(newNode);	//마지막합의 다음합 새로운 마지막합
	}
	public void deleteLastNode(){
		ListNode pre = new ListNode();	//pre 객체 생성
		ListNode cur = new ListNode();	//cur 객체 생성
		
		if(head == null){	//아무것도 없으면 실행을 하지 않는다
			return;
		}
		else if(head.getLink() == null){	//리스트가 하나밖에 없으면 아예 제거
			head.setLink(null);
			return;
		}
		else{
			pre=head;	//마지막에서 두번째
			cur.setLink(head.getLink()); // 마지막
			while(cur.getLink() != null){	//만들어주고
				pre.setLink(cur);
				cur=cur.getLink();
			}
			pre.setLink(null);	//마지막에서 두번째를 마지막으로 만들어줌
		}
	}
	
	public boolean nodeSearch(Object data){
		ListNode temp = new ListNode();	//temp 객체 생성
		if(head==null) {	//아무것도 없으면 실행하지 않는다.
			return false;	//false 반환
		}else {
			temp = head;	//head가 temp면
			while(temp.getLink() != null) {	//만들어주고
				if(temp.getData() == data) {	
					return true;	//true 반환
				}
				temp = temp.getLink();
			}
		return false;
		}
	}
	
	void print() {
		ListNode temp = new ListNode();
		if(this.head == null){
			System.out.println("===List id Empty===");
		}
		else{
		temp = this.head;  //임시 노드에 헤드 저장
		System.out.println("===List Data===");
		while(temp != null){  //노드의 링크가 null값이 될 때까지 반복
			System.out.println(" | data : " + temp.getData() + " |");  //노드의 데이터 출력
			temp = temp.getLink();  //임시노드에 다음 노드를 저장		
		}
		System.out.println("===============");
		}
	}
}