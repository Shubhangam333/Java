package PrintRecursion;

import java.util.ArrayList;

public class PrintMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMazePath(0,0,2,2,"");
	}

	private static void printMazePath(int cc, int cr, int er, int ec, String result) {
		// TODO Auto-generated method stub
		if(cr==er && cc==ec) {
			System.out.println(result);
			return ;
		}
		if(cr>er || cc>ec) {
			return;
		}
		printMazePath(cc,cr+1,er,ec,result+"H");
		printMazePath(cc+1,cr,er,ec,result+"V");
	}

}
