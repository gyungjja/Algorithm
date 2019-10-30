package week7;

interface CompKey
{
	public int compareTo(Object obj);
}
public class Edge {
	
	int vertex, weight, target;
	
	public Edge(int vertex, int weight, int target)
	{
		this.vertex = vertex; 	  //vertex
		this.weight = weight; 	  //weight
		this.target = target;	  //target
	}
	public int compareTo(Object value)
	{
		int a = this.weight;
		int b = ((Edge)value).weight;
		
		return a-b;
	}
}