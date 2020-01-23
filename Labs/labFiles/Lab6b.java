
// Lab 6b
// <Your name>
// <Your section number> 

import java.util.*;

public class Lab6b
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		// Read in the number of data points
		int numDataPoints = scan.nextInt();

		// Create an array to hold the data points, and another to
		// hold the moving average
		double data[] = new double[numDataPoints];
		double secondDerivative[] = // [add code here]

		// Read in all of the data points using a for loop
		// [Add code here]
		
		// Print out the data using printArray
		printArray(data);
		System.out.println();

		// Create the second derivative for each data point
		// and save them in the secondDerivative array
		// Since the first and last elements of the array do not have
		// neighbors, set the second derivatives of those indices to 0
		// [add code here]

		// Print the second derivative array using printArray.
		// [add code here]
	}
	
	public static void printArray(double[] arr)
	{
		// Print the values of arr on a single line with spaces between them.
		// [Add code here]
	}
}
