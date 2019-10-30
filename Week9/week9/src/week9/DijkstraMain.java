package week9;

public class DijkstraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight[][] = {{  0,   2,   5, 999,   3},
						  {999,   0, 999,   4,  10},
				          {999, 999,   0,   6,   2},
				          {999, 999, 999,   0, 999},
				          {999, 999,   1,   2,   0}};
		Dijkstra dijkstra = new Dijkstra(weight);
		dijkstra.shortestPath(0);
		

	}

}
