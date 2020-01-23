// Lab 7a
// <Your name>
// <Your section>

import java.util.*;

public class Lab7a
{
	public static void main(String args[])
	{
		ArrayList<Double> list = createSquaresList(10);
		printList(list);
		removeElement(list, 4);
		printList(list);
		swapElements(list, 2, 6);
		printList(list);
		
		double max = getMaxValue(list);
		double ave = getAverage(list);
		
		// Print the max and average
		// [Your code here]
		
		int idx1 = linearSearch(list, 4);
		int idx2 = linearSearch(list, 75);
		
		// Print the two indices
		// [Your code here]
	}

	public static ArrayList<Double> createSquaresList(int n)
	{
		// Create an ArrayList with the squares of n numbers, 0 to n-1
		// Return the ArrayList
		// [Your code here]
		return null;
	}

	public static double getMaxValue(ArrayList<Double> list)
	{
		// [Your code here]
		return 0.0;
	}
	
	public static double getAverage(ArrayList<Double> list)
	{
		// [Your code here]
		return 0.0;
	}
	
	public static void removeElement(ArrayList<Double> list, int index)
	{
		// Remove the specified element from the list.
		// [Your code here]
	}
	
	public static void swapElements(ArrayList<Double> list, int a, int b)
	{
		// Write code that swaps elements a and b of the ArrayList
		// Hint: you need a temporary variable.
		// [Your code here]
	}
	
	public static int linearSearch(ArrayList<Double> list, double val)
	{
		// Use a linear search to find the index of a particular value.
		// Return that index, or -1 if the value is not found.
		// Do not use list.indexOf(val)
		// [Your code here]
		return -1;
	}
	
	public static void printList(ArrayList<Double> list)
	{
		// Print out the number of the list on one line, separated by 
		// a comma and space, with a newline at the end.
		// [Your code here]
	}
}
