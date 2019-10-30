//Max Heap
public class Heap {
	
	private int numOfNode;	//노드의 개수를 저장 할 변수 or 노드의 마지막 위치를 저장할 변수
	private int heap[];		//데이터를 저장할 배열 선언
	
	//생성자(매개변수로 최초 배열의 크기를 지정)
	public Heap(int size){
		numOfNode = 0;
		heap = new int[size];
	}
	//트리(배열)가 꽉찬 경우 처리할 메서드
	private void HeapFull(){
		
		int size = heap.length+1;	//배열의 크기
		//size += numOfNode;	//배열의 크기는 배열의 크기 + 노드의 개수
		int temp[] = new int[size];	//새로운 배열 선언
		for(int i =0; i<size-1; i++) {	//반복
			temp[i] = heap[i];	//기존 배열 인덱스값을 새로운 배열 인덱스값으로 넣어줌
		}
		heap = temp;	//temp(히프)를 heap(히프)에 대입
		
	}
	//트리에 원소 삽입 메서드
	public void insert(int key){
		int i;
		int n = heap.length - 1;	//현재 원소 수
		//size = 1; //배열 크기
		//n++;	//키값이 배열에 들어왔으니 증가
		if(n == numOfNode)	//원소수가 히프크기와 같다면
			HeapFull();	//메소드 호출
		numOfNode++;	//히프크기 1더하고
		for(i=numOfNode;;)
		{
			if(i == 1) break;	//자식 히프번호가 부모 히프 번호랑 같으면 탈출
			if(key <= heap[i/2]) break;	//삽입하려는 원소의 부모노드가 크고같다면 탈출
			heap[i] = heap[i/2];	//삽입하려는 원소 = 부모노드원소
			i = i/2;	//부모노드 인덱스를 삽입시키려는 원소에 대입
				
		}
		heap[i] = key; //들어온 키값을 히프의 i번째 키값에 대입
		
		
	}
	//트리의 root 노드를 삭제후 반환 메서드
	//Empty tree is return -1...
	public int delete(){
		int item,temp;
		int n = heap.length - 1;	//현재 원소 수
		if(n == 0){	// 삭제할게 없으면
			return 0;	//반환
		}
		item = heap[1];	//삭제할 루트원소
		temp = heap[numOfNode];	//이동시킬 마지막원소
		numOfNode = numOfNode - 1;	//히프 크기 하나 감소
		int i = 1;	//부모노드
		int j = 2;	//i의 왼쪽 자식 노드
		while(j <= numOfNode){	//노드의 개수와 같거나 작을때까지 반복
			if(j < numOfNode) {	//노드의 개수보다 작다면
				if(heap[j] < heap[j+1])	//오른쪽 자식이 더 크면
					j = j + 1;	//값이 큰 자식을 가리킨다
			}
			if(temp >= heap[j])	//히프크기보다 작거나 같다면
				break;	//탈출
			heap[i] = heap[j];	//왼쪽 자식노드를 부몬드에 대입
			i = j;	//자식노드 인덱스를 부모노드 인덱스에 대입
			j = j*2;	//자식노드 인덱스*2를 자식노드에 대입
			}
			heap[i] = temp;	//마지막배열 값을 넣어주고
			return item;	//item반환
	
			
	}
	//heap이 아닌 삽입하는 순서대로 트리를 만들기 위한 메서드
	public void makeTreeHeap(){
		int i,j,p,temp = 0;	//초기화
		int n = heap.length - 1;	//현재 원소수
		for(i = n/2; i>=1; i=i-1){	//현재 원소수/2 부터 i가 1보다 작거나 같을때 까지 반복
			p=i;	//원소수를 p에 대입 부모노드
			for(j=2*p; j<=n; j=2*j){	
				if(j<n)	//자식노드가 원소수보다 작으면
					if(heap[p] < heap[j+1])	//오른쪽 자식이 더크면
						j = j+1;	//값이 큰 자식을 가리킨다
				if(heap[p] >= heap[j])	//왼쪽 자식과 같거나 크면
					break;	//탈출
				temp = heap[p];	//부모노드를 temp에 대입
				heap[p] = heap[j];	//자식노드 히프를 부모노드 히프에 대입
				heap[j] = temp;	//부모노드를 자식노드 대입
				p = j;	//부모노드를 한 레벨 밑으로 이동
			}
		}
		
	}
	//트리 출력 메서드
	public void testInsert(int key)
	{
		if((heap.length - 1) == numOfNode)	//원소수가 노드개수와 같으면
			HeapFull();	//히프증가 메소드 호출
		heap[++numOfNode] = key;	//키값을 증가된 히프에 대입
	}
	
	public void print()	//print 함수
	{
		System.out.print("Heap Data : ");
		for(int i = 1; i <= numOfNode; i++)
			System.out.printf("| %2d |", heap[i]);
		System.out.println("\n");
	}

}