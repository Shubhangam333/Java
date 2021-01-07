package Stack;

public class ReverseStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackusingArrays s = new StackusingArrays(5);
		for(int i=1;i<=5;i++) {
			s.push(i*10);
		}
		s.display();
		StackusingArrays h = new StackusingArrays(5);
		int index=0;
		reverseStack(s,h,index);
		s.display();
	}

	private static void reverseStack(StackusingArrays s, StackusingArrays h, int index) throws Exception {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			return;
		}
		int item=s.pop();
		reverseStack(s,h,index+1);
		h.push(item);
		if(index==0) {
		while(!h.isEmpty()) {
			s.push(h.pop());
		}
	}
	}
}
