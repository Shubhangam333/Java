import java.util.Scanner;

public class DiffinASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		String s=s1.nextLine();
		StringBuilder sb=new StringBuilder(s);
		int n=sb.length();
		int k=2;
		    for(int i=0;i<2*n-2;i=i+k) {
		        int c=sb.charAt(i+1)-sb.charAt(i);
		        sb.insert(i+1,c);
		        if(c<0||c>=10){
		            k=3;
		        }else{
		            k=2;
		        }
		    }
		System.out.print(sb);
	}

}
