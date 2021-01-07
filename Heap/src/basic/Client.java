package basic;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap heap = new Heap();
		heap.add(10);
		heap.display();
		heap.add(20);
		heap.display();
		heap.add(30);
		heap.display();
		heap.add(40);
		heap.display();
		heap.add(5);
		heap.display();
		heap.add(3);
		heap.display();
		heap.remove();
		heap.display();
		heap.remove();
		heap.display();
	}

}
