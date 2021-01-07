package Stack;

import java.util.Scanner;

public class BalancedParenthesis extends StackusingArrays {
	

	public BalancedParenthesis(int capacity) throws Exception {
		super(capacity);
		// TODO Auto-generated constructor stub
	}

	public static boolean isBalanced(String str, StackusingArrays stack) throws Exception {
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				stack.push('(');
			}
			if(str.charAt(i)==')'){
				if(!stack.isEmpty() && stack.top()=='('){
					stack.pop();
				}
			}
			if(str.charAt(i)=='['){
				stack.push('[');
			}
			if(str.charAt(i)==']'){
				if(!stack.isEmpty() && stack.top()=='['){
					stack.pop();
				}
			}
			if(str.charAt(i)=='{'){
				stack.push('{');
			}
			if(str.charAt(i)=='}'){
				if(!stack.isEmpty() && stack.top()=='{'){
					stack.pop();
				}
			}
		}
		if(stack.isEmpty() ){
        return true;
   	 	}
    	else{
        return false;
    	}
	}
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
//			StackusingArrays s = new StackusingArrays(5);
//			for(int i=1;i<=5;i++) {
//				s.push(i*5);
//			}
//			while(!s.isEmpty()) {
//				s.display();
//				s.pop();
//			}
			Scanner s = new Scanner(System.in);
			String str = s.next();
			BalancedParenthesis bp = new BalancedParenthesis(1000);
			if (isBalanced(str, bp)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		
}
