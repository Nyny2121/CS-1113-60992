
// SplitFile
// <Your name>
// <Your section>

import java.util.*;
import java.io.*;

public class SplitFile
{
	public static void main(String[] args)
	{
		// Usage statement (3 inputs needed)
		// [Your code here]
		PrintWriter file1 = null;
		PrintWriter file2 = null;

		try {
			// Open Scanner for file named args[0]
			Scanner scan = // [Add code here]

			// Open a PrintWriter for file named args[1]
			file1 = new PrintWriter(new File(args[1]));

			// Open a PrintWriter for file named args[2]
			file2 = // [Add code here]

			while (scan.hasNextLine())
			{
				// Read a line from scan
				// Write that line to file1
				// [Add code here]

				if (scan.hasNextLine()) 
				{
					// Read a line from scan
					// Write that line to file2
					// [Add code here]
				}
			}
		}
		// Catch the IOException 
		// [Add code here]

		// Create a finally block that closes the two PrintWriters
		// Add code here
   } 
} 

