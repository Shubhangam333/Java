package BinaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTreeImp {
	private class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data,Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	private Node root;
	private int size;
	
	BinaryTreeImp(){
		Scanner s=new Scanner(System.in);
		this.root=takeInput(s,null,false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isLeftorRight) {
		// TODO Auto-generated method stub
		if(parent==null) {
			System.out.println("Enter data of root node");
		}else {
			if(isLeftorRight) {
				System.out.println("Enter left child of "+parent.data);
			}else {
				System.out.println("Enter right child of "+parent.data);
			}
		}
		int nodeData=s.nextInt();
		Node node = new Node(nodeData,null,null);
		this.size++;
		boolean choice =false;
		System.out.println("Do you have left child of "+" "+node.data);
		choice=s.nextBoolean();
		
		if(choice) {
			node.left=takeInput(s,node,true);
		}
		//true==left child
		//false==right child
		choice =false;
		System.out.println("Do you have right child of "+" "+node.data);
		choice=s.nextBoolean();
		
		if(choice) {
			node.right=takeInput(s,node,false);
		}
		return node;
	}
	public void display() {
		this.display(this.root);
	}
	private void display(Node node) {
		String str=" ";
		if(node.left!=null) {
			str+=node.left.data+"=>";
		}else {
			str+="END=>";
		}
		str+=node.data;
		if(node.right!=null) {
			str+="<="+node.right.data;
		}else {
			str+="<=END";
		}
		System.out.println(str);
		if(node.left!=null) {
			this.display(node.left);
		}
		if(node.right!=null) {
			this.display(node.right);
		}
	}
	public int height() {
		return height(this.root);
	}
	private int height(Node root) {
		if(root==null) {
			return -1;
		}
		int h1=height(root.left);
		int h2=height(root.right);
		int h=0;
		if(h1>h2) {
			h=h1+1;
		}else {
			h=h2+1;
		}
		return h;
	} 
	public void preOrder() {
		preOrder(this.root);
	}
	private void preOrder(Node root) {
		if(root==null) {
			return ;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public void InOrder() {
		InOrder(this.root);
	}
    private void InOrder(Node root) {
		if(root==null) {
			return ;
		}
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
	}
	public void postOrder() {
		postOrder(this.root);
	}
	private void postOrder(Node root) {
		if(root==null) {
			return ;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while(!queue.isEmpty()) {
			Node rv = queue.removeFirst();
			System.out.print(rv.data+",");
			if(rv.left!=null) {
				queue.addLast(rv.left);
			}
			if(rv.right!=null) {
				queue.addLast(rv.right);
			}
		}
		System.out.println("END");
	}
	public boolean isBST() {
	 boolean ans=isBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	return ans;
	}
	
	private boolean isBST(Node node,int min,int max) {
		if(node==null) {
			return true;
		}
		if(node.data>max || node.data<min) {
			return false;
		}else if(!isBST(node.left,min,node.data)) {
			return false;
		}else if(!isBST(node.right,node.data,max)) {
			return false;
		}
		
		return true;
	}
	
	public int sumLeaf() {
		return this.sumLeaf(this.root);
	}

	private int sumLeaf(Node node) {
		// TODO Auto-generated method stub
		if(node==null) {
		return 0;
		}
		if(node.left == null && node.right==null) {
			return node.data;
		}
		int lsum=sumLeaf(node.left);
		int rsum=sumLeaf(node.right);
		
		return lsum+rsum;
	}
	
	
	
	
}
