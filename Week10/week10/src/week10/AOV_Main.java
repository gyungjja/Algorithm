package week10;

public class AOV_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AOVGraph AOV = new AOVGraph(6);
		
		AOV.insertEdge(0,  1);	//���� 0�� �������� ����
		AOV.insertEdge(0,  2);
		
		AOV.insertEdge(1,  3);	//���� 1�� �������� ����
		AOV.insertEdge(1,  4);
		
		AOV.insertEdge(2,  3);	//���� 2�� �������� ����
		AOV.insertEdge(2,  4);
		
		AOV.insertEdge(3,  5);	//���� 3�� �������� ����
		AOV.insertEdge(4,  5);	//���� 4�� �������� ����
		
		AOV.topologicalSort();	//���� ���� �Լ� ȣ��
		

	}

}
