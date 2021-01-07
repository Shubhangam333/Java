package basics;

import java.util.Scanner;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		int[][] arr = new int[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
			arr[i][j]=s.nextInt();
			}
		}
		int num=s.nextInt();
		int temp=0;
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
			if(arr[i][j]==num){
				temp=1;
				break;
			}			
			}
		}
		if(temp==1){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}

}
