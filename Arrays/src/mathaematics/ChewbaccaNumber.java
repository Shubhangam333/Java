package mathaematics;

import java.util.Scanner;

public class ChewbaccaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner s = new Scanner(System.in) ;
         long n = s.nextLong();
         long N = n ;
        int count = 0 ;
        while (n > 0){
            n = n/10 ;
            count++ ;
        }
        int []arr = new int [count] ;
        for (int i = count-1 ; i >=0 ; i--){
            arr[i] =(int)( N % 10) ;
            N = N/10 ;
        }
        for (int i = 0 ; i < count ; i++){
            if ((i == 0) && (arr[i] != 9) && (arr[i] >= 5)){
                arr[i] = 9 - arr[i] ;
            }
            if ((arr[i] >= 5) && (i > 0)){
                arr[i] = 9 - arr[i] ;
            }
        }
        for (int i = 0 ; i < count ; i++){
            System.out.print(arr[i]);
        }
	}

}
