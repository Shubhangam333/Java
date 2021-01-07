package RecursiveProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class AllIndices {

	public static ArrayList<Integer> list= new ArrayList<>();
    public static void main(String args[]) {
        // Your Code Here
			Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int m =s.nextInt();
        allIndices(arr,0,n,m);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i) +" ");
		}
    }
	public static void allIndices(int[]arr,int si,int li,int m){
		if(si>=li){
			return;
		}
		if(arr[si]==m){
			list.add(si);
		}
		allIndices(arr,si+1,li,m);
	}
}
