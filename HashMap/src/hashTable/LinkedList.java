package hashTable;
public class LinkedList<T> {
	private class Node{
		T data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void display() {
		System.out.println("________________");
		Node temp=this.head;
		while(temp!=null) {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		System.out.println();
		System.out.println("________________");
	}
	public boolean isEmpty() {
		if(this.size==0) {
			return true;
		}
		return false;
	}
	
	public void addLast(T item) {
		Node nn = new Node();
		nn.data=item;
		nn.next=null;
		
		if(this.size>=1) {
			this.tail.next=nn;
		}
		if(this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}else {
			this.tail=nn;
			this.size++;
		}
	}
	public void addFirst(T item) {
		Node fn = new Node();
		fn.data=item;
		fn.next=null;
		
		if(this.size>=1) {
			fn.next=head;
		}
		
		if(this.size==0) {
			this.head=fn;
			this.tail=fn;
			this.size++;
		}else {
			this.head=fn;
			this.size++;
		}
	}
	public void addAt(int idx,T item) throws Exception {
		if(idx<0||idx>this.size) {
			throw new Exception("Invalid Index");
		}
		if(idx==0 ) {
			addFirst(item);
		}else if(idx==size) {
			addLast(item);
		}else {
		Node prev=getNodeAt(idx-1);
		Node curr=getNodeAt(idx);
		Node nn = new Node();
		nn.data=item;
		nn.next=curr;
		prev.next=nn;
		this.size++;
		}
	}
	public T getFirst() throws Exception {
		if(this.size==0) {
			throw new Exception("LL is Empty");
		}
	   return this.head.data;
	}	
	public T getLast() throws Exception {
		if(this.size==0) {
			throw new Exception("LL is Empty");
		}
		return this.tail.data;
	}
	public T getAt(int idx) throws Exception {
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		if(idx==0||idx>=this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp=this.head;
		for(int i=1;i<=idx;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	private Node getNodeAt(int idx) throws Exception {
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		if(idx<0 || idx>=this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp=this.head;
		for(int i=1;i<=idx;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public T removeFirst() throws Exception {
		if(size==0) {
			throw new Exception("LL is empty");
		}
		T rv=this.head.data;
		if(size==1) {
			this.head=null;
			this.tail=null;
			this.size=0;
		}else {
		this.head=this.head.next;
		this.size--;
		}
		return rv;
	}
	public T removeLast() throws Exception {
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		T rv=this.tail.data;
		if(this.size==1) {
			this.head=null;
			this.tail=null;
			this.size=0;
		}else {
			Node temp=getNodeAt(this.size-2);
			this.tail=temp;
			this.tail.next=null;
			this.size--;
		}
		return rv;
	}
	public void removeAt(int idx) throws Exception {
		if(this.size==0) {
			throw new Exception("LL is Empty");
		}
		if(idx<0||idx>this.size) {
			throw new Exception("Invalid Index");
		}
		if(idx==0 ) {
			removeFirst();
		}else if(idx==this.size-1) {
			removeLast();
		}else {
		Node prev=getNodeAt(idx-1);
		Node curr=getNodeAt(idx);
		Node second=getNodeAt(idx+1);
		prev.next=second;
		curr.next=null;
		this.size--;
		}
	}
	public int find(T data) {
		int index=0;
		for(Node temp=this.head;temp!=null;temp=temp.next)
		{
			if(temp.data.equals(data)) {
				return index;
			}
			index++;
		}
		return -1;
	}
}

