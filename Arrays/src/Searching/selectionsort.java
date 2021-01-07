package Searching;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,1,6,3,9,8};
		selectionSort(arr);	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
	 int min ,min_Index;
		
	  for(int i=0;i<arr.length-1;i++) {
		  min=arr[i];
		  min_Index=i;
		 for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<min) {
				min =arr[j];
				min_Index=j;
			}
		 }
		 arr[min_Index]=arr[i];
		 arr[i]=min;
	  }
	}



}
