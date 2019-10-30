package week7;

public class KrusKalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create graph
		WG graph = new WG(6);
		graph.insertEdge(0, 5, 1); graph.insertEdge(0, 4, 2);
		graph.insertEdge(1, 2, 2); graph.insertEdge(1, 7, 3);
		graph.insertEdge(2, 6, 3); graph.insertEdge(2, 9, 4);
		graph.insertEdge(3, 3, 4); graph.insertEdge(3, 8, 5);
		graph.insertEdge(4, 8, 5);
		
		System.out.println("Print Graph");
		graph.print();
		
		System.out.println("\nPrint Edge");
		graph.printEdge();
		
		System.out.println("\nKrusKal MST (start - weight - end)");
		Edge[] krusKal = graph.Kruskal_MST();
		for(int i = 0; i < krusKal.length; i++)
			System.out.print("(" + krusKal[i].vertex + "-" + krusKal[i].weight + "-" + krusKal[i].target + ") ");
		

	}

}
