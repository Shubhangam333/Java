package Mathaematics;
import java.util.*;

public class dectooctal {
    public static void main(String args[]) {
        // Your Code Here
	Scanner s=new Scanner(System.in);
	 int dec = s.nextInt();
	 int temp=0,base=1,octal=0;
	 while(dec!=0){
		temp=dec%8;
        octal+=temp*base;
		base=base*10;
		dec=dec/8;
	 }
	 System.out.println(octal);
    }
}