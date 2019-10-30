package week_6;

import java.util.*;
public class Graph {
	private GraphNode[] header;	//각 정점의 배열 인접 리스트
	private int vertex_cnt;	//정점의 개수
	
	public Graph(int vertex_cnt)
	{
		this.vertex_cnt = vertex_cnt;
		this.header = new GraphNode[vertex_cnt];
		for(int i = 0; i < vertex_cnt; i++)
			header[i] = new GraphNode(i);
	}
	
	//간선 연결 확인 메서드. 연결이 되어있으면 true 반환 아니면 false 반환
	private boolean EdgeCheck(int vertex, int target){	
		if(vertex == target)
			return true;
		else
			return false;
	}
	
	//정점끼리 간선 연견 메서드
	public void insertEdge(int vertex, int target){
		if(vertex >= header.length || target >= header.length) {
			System.out.println("vertex 값이 올바르지 않습니다.");
		}
		else {
			GraphNode gn = new GraphNode(target);
			gn.setLink(header[vertex]);
			header[vertex] = gn;
			
			GraphNode temp = header[vertex];
			int tempValue;
			while(temp.getLink() != null) {
				if()
				
			}
		}
	
		
		
	}
	
	//정점과 정점의 간선 해체.
	public void deleteEdge(int vertex, int target){
		
	}
	
	//정점의 간선 개수 리턴
	public int degree(int vertex){
		
	}
	
	//정점의 인접 정점 배열 반환
	public int[] adjacency(int vertex){
		
	}
	
	//해당 정점 기준으로 깊이 우선 탐색
	public void DFS(int vertex){
		Stack stack;
		int j;
		int n = 0;
		for(vertex=0; vertex<n; vertex++){
			header[vertex] = false;
		}
		stack = Stack();
		stack.push(vertex);
		while(!isEmpty(stack)){
			j = stack.pop();
			if(header[j] == false){
				System.out.println(j+" ");
			}
		}
		
		
	}
	
	//해당 정점 기준으로 너비 우선 탐색
	public void BFS(int vertex){
		Queue queue;
		int i,n;
		for(i = 0; i < n; i+1) {
			visited[i] = false;
		}
		queue = createQ();
		enqueue(queue,i);
		while(!isEmpty(queue){
			j = dequeue(queue);
			if(visited[j] = false) {
				visit j;
				visited[j] = true;
			}
			for() {
				if(visited[k] = false) {
					enqueue(queue,k);
				}
			}
		}
		
	}
	
	//모든 정점의 인접 정점 출력
	public void display(){
		
	}

	

}