
public class Week5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap heap = new Heap(3);
		heap.insert(18); heap.insert(13); heap.insert(5);
		heap.insert(12); heap.insert(8);
		heap.print();
		heap.insert(3);
		heap.print();
		heap.insert(19);
		heap.print();
		heap.insert(9);
		heap.print();
		
		System.out.println("Delete Data : " + heap.delete());
		heap.print();
		System.out.println("Delete Data : " + heap.delete());
		heap.print();
		System.out.println("Delete Data : " + heap.delete());
		heap.print();
		
		Heap test = new Heap(3);
		test.testInsert(20); test.testInsert(90); test.testInsert(100);
		test.testInsert(70); test.testInsert(60); test.testInsert(50);
		test.testInsert(80); test.testInsert(10); test.testInsert(40);
		test.testInsert(30);
		System.out.println("Test Heap Data");
		test.print();
		test.makeTreeHeap();
		test.print();

	}

}
