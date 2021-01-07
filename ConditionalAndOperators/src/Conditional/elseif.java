package Conditional;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        
        if(age<=11) {
        	System.out.println("child");
        }else if(age>=12 && age<=17) {
        	System.out.println("Teenager");
        }else if(age>=18 && age<=60) {
        	System.out.println("Adult");
        }else {
        	System.out.println("Old");
        }
	}

}
