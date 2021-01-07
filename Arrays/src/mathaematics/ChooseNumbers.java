package mathaematics;
import java.util.*;
public class ChooseNumbers {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		int temp=0;
		for(int i=0;i<arr.length-2;i++){
			for(int j=i+1;j<arr.length-1;j++){
				for(int k=j+1;k<arr.length;k++){
					if(arr[i]+arr[j]>=arr[k]){
						temp=1;
						break;
					}
				}
			}
		}
		if(temp==0){
		System.out.println("NO");
		}else{
			System.out.println("YES");
		}
    }
}
