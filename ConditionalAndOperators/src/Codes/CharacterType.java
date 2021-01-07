package Codes;

import java.util.Scanner;

public class CharacterType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		if(ch>='A' && ch<='Z'){
			System.out.println("U");
		}else if(ch>='a'&& ch<='z'){
			System.out.println("L");
		}else{
			System.out.println("I");
		}
	}

}
