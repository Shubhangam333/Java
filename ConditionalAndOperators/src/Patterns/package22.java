package Patterns;
//9
//              1
//          2 1   1 2
//      3 2 1       1 2 3
//    4 3 2 1         1 2 3 4
//5 4 3 2 1             1 2 3 4 5
//    4 3 2 1         1 2 3 4
//        3 2 1     1 2 3
//          2 1   1 2
//              1

import java.util.*;
public class package22 {
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int row=1,nsp=n-1,nst=1,nspp=0,nstt=0;
		int value=0;
        while(row<=n){
			if(row<=(n+1)/2){
			value=row;
			}else{
				value=n-row+1;
			}
			for(int csp=1;csp<=nsp;csp++){
				System.out.print("  ");
			}
			if(row==1 || row==n){
				System.out.print("1");
			}else{
			for(int cst=1;cst<=nst;cst++){
				if(cst!=nst){
					System.out.print(value-- + " ");
				}else{
					System.out.print(value-- );
				}
			}
			value++;
			for(int cspp=1;cspp<=nspp;cspp++){
				System.out.print(" ");
			}
			for(int cst=1;cst<=nstt;cst++){
				if(cst!=nstt){
				System.out.print(value++ + " ");
				}else{
					System.out.print(value++);
				}
			}
			}
			if(row==1){
				nst++;
				nstt=nstt+2;
				nsp=nsp-2;
				nspp=nspp+3;
			}else if(row<(n+1)/2){
				nst++;
				nstt++;
				nsp=nsp-2;
				nspp=nspp+4;
			}else{
                nst--;
				nstt--;
				nsp=nsp+2;
				nspp=nspp-4;
			}
			row++;
			System.out.println();
		}
    }
}