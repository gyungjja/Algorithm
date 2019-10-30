package week1;

public class LinkedList {
private ListNode head = null; // head ��� ����.
	
	public void addLastNode(Object data){ // �������� ����߰�
		ListNode newNode = new ListNode(data); // newnode ����.
		
		if(head == null){ //head�� null ����ִٸ�,
			this.head = newNode; //newnode�� head�� ����Ų��.
			return;
		}
		ListNode temp = head;	//��带 temp�� ����Ų��
		while(temp.getLink() != null) {	// temp�� ������������ ����
			temp = temp.getLink();	
		}
		temp.setLink(newNode);	//���������� ������ ���ο� ��������
	}
	public void deleteLastNode(){
		ListNode pre = new ListNode();	//pre ��ü ����
		ListNode cur = new ListNode();	//cur ��ü ����
		
		if(head == null){	//�ƹ��͵� ������ ������ ���� �ʴ´�
			return;
		}
		else if(head.getLink() == null){	//����Ʈ�� �ϳ��ۿ� ������ �ƿ� ����
			head.setLink(null);
			return;
		}
		else{
			pre=head;	//���������� �ι�°
			cur.setLink(head.getLink()); // ������
			while(cur.getLink() != null){	//������ְ�
				pre.setLink(cur);
				cur=cur.getLink();
			}
			pre.setLink(null);	//���������� �ι�°�� ���������� �������
		}
	}
	
	public boolean nodeSearch(Object data){
		ListNode temp = new ListNode();	//temp ��ü ����
		if(head==null) {	//�ƹ��͵� ������ �������� �ʴ´�.
			return false;	//false ��ȯ
		}else {
			temp = head;	//head�� temp��
			while(temp.getLink() != null) {	//������ְ�
				if(temp.getData() == data) {	
					return true;	//true ��ȯ
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
		temp = this.head;  //�ӽ� ��忡 ��� ����
		System.out.println("===List Data===");
		while(temp != null){  //����� ��ũ�� null���� �� ������ �ݺ�
			System.out.println(" | data : " + temp.getData() + " |");  //����� ������ ���
			temp = temp.getLink();  //�ӽó�忡 ���� ��带 ����		
		}
		System.out.println("===============");
		}
	}
}