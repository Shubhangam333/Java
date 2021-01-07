package RecursionGet;

import java.util.ArrayList;

public class GetMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMazePath(0,0,2,2));
	}
	public static ArrayList<String> getMazePath(int cr,int cc,int er,int ec) {
		if(cr==er && cc==ec) {
			ArrayList<String> base = new ArrayList<String>();
		    base.add("\n");
			return base;
		}
		if(cr>er || cc>ec) {
			ArrayList<String> base = new ArrayList<String>();
		    return base;
		}
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = getMazePath(cr,cc+1,er,ec);
		for(String rrhs:rrh) {
			mr.add("H"+rrhs);
		}
		ArrayList<String> rrv = getMazePath(cr+1,cc,er,ec);
		for(String rrvs:rrv) {
			mr.add("V"+rrvs);
		}
		return mr;
	}

}
