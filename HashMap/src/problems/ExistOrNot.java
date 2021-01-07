package problems;

import java.util.HashMap;
import java.util.Scanner;

public class ExistOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
			int n =s.nextInt();
			HashMap<Integer, Boolean> map = new HashMap<>();
			while (n-- > 0) {
				int item = s.nextInt();
				if (!map.containsKey(item)) {
					map.put(item,true);
				}
			}
			int q=s.nextInt();
			while(q-->0){
				int que=s.nextInt();
				if(map.containsKey(que)){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}
		}
	}

}
