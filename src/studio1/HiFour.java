package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Name one:");
		String s1 = ap.nextString("Name two:");
		String s2 = ap.nextString("Name three:");
		String s3 = ap.nextString("Name four:");
		System.out.println("Greetings, " + s0 + ", " + s1 + ", " + s2 + ", and " + s3 + ".");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
