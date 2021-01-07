package basic;

import java.util.Scanner;

public class PlaceQueenWays {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int box=s.nextInt();
		int tq=s.nextInt();
		QueenPermutation(new boolean[box],0,2,"");
	}

	private static void QueenPermutation(boolean[] boxes,int qpsf,int tq, String ans) {
		if(tq==qpsf) {
			count++;
			System.out.println(count+" "+ans);
		}
		// TODO Auto-generated method stub
		for(int i=0;i<boxes.length;i++) {
			if(boxes[i]==false) {
				boxes[i]=true;
				QueenPermutation(boxes,qpsf+1,tq,ans+"q"+qpsf+"b"+i+" ");
				boxes[i]=false;
			}
		}
	}

}
