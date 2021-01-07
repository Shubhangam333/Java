package Searching;
import java.util.*;
public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scan.nextInt();
		}
		InsertionSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
    }
    public static void InsertionSort(int arr[]){
		for(int i=1;i<arr.length;i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
	}

}
