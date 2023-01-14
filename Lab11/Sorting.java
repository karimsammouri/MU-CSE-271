
/**
 * Implement sorting algorithms:
 * - Selection sort
 * - Insertion sort
 * - Quick sort
 * - Merge sort
 */
import java.util.Arrays;

/**
 * This class implements several sorting algorithms.
 * 
 * @author Karim R. Sammouri
 *
 */
public class Sorting {

	/**
	 * This method sorts a given array using the selection sort algorithm.
	 * 
	 * @param array The array to sort.
	 */
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min])
					min = j;
			}
			swap(array, min, i);
		}
	}

	/**
	 * This method sorts a given array using the insertion sort algorithm.
	 * 
	 * @param array The array to sort.
	 */
	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int value = array[i];
			int destination = i;
			while (destination > 0 && array[destination - 1] > value) {
				array[destination] = array[destination - 1];
				destination--;
			}
			array[destination] = value;
		}
	}

	/**
	 * This method sorts a given array using the quick sort algorithm.
	 * 
	 * @param array the array to sort
	 */
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	/**
	 * This overloaded method sorts a given array using the quick sort algorithm.
	 * 
	 * @param array The array to sort
	 * @param begin The starting index of the array to be sorted
	 * @param end   The last index of the array to be sorted
	 */
	private static void quickSort(int[] array, int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(array, begin, end);
			quickSort(array, begin, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, end);
		}
	}

	/**
	 * This method partitions an array following quick sort algorithm and returns
	 * the location of the pivot element.
	 * 
	 * @param array The array to partition
	 * @param begin The starting index of the array to be partitioned
	 * @param end   The last index of the array to be partitioned
	 * @return The index of the pivot element
	 */
	private static int partition(int[] array, int begin, int end) {
		int pivot = array[end];
		int partitionIndex = begin;
		for (int i = begin; i < end; i++) {
			if (array[i] <= pivot) {
				swap(array, i, partitionIndex);
				partitionIndex++;
			}
		}
		swap(array, partitionIndex, end);
		return partitionIndex;
	}

	/**
	 * Swap two elements in an array
	 * 
	 * @param array the array
	 * @param i     the index of the first element
	 * @param j     the index of the second element
	 */
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * This method sorts a given array using merge sort algorithm.
	 * 
	 * @param array The array to sort
	 * @return The sorted array
	 */
	public static int[] mergeSort(int[] array) {
		return mergeSort(array, 0, array.length - 1);
	}

	/**
	 * This method sorts a given array using merge sort algorithm.
	 * 
	 * @param array The array to sort
	 * @param begin The starting index of the array to be sorted
	 * @param end   The last index of the array to be sorted
	 */
	private static int[] mergeSort(int[] array, int begin, int end) {
		// you need to write the merge sort algorithm here
		// use this method mergeSort(int [], int, int) and merge(int [], int[])
		// to complete it
		if (array.length < 2)
			return array;
		int mid = array.length / 2;
		int[] left = new int[mid];
		int[] right = new int[array.length - mid];
		for (int i = 0; i < left.length; i++) {
			left[i] = array[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = array[left.length + i];
		}
		left = mergeSort(left, 0, left.length - 1);
		right = mergeSort(right, 0, right.length - 1);
		array = merge(left, right);
		return array;
	}

	/**
	 * This method merges two sorted arrays into one and returns it.
	 * 
	 * @param left  The first array
	 * @param right The second array
	 * @return The sorted merged array
	 */
	private static int[] merge(int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		int[] array = new int[left.length + right.length];
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < left.length) {
			array[k] = left[i];
			k++;
			i++;
		}
		while (j < right.length) {
			array[k] = right[j];
			k++;
			j++;
		}
		return array;
	}

	/**
	 * Testing the sorting methods defined above
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		int[] data = { -2, 45, 0, 11, -9, -8 };
		System.out.println("Unsorted: " + Arrays.toString(data));

		selectionSort(data);
		System.out.println("Sorted using selectionSort(): " + Arrays.toString(data));
		
		int[] data2 = { -2, 45, 0, 11, -9, -8 };
		System.out.println("Unsorted: " + Arrays.toString(data2));
		
		insertionSort(data2);
		System.out.println("Sorted using insertionSort(): " + Arrays.toString(data2));
	
		int[] data3 = { -2, 45, 0, 11, -9, -8 };
		System.out.println("Unsorted: " + Arrays.toString(data3));
		
		quickSort(data3);
		System.out.println("Sorted using quickSort(): " + Arrays.toString(data3));
		
		int[] data4 = { -2, 45, 0, 11, -9, -8 };
		System.out.println("Unsorted: " + Arrays.toString(data4));
		
		int[] data5 = mergeSort(data4);
		System.out.println("Sorted using mergeSort(): " + Arrays.toString(data5));
	}
}
