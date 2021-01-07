package Mathaematics;

import java.util.*;
public class FtoC {
    public static void main(String args[]) {
        // Your Code Here
		Scanner scan = new Scanner(System.in);
		int start=scan.nextInt();
		int  end=scan.nextInt();
		int  step=scan.nextInt();
        int C;
		for(int i=start;i<=end;i=i+step){
           System.out.print(i+"\t");
		   C=(5*(i-32))/9;
		   System.out.println(C);
        }
    }
}

