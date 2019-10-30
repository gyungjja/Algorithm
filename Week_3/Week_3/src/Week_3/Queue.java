package Week_3;

public class Queue
{
	private Node front;	//앞 노드
	private Node rear;	//뒷 노드
	private int count;	//카운터 변수
	
	public Queue()	//큐 생성자
	{
		front = null;
		rear  = null;
		count = 0;
	}
	public boolean isEmpty()	//비어있는지 확인
	{
		return count == 0;
	}
	public void enqueue(TreeNode data)	//값을 넣고
	{
		Node node = new Node(data);
		if(count == 0)	
			front = rear = node;	//비어있으면 앞노드,뒷노드 처음넣어준 값.
		else
		{
			rear.setLink(node);	//마지막에 다음링크를 설정.
			rear = node;	//다음링크가 마지막이 됨.
		}
		count++;	//카운터 증가
	}
	public TreeNode dequeue()	//빼주고 반환
	{
		if(count == 0)
			return null;
		TreeNode data = front.getNode();	//값이 변하므로 미리 저장.
		front = front.getLink();	//제거
		if(front == null)
			rear = null;	//앞노드가 없으면 뒷노드도 없다.
		count--;
		return data;	//저장값 출력
	}
}
