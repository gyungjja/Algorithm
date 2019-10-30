package week10;

public class AOV_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AOVGraph AOV = new AOVGraph(6);
		
		AOV.insertEdge(0,  1);	//정점 0의 간선들을 삽입
		AOV.insertEdge(0,  2);
		
		AOV.insertEdge(1,  3);	//정점 1의 간선들을 삽입
		AOV.insertEdge(1,  4);
		
		AOV.insertEdge(2,  3);	//정점 2의 간선들을 삽입
		AOV.insertEdge(2,  4);
		
		AOV.insertEdge(3,  5);	//정점 3의 간선들을 삽입
		AOV.insertEdge(4,  5);	//정점 4의 간선들을 삽입
		
		AOV.topologicalSort();	//위상 정렬 함수 호출
		

	}

}
