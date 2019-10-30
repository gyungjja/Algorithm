package week9;


public class Dijkstra {
	   private int weight[][];
	   private int numOfVertex;
	   private int dist[];
	   private boolean visit[];
	   Dijkstra(int w[][]){
	      weight=w; //�޾ƿ� ��ε��� ����   
	      numOfVertex=(weight.length); //�������� ����
	      dist=new int[numOfVertex]; //���� ������ŭ ����
	      visit=new boolean[numOfVertex]; //���� ������ŭ ����
	   }
	   public void shortestPath(int vertex) {
	      int min=1000;
	      int index=-1;
	      
	      for(int i=0; i<numOfVertex; i++) {
	         //dist�� visit�ʱ�ȭ
	         dist[i]=weight[vertex][i];
	         visit[i]=false;
	      }
	      visit[vertex]=true; //���������� �湮�ߴٰ� �Ǵ�
	      dist[vertex]=0; //�ڱ��ڽ��� �Ÿ��� 0
	      
	      //���� �ִ� ����� �ִܰ�� ã��
	      for(int i=0; i<numOfVertex-2; i++) {
	         min=1000;
	         for(int j=0; j<numOfVertex; j++) {
	            if(visit[j]==true || dist[j]==999) { //Ȯ������ ���� ����߿��� �������� �̾������(999���ƴҋ�)
	               continue;
	            }
	            if(min>dist[j]) { //���ݱ��� Ȯ�ε� ��κ��� �������
	               index=j;
	               min=dist[j];
	            }
	         }
	         visit[index]=true; //�ִܰ�� Ȯ��
	         
	         //Ȯ������ ���� ��ε� ���
	         for(int w=0; w<numOfVertex; w++) {
	            if(!visit[w]) { //Ȯ������ ���� ����߿���
	               if(dist[w]>(dist[index]+weight[index][w])) {//�ּҷ� Ȯ�ε� ��θ� ��ȴٰ� w������ ���� ��ΰ��� �� �������
	                  dist[w]=dist[index]+weight[index][w]; //���ο� �ּҰ�� ����
	               }
	            }
	         }
	         print(i);//�ܰ�Ȯ��
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
