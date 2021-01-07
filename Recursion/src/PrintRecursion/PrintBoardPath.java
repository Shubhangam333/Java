package PrintRecursion;

public class PrintBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		printBoard(0,10,"");
	}
	public static void printBoard(int si,int end,String result) {
		if(si==end) {
		 System.out.println(result);
		 return;
		}
		if(si>end) {
			return;
		}
		for(int i=1;i<=6;i++) {
			printBoard(si+i,end,result+i);
		}
	}

}
