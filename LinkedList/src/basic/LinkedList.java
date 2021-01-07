package basic;

public class LinkedList {
	
	private class Node{
		int data;
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
	//O(1)
	public void addLast(int item) {
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
	//O(1)
	public void addFirst(int item) {
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
	public void addAt(int idx,int item) throws Exception {
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
	//O(1)
	public int getFirst() throws Exception {
		if(this.size==0) {
			throw new Exception("LL is Empty");
		}
	   return this.head.data;
	}	
	//O(1)
	public int getLast() throws Exception {
		if(this.size==0) {
			throw new Exception("LL is Empty");
		}
		return this.tail.data;
	}
	public int getAt(int idx) throws Exception {
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
	//O(1)
	public int removeFirst() throws Exception {
		if(size==0) {
			throw new Exception("LL is empty");
		}
		int rv=this.head.data;
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
	//O(N)
	public int removeLast() throws Exception {
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		int rv=this.tail.data;
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
	public void reverseData() throws Exception {
		int left=0;
		int right=this.size-1;
		
		
		
		while(left<right) {
			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);
			
			int temp=ln.data;
			ln.data=rn.data;
			rn.data=temp;
			
			left++;
			right--;
		}
	}
	public void reversePointers() {
		Node prev=this.head;
		Node curr=prev.next;
		
		while(curr!=null) {
			Node ahead= curr.next;
			curr.next=prev;
			
			prev=curr;
			curr=ahead;
		}
		
		//swap
		Node t = this.head;
		this.head=this.tail;
		this.tail=t;
		
		this.tail.next=null;
	}
	public int mid() {
		Node slow=head;
		Node fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	public void appendLastN(int n) throws Exception {

        LinkedList nl=new LinkedList();

        n=n%this.size;

        if(this.size==n)
        return;

        while(this.size!=n)
        {
            int temp=removeFirst();
            nl.addLast(temp);
        }
        for(int i=0; i < n; i++)
        {
            int temp=removeLast();
            nl.addFirst(temp);
        }
        this.head=nl.head;
        this.tail=nl.tail;
        this.tail.next=null;
        this.size=nl.size;



    }
	public void reverse(int k) throws Exception{

	    // Write your code here 
			int left=0;
			int right=k-1;
			
			while(left<right) {
				Node ln = getNodeAt(left);
				Node rn = getNodeAt(right);
				
				int temp=ln.data;
				ln.data=rn.data;
				rn.data=temp;
				
				left++;
				right--;
			}
}
	public void merge_sorted_list(LinkedList other) throws Exception {
        LinkedList list=new LinkedList(); 
        while(this.head!=null && other.head!=null){     //Remove next 

        if (this.getFirst()<=other.getFirst()){ 
            list.addLast(this.getFirst()); 
            this.head=this.head.next; 

        } 
        else{ 
            list.addLast(other.getFirst());  
            other.head=other.head.next; 

        } 
     } 
      
     while(this.head!=null){   //Remove next
            list.addLast(this.getFirst()); 
            this.head=this.head.next; 
        } 
        while(other.head!=null){     //Remove next
            list.addLast(other.getFirst());  
            other.head=other.head.next; 
        } 
        list.display(); 
     } 
	  public int kelefromlast(int k){
  		Node temp = head;
  		System.out.println(this.size);
  		int s = this.size-k;
  		while(s>0 ){
  			temp=temp.next;
  			s--;
  		}
  		return temp.data;
  	}

}
