package Mathaematics;
import java.util.*;
public class PythagorasTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long x = scan.nextInt();
		long m =0,n=0,h=0,b=0;
		if(x>=0&&x<=2){
			System.out.println("-1");
		}
		else if(x%2==0){
			m = x/2;
			n = 1;
            h = m*m+n*n;
			b = m*m-n*n;
			System.out.println(b+" "+h);	
		}else if (x % 2 != 0)  {
			m=(x+1)/2;
			n=(x-1)/2;
			h=m*m+n*n;
			b=2*m*n;
			System.out.println(b+" "+h);	
		}else{
			System.out.println("-1");
		}
	}

}
