package basic;

import basic.LinkedList;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
//		LinkedList ll = new LinkedList();
//		for(int i=1;i<=5;i++) {
//			ll.addLast(i*10);
//		}
//		ll.display();
//		ll.addFirst(5);
//		ll.display();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.getAt(3));
//		ll.addAt(3,25);
//		ll.display();
//		System.out.println(ll.removeFirst());
//		ll.display();
//		System.out.println(ll.removeLast());
//		ll.display();
//		ll.removeAt(3);
//		ll.display();
//		ll.reverseData();
//		ll.display();
//		ll.reversePointers();
//		ll.display();
//		System.out.println(ll.mid());
//		ll.reverse(3);
//		ll.display();
		 LinkedList list1 = new LinkedList();
			int n1 = scn.nextInt();
		 
		    for (int j = 0; j < n1; j++) {
			    int item = scn.nextInt();
			    list1.addLast(item);
		}

         LinkedList list2 = new LinkedList();
		    int n2 = scn.nextInt();
		 
		    for (int j = 0; j < n2; j++) {
			    int item = scn.nextInt();
			    list2.addLast(item);
		}
		   list1.merge_sorted_list(list2);
	}

		
}
