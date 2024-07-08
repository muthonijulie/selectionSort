package selectionSort;

public class SelectionSort {
	    void selectionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++) {
	            int small = i; // Minimum element in unsorted array

	            for (int j = i+1; j < n; j++) {
	                if (arr[j] < arr[small]) {
	                    small = j;
	                }
	            }

	            // Swap the minimum element with the first element
	            int temp = arr[small];
	            arr[small] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    void printArr(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        SelectionSort ss = new SelectionSort();
	        int[] a = { 78,53,35,12,59,6 };
	        System.out.println("Before sorting array elements are - ");
	        ss.printArr(a);
	        ss.selectionSort(a);
	        System.out.println("After sorting array elements are - ");
	        ss.printArr(a);
	    }
	}

	


