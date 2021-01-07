package basic;

import java.util.Scanner;

public class QueenCombination {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int box=s.nextInt();
		int tq=s.nextInt();
		QueenCombination(new boolean[box],0,2,"",-1);
	}
	private static void QueenCombination(boolean[] boxes,int qpsf,int tq, String ans,int lastboxused) {
		if(tq==qpsf) {
			count++;
			System.out.println(count+" "+ans);
		}
		// TODO Auto-generated method stub
		for(int i=lastboxused+1;i<boxes.length;i++) {
			if(boxes[i]==false) {
				boxes[i]=true;
				QueenCombination(boxes,qpsf+1,tq,ans+"q"+qpsf+"b"+i+" ",i);
				boxes[i]=false;
			}
		}
	}
}
