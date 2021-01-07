package RecursionGet;

import java.util.ArrayList;

public class GetBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetboardPath(0,10));
	}
	public static ArrayList<String> GetboardPath(int curr,int end){
		if(curr==end) {
			ArrayList<String> base = new ArrayList<String>();
		    base.add("\n");
			return base;
		}
		if(curr>end) {
			ArrayList<String> base = new ArrayList<String>();
		    return base;
		}
		ArrayList<String> mr = new ArrayList<String>();
		
		for(int dice=1;dice<=6;dice++) {
			ArrayList<String> rr = GetboardPath(curr+dice,end);
			
			for(String rrs:rr) {
				mr.add(dice+rrs);
			}
		}
		return mr;
	}

}
