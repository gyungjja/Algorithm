package Week_3;

public class Queue
{
	private Node front;	//�� ���
	private Node rear;	//�� ���
	private int count;	//ī���� ����
	
	public Queue()	//ť ������
	{
		front = null;
		rear  = null;
		count = 0;
	}
	public boolean isEmpty()	//����ִ��� Ȯ��
	{
		return count == 0;
	}
	public void enqueue(TreeNode data)	//���� �ְ�
	{
		Node node = new Node(data);
		if(count == 0)	
			front = rear = node;	//��������� �ճ��,�޳�� ó���־��� ��.
		else
		{
			rear.setLink(node);	//�������� ������ũ�� ����.
			rear = node;	//������ũ�� �������� ��.
		}
		count++;	//ī���� ����
	}
	public TreeNode dequeue()	//���ְ� ��ȯ
	{
		if(count == 0)
			return null;
		TreeNode data = front.getNode();	//���� ���ϹǷ� �̸� ����.
		front = front.getLink();	//����
		if(front == null)
			rear = null;	//�ճ�尡 ������ �޳�嵵 ����.
		count--;
		return data;	//���尪 ���
	}
}
