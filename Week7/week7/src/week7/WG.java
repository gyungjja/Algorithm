package week7;


public class WG {
	private int numOfVertex;	//정점의 개수
	private int numOfEdge;		//간선의 개수
	private int[][] weight;		//간선의 가중치
	
	//생성자
	public WG(int numOfVertex){
		this.numOfVertex = numOfVertex;	//정점의 개수 인자값으로 받고
		this.numOfEdge = numOfVertex-1;				// 간선 초기화(신장트리는 n-1개 간선)
		weight = new int[numOfVertex][numOfVertex];			//가중치 초기화
		//자기 자신의 위치는 0 연결 되지 않는 간선의 가중치는 999로 지정
		for(int i = 0; i<numOfVertex; i++){	//해당정점
			for(int j = 0; j<numOfVertex; j++) {	//타겟정점
				if(i == j)	//연결이 되있으면
					weight[i][j] = 0;	//가중치 0
				else	//그렇지 않으면
					weight[i][j] = 999;	//가중치 999
			}
				
		}
			
	}
	
	//간선 삽입
	public void insertEdge(int v, int w, int t){
		//해당정점과 target 정점의 위치의 값을 인자값으로 받은 가중치로 저장
		int temp = v;	//임시 값을 저장할 변수 생성
		weight[v][t] = w;
		v = t;	//t의값을 v에 넣고
		weight[v][temp]=w;	//무방향 그래프이므로 간선인 똑같은 가중치
		/*
		if(weight[v][t] == 999)
			numOfEdge++;
		weight[v][t] = w;
		*/
		
	}
	
	//Kruskal algorithm
	public Edge[] Kruskal_MST(){
		MinHeap m= new MinHeap(); //그래프를 가중치에 따라 오름차순으로 정렬하기위해 사용
	       Edge p; //엣지 객체 선언
	       //Minheap의 Edge배열 채우기
	       for(int i=0; i<numOfVertex; i++) {
	           for(int j=i; j<numOfVertex; j++) {
	              if(weight[i][j]!=0 && weight[i][j]!=999) { //자기 자신위치,연결되어잇지 않은 간선,중복간선을 제외한 간선들
	                p=new Edge(i,weight[i][j],j); //간선을 엣지 객체에 저장
	                m.insert(p); //힙에 오름차순으로 저장
	              }
	           }
	        }
	       
	       //최소비용 신장트리 채우기
	       Edge kru[]=new Edge[numOfEdge]; //최소비용신장트리를 저장할 배열, 간선갯수만큼 크기지정
	       UnionFind u =new UnionFind(m.numberElements()); //힙에 저장된 갯수만큼 집합을만든다  
	       int count=0; //간선을 카운트할 변수
	       Edge q; //임시 포인터
	       while(count<numOfEdge) { //간선의 갯수만큼 반복한다
	          q=m.delete(); //힙에 가장위에있는 원소를 반환받는다(가중치가 제일 작은 원소)
	          if(u.find(q.vertex, q.target)) { //만약 같은 집합에 속해있다면 사이클를 이룰 수 있기 때문에 원소를 삽입하지 않고 다른 원소를 찾는다
	             continue;
	          }
	          kru[count]=q; //최소비용신장트리 배열에 삽입
	          u.union(q.vertex, q.target); //연결된 두간선을 같은 집합으로 묶어준다
	          count++; //간선갯수 증가
	       }
	       
	       return kru; //완성된 최소비용신장트리 리턴
		
	}
	
	//Edge print
	public void printEdge(){
		for(int i = 0; i < numOfVertex; i++) {
			for(int j = i; j < numOfVertex; j++) {	//j==i 시작해서 중복된 간선 제외
				if(weight[i][j] != 999 && weight[i][j] != 0) {//연결되지 않은 간선,자신의 위치를 제외한 나머지 간선 출력
					System.out.printf("[ %d-- %d--> %d]\n",i,weight[i][j],j);
				}
			}
		}
		
	}
	
	//Graph print
	public void print(){
		for(int i = 0; i < weight.length; i++) {
			for(int j =0; j < weight.length; j++) {
				System.out.printf("|%3d|",weight[i][j]);;
			}
			System.out.println();
		}
		
	}
}

