package com.selectionsort;

public class SelectionSort {
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
	public  void sort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			int index = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[index])
					index = j;
			}	
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;

		}
	}

}
