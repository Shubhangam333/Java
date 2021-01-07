package pattern;

import java.util.Scanner;

public class Spiralprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int M=scan.nextInt();
		int N=scan.nextInt();
		int[][] arr = new int[M][N];
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("---------------------");
		printSpiral(arr,M,N);
	}

	private static void printSpiral(int[][] arr, int m,int n) {
		// TODO Auto-generated method stub
		int startrow=0;
		int startcol=0;
		int endrow=m-1;
		int endcol=n-1;
		
		while(startrow<=endrow && startcol<=endcol) {
			for(int i=startcol;i<=endcol;i++) {
				System.out.println(arr[startrow][i]);
			}
			startrow++;
			for(int i=startrow;i<=endrow;i++) {
				System.out.println(arr[i][endcol]);
			}
			endcol--;
			for(int i=endcol;i>=startcol;i--) {
				System.out.println(arr[endrow][i]);
			}
			endrow--;
			for(int i=endrow;i>=startrow;i--) {
				System.out.println(arr[i][startcol]);
			}
			startcol++;
		}
	}

}
