package week_6;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph1 = new Graph(4);
		graph1.insertEdge(0, 1);
		graph1.insertEdge(0, 3);
		graph1.insertEdge(1, 2);
		graph1.insertEdge(2, 3);
		graph1.display();
		System.out.println("=====================");
		graph1.insertEdge(3, 2);
		graph1.deleteEdge(0, 2);
		graph1.deleteEdge(0, 3);
		graph1.deleteEdge(0, 1);
		System.out.println("=====================");
		graph1.display();
		System.out.println("=====================");
		System.out.println("the degree number of vertex 2 is : " + graph1.degree(2));
		System.out.println("=====================");
		int[] ad_2 = graph1.adjacency(2);
		System.out.println("vertex 2 adjacency ==>");
		for(int i = 0; i < ad_2.length; i++)
			System.out.print("| " + ad_2[i] + " |");
		System.out.println("\n=====================");
		graph1.display();
		
		Graph graph2 = new Graph(7);
		graph2.insertEdge(0, 1);
		graph2.insertEdge(0, 2);
		graph2.insertEdge(0, 3);
		graph2.insertEdge(1, 4);
		graph2.insertEdge(2, 4);
		graph2.insertEdge(2, 5);
		graph2.insertEdge(3, 5);
		graph2.insertEdge(4, 6);
		graph2.insertEdge(5, 6);
		graph2.display();
		
		graph2.DFS(0);
		graph2.BFS(0);
	}

}
