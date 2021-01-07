package RecursionGet;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		ArrayList<String> arr =getPermutation(str);
		for(int j=0;j<arr.size();j++) {
			System.out.println(arr.get(j));
		}
	}

	private static ArrayList<String> getPermutation(String str) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			ArrayList<String> base = new ArrayList<String>();
			base.add(" ");
			return base;
		}
		char ch = str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String> rr = getPermutation(ros);
		ArrayList<String> mr = new ArrayList<String>();
		for(String rrs:rr) {
			for(int i=0;i<rrs.length();i++) {
				String val=rrs.substring(0,i)+ch+rrs.substring(i);
				mr.add(val);
			}
		}
		return mr;
	}

}
