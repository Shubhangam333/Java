package RecursiveProblem;

import java.util.Scanner;

public class AreTheySame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>=0){
			String s1 = s.nextLine();
			String s2=  s.nextLine();
			boolean ans=AreSame(s1,s2);
			if(ans==true){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			t--;
		}
    }
	public static boolean AreSame(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		if(s1.length()%2!=0){
			return false;
		}
		int l = s1.length();
		int m =l/2;
		String a1=s1.substring(0,m);
		String a2=s1.substring(m+1,l);
		String b1=s2.substring(0,m);
		String b2=s2.substring(m+1,l);
		if((a1==b1 && a2==b2) || (a1==b2 && a2==b1)){
			return true;
		}
		return false;
	}

}
