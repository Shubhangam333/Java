
public class PrintSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abcd";
		for(int s=0;s<=str.length()-1;s++) {
			for(int e=s+1;e<=str.length();e++) {
				System.out.println(str.substring(s,e));
			}
		}
	}

}
