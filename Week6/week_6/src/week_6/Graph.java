package week_6;

import java.util.*;
public class Graph {
	private GraphNode[] header;	//�� ������ �迭 ���� ����Ʈ
	private int vertex_cnt;	//������ ����
	
	public Graph(int vertex_cnt)
	{
		this.vertex_cnt = vertex_cnt;
		this.header = new GraphNode[vertex_cnt];
		for(int i = 0; i < vertex_cnt; i++)
			header[i] = new GraphNode(i);
	}
	
	//���� ���� Ȯ�� �޼���. ������ �Ǿ������� true ��ȯ �ƴϸ� false ��ȯ
	private boolean EdgeCheck(int vertex, int target){	
		if(vertex == target)
			return true;
		else
			return false;
	}
	
	//�������� ���� ���� �޼���
	public void insertEdge(int vertex, int target){
		if(vertex >= header.length || target >= header.length) {
			System.out.println("vertex ���� �ùٸ��� �ʽ��ϴ�.");
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
	
	//������ ������ ���� ��ü.
	public void deleteEdge(int vertex, int target){
		
	}
	
	//������ ���� ���� ����
	public int degree(int vertex){
		
	}
	
	//������ ���� ���� �迭 ��ȯ
	public int[] adjacency(int vertex){
		
	}
	
	//�ش� ���� �������� ���� �켱 Ž��
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
	
	//�ش� ���� �������� �ʺ� �켱 Ž��
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
	
	//��� ������ ���� ���� ���
	public void display(){
		
	}

	

}