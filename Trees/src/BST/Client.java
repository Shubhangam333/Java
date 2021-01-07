package BST;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {10 ,20 ,30,40,50,60,70};
		BST bt = new BST(in);
		bt.display();
		System.out.println(bt.findItem(10));
		System.out.println(bt.MaxInBST());
		bt.addInBST(45);
		bt.display();
	}

}
