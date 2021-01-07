package Stack;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,3,8,6,7,5};
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty()&& arr[i]>stack.peek()) {
				int rv = stack.pop();
				System.out.println(rv+"->"+arr[i]);
			}
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+"->"+"-1");
		}
	}

}

//Time complexity = O(n)
