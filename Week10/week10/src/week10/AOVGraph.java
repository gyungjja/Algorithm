package week10;

import java.util.Queue;	//큐 라이브러리
import java.util.LinkedList;	//연결리스트 라이브러리

public class AOVGraph {
	private Queue<Integer>[] Q;	// 정점 i의 직속 후속자를 저장하는 큐
	private Queue<Integer> zeroPredQ;	// 선행자가 없는 정점들을 저장하는 큐
	private LinkedList<Integer> sortedList;	//위상 정렬 결과를 보관하는 리스트
	private int[] indegree;	//정점 i 의 진입 차수
	private int n;	//정점 수
	
	public AOVGraph(int numOfVertex){	//생성자
		n = numOfVertex;
		Q = new Queue[n];	//큐 배열 선언
		zeroPredQ = new LinkedList<Integer>();	//선행자가 없는 정점을 저장하는 큐 선언
		sortedList = new LinkedList<Integer>();	//위상 정렬 결과를 보관하는 리스트 선언
		for(int i = 0; i < n; i++){	//간선수까지 반복
			Q[i] = new LinkedList<Integer>();	//초기화
		}
		indegree = new int[n];	//진입 차수 선언
		
	}
	
	public void topologicalSort(){
		int i,v,successor;	//successor = 후행자
		for(i = 0; i <n; i++){
			if(indegree[i]==0)	//선행자 없으면
				zeroPredQ.offer(i);	//선행자가 없는 정점큐에 삽입
		}
		if(zeroPredQ.isEmpty()){	//선행자가 없는 큐가 비었으면
			System.out.println("network has a cycle");	//출력
			return;	//반환
		}
		while(!zeroPredQ.isEmpty()){	//선행자가 없는 정점이 안빌때 까지
			v = zeroPredQ.poll();	//v에 삭제한 값 대입
			sortedList.offer(v);	//연결리스트에 삽입
			if(Q[v].isEmpty()) continue;	//정점 v의 후속자가 없으면 밖의 while 루프로
			else successor = Q[v].poll();	//후속자가 있으면, 그후속자를 successor로 설정
			while(true){	
				indegree[successor]--;	//후속자 정점의 진입차수 감소
				if(indegree[successor]==0)	//0이되면
					zeroPredQ.offer(successor);	//zeroPredQ에 삽입
				if(!Q[v].isEmpty()) successor = Q[v].poll();	//정점v의 후속자가 안비었으면 후행자에 정점v의 삭제한값 대입
				else break;	//아니면 break;
			}
		}
		System.out.println("Topological Order is : ");	//출력
		while(!sortedList.isEmpty())	//위상 정렬 리스트가 비지 않을때까지
			System.out.print(sortedList.remove()+ " ");	//출력
		System.out.println();
		System.out.println("End");
	}
	
	public void insertEdge(int i, int j){	
		Q[i].offer(j);	//정점 i에 j삽입
		indegree[j]++;	//정점 j의 진입차수 증가
		
		
	}

}