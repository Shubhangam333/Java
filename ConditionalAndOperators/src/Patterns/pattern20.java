package Patterns;
import java.util.*;
public class pattern20 {
    public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
	 int n = scan.nextInt();
     int row=1,nsp=n-1,nst=1;
     int value;
	 while(row<=n){
		 value=row;
		 for(int csp=1;csp<=nsp;csp++){
			 System.out.print("\t");
		 }
		 for(int cst=1;cst<=nst;cst++){
			 if(cst<(nst+1)/2){
              System.out.print(value++ + "\t");
			 }else{
			  System.out.print(value-- +"\t");
			 }
		 }
		 nst=nst+2;
		 nsp=nsp-1;
		 row++;
		 System.out.println();
	 }
    }
}