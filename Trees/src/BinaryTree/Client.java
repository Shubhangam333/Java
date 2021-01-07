package BinaryTree;

public class Client {
	public static void main(String args[]) {
		BinaryTreeImp bt = new BinaryTreeImp();
		bt.display();
		System.out.println(bt.height());
		bt.preOrder();
		System.out.println();
		bt.postOrder();
		System.out.println();
		bt.InOrder();
		System.out.println();
		bt.levelOrder();
		System.out.println(bt.sumLeaf());
	}
}
