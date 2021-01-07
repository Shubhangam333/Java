package PrintRecursion;

public class CountBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBoard(0,10,""));
	}
	public static int countBoard(int si,int end,String result) {
		if(si==end) {
		 return 1;
		}
		if(si>end) {
			return 0;
		}
		int count=0;
		for(int i=1;i<=6;i++) {
			count+=countBoard(si+i,end,result+i);
		}
	return count;
	}

}
