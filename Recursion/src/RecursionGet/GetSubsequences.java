package RecursionGet;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		ArrayList<String> arr =getSS(str);
		for(int j=0;j<arr.size();j++) {
			System.out.println(arr.get(j));
		}
	}

	private static ArrayList<String> getSS(String str) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			ArrayList<String> baseResult= new ArrayList<String>();
			baseResult.add(" ");
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult= new ArrayList<String>();
		ArrayList<String> recResult = getSS(ros);
		for(int i=0;i<recResult.size();i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc+recResult.get(i));
		}
		return myResult;
	}

}
