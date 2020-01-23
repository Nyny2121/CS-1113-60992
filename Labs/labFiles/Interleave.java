// Interleave 
// <Your name>
// <Your section>

import java.util.*;
import java.io.*;

public class Interleave
{
	public static void main(String[] args)
	{
		// Usage statement (2 inputs needed)
		// [Add code here]

		try {

			// Open scanner for file named args[0]
			Scanner scan1 = new Scanner(new File(args[0]));

			// Open scanner for file named args[1]
			// [Add code here]

			boolean moreLines = true;
			while (moreLines)
			{
				moreLines = false;

				// If scan1 has another line then read that line, copy it 
				// to the console, and set moreLines to true
				// [Add code here]

				// If the second scanner, scan2, has another line, 
				// then get that line, copy it to the console, and set 
				// moreLines to true.
				// [Add code here]
			}
		}
		catch (IOException ex)
		{
			// [Add code here]
		}
	} 
} 

