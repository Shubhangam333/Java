package pattern;

import java.util.Scanner;

public class waveprintcolwise {

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
			printColumnWise(arr,N);
	    }
			private static void printColumnWise(int[][] arr,int n) {
			// TODO Auto-generated method stub
				for(int j=0;j<n;j=j+1)
				{
				if(j%2==0)
				{
					for(int i=0;i<arr.length;i++)
						{
							System.out.print(arr[i][j]+","+" ");
						}
				}
				else
				{
					for(int i=arr.length-1;i>=0;i--)
					{
						System.out.print(arr[i][j]+","+" ");
					}
				}
			}
			System.out.print("END");
	}

}
