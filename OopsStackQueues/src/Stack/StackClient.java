package Stack;

import java.util.Scanner;
public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackusingArrays s = new StackusingArrays(5);
		for(int i=1;i<=5;i++) {
			s.push(i*5);
		}
		while(!s.isEmpty()) {
			s.display();
			s.pop();
		}
		
	}

	
}
