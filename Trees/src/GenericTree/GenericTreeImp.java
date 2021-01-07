package GenericTree;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTreeImp {
	private class Node{
		int data;
		ArrayList<Node> children;
		Node (int data){
			this.data=data;
			this.children=new ArrayList<>();
		}
	}
	private Node root;
	private int size;
	
	GenericTreeImp(){
		Scanner s = new Scanner(System.in);
		this.root=takeInput(s,null,0);
	}

	private Node takeInput(Scanner s, Node parent, int ithchild) {
		// TODO Auto-generated method stub
		if(parent==null) {
			System.out.println("Enter the data of root node");
		}else {
			System.out.println("Enter data for the"+ithchild+"of"+parent.data);
		}
		int nodedata=s.nextInt();
		Node node = new Node(nodedata);
		this.size++;
		System.out.println("Enter the number of children of"+node.data);
		int children=s.nextInt();
		//will be executed according to children value;
		for(int i=0;i<children;i++) {
			Node child=this.takeInput(s, node, i);
			node.children.add(child);
		}
		return node;
	}
	public void display() {
		this.display(root);
	}
	private void display(Node node) {
		String str=node.data+"=>";
		for(int i=0;i<node.children.size();i++) {
			str+=node.children.get(i).data+",";
		}
		str+="End";
		System.out.println(str);
		for(int i=0;i<node.children.size();i++) {
			this.display(node.children.get(i));
		}
	}
	
}
