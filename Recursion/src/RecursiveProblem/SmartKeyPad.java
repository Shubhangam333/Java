package RecursiveProblem;

import java.util.Scanner;

public class SmartKeyPad {

		// TODO Auto-generated method stub
		static String[] table = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	    public static void main(String args[]) {
			Scanner scn = new Scanner(System.in);
			String s = scn.next();
			// ArrayList<String> list = codes(s, Math.pow(10, s.length() - 1));
			// for (String val : list) {
			// System.out.println(val);
			// }
			codes(s, "");
		}

		public static void codes(String ques, String ans) {	
			if (ques.length() == 0) {
				System.out.println(ans);
				return;
			}

			char ch = ques.charAt(0);
			String ros = ques.substring(1);
			String code = table[ch - '0'];

			for (int i = 0; i < code.length(); i++){
				codes(ros, ans + code.charAt(i));
			}
	}

}
