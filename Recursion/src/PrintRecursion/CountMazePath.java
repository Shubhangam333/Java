package PrintRecursion;

public class CountMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countMazePath(0,0,2,2,""));
		}

		private static int countMazePath(int cc, int cr, int er, int ec, String result) {
			// TODO Auto-generated method stub
			if(cr==er && cc==ec) {
				return 1;
			}
			if(cr>er || cc>ec) {
				return 0;
			}
			int count=0;
			count+=countMazePath(cc,cr+1,er,ec,result+"H");
			count+=countMazePath(cc+1,cr,er,ec,result+"V");
			count+=countMazePath(cc+1,cr+1,er,ec,result+"D");
			return count;
		}
	}

