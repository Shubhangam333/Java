package Patterns;

//Hollow Rhombus pattern
//n=6
//     ******
//    *    *
//   *    *
//  *    *
// *    *
//******
import java.util.*;
public class pattern14 {
    public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
      int nst,row=1,nsp=n-1,nspp=n-2;
	  while(row<=n){
        for(int csp=1;csp<=nsp;csp++){
			System.out.print(" ");
		}
	    if(row==1 || row==n){
			nst=n;
		    for(int cst=1;cst<=nst;cst++){
				System.out.print("*");
			}
		}else{
			System.out.print("*");
			for(int csp=1;csp<=nspp;csp++){
			System.out.print(" ");
		}
		    System.out.print("*");
		}
	   System.out.println();	  
	   row++;
	   nsp=nsp-1;
	  }
    }
}


