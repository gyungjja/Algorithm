package week1;

public class Week_1_2 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.print();
		list.addLastNode("AAAA");
		list.addLastNode("BBBB");
		list.addLastNode("CCCC");
		list.print();
		list.deleteLastNode();
		list.print();
		System.out.println("AAAA search result : " + list.nodeSearch("AAAA"));
		System.out.println("CCCC search result : " + list.nodeSearch("CCCC"));
		list.deleteLastNode();
		list.deleteLastNode();
		list.print();
	}
}