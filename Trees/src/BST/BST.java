package BST;

public class BST {
	private class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	
	public BST(int[] arr) {
		this.root=construct(arr,0,arr.length-1);
	}

	private Node construct(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low>high) {
			return null;
		}
		int mid = (low+high)/2;
		
		Node nn = new Node();
		nn.data=arr[mid];
		
		nn.left=construct(arr,low,mid-1);
		nn.right=construct(arr,mid+1,high);
		
		return nn;
	}

	public void display() {
		display(this.root);
	}
	private void display(Node node) {
		if(node==null)
		{
			return;
		}
		String str="";
		if(node.left!=null) {
			str+=node.left.data;
		}else {
			str+=".";
		}
		
		str+="=>"+node.data+"<=";
		if(node.right!=null) {
			str+=node.right.data;
		}else {
			str+=".";
		}
		
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	public boolean findItem(int item) {
		return findItem(this.root,item);
	}
	private boolean findItem(Node node,int item) {
		if(node==null) {
			return false;
		}
		if(item>node.data) {
			return findItem(node.right,item);
		}else if(item<node.data) {
			return findItem(node.left,item);
		}else {
			return true;
		}
	}
	public int MaxInBST() {
		return MaxInBST(this.root);
	}
	private int MaxInBST(Node node) {
		if(node.right==null) {
			return node.data;
		}
		return MaxInBST(node.right);
	}
	public void addInBST(int item) {
		addInBST(this.root,item);
	}

	private void addInBST(Node node, int item) {
		// TODO Auto-generated method stub
		if(item>node.data) {
			if(node.right== null) {
				Node nn = new Node();
				nn.data=item;
				
				node.right=nn;
			}else {
				addInBST(node.right,item);
			}
		}else {
			if(node.left== null) {
				Node nn = new Node();
				nn.data=item;
				
				node.left=nn;
			}else {
				addInBST(node.left,item);
			}
		}
	}
	
}
