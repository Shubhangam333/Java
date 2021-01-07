package RecursiveProblem;

import java.util.Scanner;

public class ConvertStringtoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s= new Scanner(System.in);
			String str = s.nextLine();
			int ans =ConverttoInt(str);
			System.out.println(ans);
	    }
		public static int ConverttoInt(String str){
			if(str.length()==0){
				return 0;
			}
			int i=str.charAt(0)-'0';
			int l =str.length()-1;
			int ans=(int)(i*Math.pow(10,l));
			ans+=ConverttoInt(str.substring(1));
			return ans;
	}

}
