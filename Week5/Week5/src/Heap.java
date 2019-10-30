//Max Heap
public class Heap {
	
	private int numOfNode;	//����� ������ ���� �� ���� or ����� ������ ��ġ�� ������ ����
	private int heap[];		//�����͸� ������ �迭 ����
	
	//������(�Ű������� ���� �迭�� ũ�⸦ ����)
	public Heap(int size){
		numOfNode = 0;
		heap = new int[size];
	}
	//Ʈ��(�迭)�� ���� ��� ó���� �޼���
	private void HeapFull(){
		
		int size = heap.length+1;	//�迭�� ũ��
		//size += numOfNode;	//�迭�� ũ��� �迭�� ũ�� + ����� ����
		int temp[] = new int[size];	//���ο� �迭 ����
		for(int i =0; i<size-1; i++) {	//�ݺ�
			temp[i] = heap[i];	//���� �迭 �ε������� ���ο� �迭 �ε��������� �־���
		}
		heap = temp;	//temp(����)�� heap(����)�� ����
		
	}
	//Ʈ���� ���� ���� �޼���
	public void insert(int key){
		int i;
		int n = heap.length - 1;	//���� ���� ��
		//size = 1; //�迭 ũ��
		//n++;	//Ű���� �迭�� �������� ����
		if(n == numOfNode)	//���Ҽ��� ����ũ��� ���ٸ�
			HeapFull();	//�޼ҵ� ȣ��
		numOfNode++;	//����ũ�� 1���ϰ�
		for(i=numOfNode;;)
		{
			if(i == 1) break;	//�ڽ� ������ȣ�� �θ� ���� ��ȣ�� ������ Ż��
			if(key <= heap[i/2]) break;	//�����Ϸ��� ������ �θ��尡 ũ���ٸ� Ż��
			heap[i] = heap[i/2];	//�����Ϸ��� ���� = �θ������
			i = i/2;	//�θ��� �ε����� ���Խ�Ű���� ���ҿ� ����
				
		}
		heap[i] = key; //���� Ű���� ������ i��° Ű���� ����
		
		
	}
	//Ʈ���� root ��带 ������ ��ȯ �޼���
	//Empty tree is return -1...
	public int delete(){
		int item,temp;
		int n = heap.length - 1;	//���� ���� ��
		if(n == 0){	// �����Ұ� ������
			return 0;	//��ȯ
		}
		item = heap[1];	//������ ��Ʈ����
		temp = heap[numOfNode];	//�̵���ų ����������
		numOfNode = numOfNode - 1;	//���� ũ�� �ϳ� ����
		int i = 1;	//�θ���
		int j = 2;	//i�� ���� �ڽ� ���
		while(j <= numOfNode){	//����� ������ ���ų� ���������� �ݺ�
			if(j < numOfNode) {	//����� �������� �۴ٸ�
				if(heap[j] < heap[j+1])	//������ �ڽ��� �� ũ��
					j = j + 1;	//���� ū �ڽ��� ����Ų��
			}
			if(temp >= heap[j])	//����ũ�⺸�� �۰ų� ���ٸ�
				break;	//Ż��
			heap[i] = heap[j];	//���� �ڽĳ�带 �θ�忡 ����
			i = j;	//�ڽĳ�� �ε����� �θ��� �ε����� ����
			j = j*2;	//�ڽĳ�� �ε���*2�� �ڽĳ�忡 ����
			}
			heap[i] = temp;	//�������迭 ���� �־��ְ�
			return item;	//item��ȯ
	
			
	}
	//heap�� �ƴ� �����ϴ� ������� Ʈ���� ����� ���� �޼���
	public void makeTreeHeap(){
		int i,j,p,temp = 0;	//�ʱ�ȭ
		int n = heap.length - 1;	//���� ���Ҽ�
		for(i = n/2; i>=1; i=i-1){	//���� ���Ҽ�/2 ���� i�� 1���� �۰ų� ������ ���� �ݺ�
			p=i;	//���Ҽ��� p�� ���� �θ���
			for(j=2*p; j<=n; j=2*j){	
				if(j<n)	//�ڽĳ�尡 ���Ҽ����� ������
					if(heap[p] < heap[j+1])	//������ �ڽ��� ��ũ��
						j = j+1;	//���� ū �ڽ��� ����Ų��
				if(heap[p] >= heap[j])	//���� �ڽİ� ���ų� ũ��
					break;	//Ż��
				temp = heap[p];	//�θ��带 temp�� ����
				heap[p] = heap[j];	//�ڽĳ�� ������ �θ��� ������ ����
				heap[j] = temp;	//�θ��带 �ڽĳ�� ����
				p = j;	//�θ��带 �� ���� ������ �̵�
			}
		}
		
	}
	//Ʈ�� ��� �޼���
	public void testInsert(int key)
	{
		if((heap.length - 1) == numOfNode)	//���Ҽ��� ��尳���� ������
			HeapFull();	//�������� �޼ҵ� ȣ��
		heap[++numOfNode] = key;	//Ű���� ������ ������ ����
	}
	
	public void print()	//print �Լ�
	{
		System.out.print("Heap Data : ");
		for(int i = 1; i <= numOfNode; i++)
			System.out.printf("| %2d |", heap[i]);
		System.out.println("\n");
	}

}