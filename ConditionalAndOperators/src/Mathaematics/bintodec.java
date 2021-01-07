package Mathaematics;

import java.util.*;
public class bintodec {
    public static void main(String args[]) {
        // Your Code Here
	Scanner s=new Scanner(System.in);
	 int binary = s.nextInt();
	 int temp=0,base=1,decimal=0;
	 while(binary!=0){
		temp=binary%10;
        decimal+=temp*base;
		base=base*2;
		binary=binary/10;
	 }
	 System.out.println(decimal);
    }
}