package week9;


public class Dijkstra {
	   private int weight[][];
	   private int numOfVertex;
	   private int dist[];
	   private boolean visit[];
	   Dijkstra(int w[][]){
	      weight=w; //받아온 경로들을 저장   
	      numOfVertex=(weight.length); //정점갯수 저장
	      dist=new int[numOfVertex]; //정점 갯수만큼 생성
	      visit=new boolean[numOfVertex]; //정점 갯수만큼 생성
	   }
	   public void shortestPath(int vertex) {
	      int min=1000;
	      int index=-1;
	      
	      for(int i=0; i<numOfVertex; i++) {
	         //dist와 visit초기화
	         dist[i]=weight[vertex][i];
	         visit[i]=false;
	      }
	      visit[vertex]=true; //시작정점은 방문했다고 판단
	      dist[vertex]=0; //자기자신의 거리는 0
	      
	      //원래 있던 경로중 최단경로 찾기
	      for(int i=0; i<numOfVertex-2; i++) {
	         min=1000;
	         for(int j=0; j<numOfVertex; j++) {
	            if(visit[j]==true || dist[j]==999) { //확정되지 않은 경로중에서 두정점이 이어진경우(999가아닐뗴)
	               continue;
	            }
	            if(min>dist[j]) { //지금까지 확인된 경로보다 작을경우
	               index=j;
	               min=dist[j];
	            }
	         }
	         visit[index]=true; //최단경로 확인
	         
	         //확정되지 않은 경로들 계산
	         for(int w=0; w<numOfVertex; w++) {
	            if(!visit[w]) { //확정되지 않은 경로중에서
	               if(dist[w]>(dist[index]+weight[index][w])) {//최소로 확인된 경로를 들렸다가 w정점에 가는 경로값이 더 작을경우
	                  dist[w]=dist[index]+weight[index][w]; //새로운 최소경로 저장
	               }
	            }
	         }
	         print(i);//단계확인
	      }
	      
	      
	   }
	   private void print(int step){
	      System.out.println("Step : " + (step + 1));
	      System.out.println("===============================Shortest Path===============================");
	      System.out.printf("%9s" , "Vertex : ");
	      for(int i = 0 ; i < numOfVertex ; i++)
	         System.out.printf("|%10d|" , i);
	      System.out.println();
	      
	      System.out.printf("%9s" , "S : ");
	      for(int i = 0 ; i < numOfVertex ; i++)
	         System.out.printf("|%10s|" , visit[i] == true?"true":"false");
	      System.out.println();
	      
	      System.out.printf("%9s" , "Dist : ");
	      for(int i = 0 ; i < numOfVertex ; i++)
	         System.out.printf("|%10d|" , dist[i]);
	      System.out.println("\n========================================================================\n");
	   }
	}
