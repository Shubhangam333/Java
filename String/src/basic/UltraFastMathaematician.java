package basic;

import java.util.Scanner;

public class UltraFastMathaematician {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t = s.nextInt();
		while(t>0){
		String str1 = s.next();
		String str2 = s.next();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				sb.append("1");
			}else{
				sb.append("0");
			}
		}
		System.out.println(sb);
		t--;
	}
	}

}
