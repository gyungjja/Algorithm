package week_6;

public class GraphNode 
{
	private int number;
	private GraphNode link;
	
	public GraphNode(int number)
	{
		this.number = number;
		this.link = null;
	}
	
	public GraphNode(int number, GraphNode link)
	{
		this.number = number;
		this.link = link;
	}
	public int getNumber() { return number; }

	public void setNumber(int number) { this.number = number; }

	public GraphNode getLink() { return link; }

	public void setLink(GraphNode link) { this.link = link; }
}
