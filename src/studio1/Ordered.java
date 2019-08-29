package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		double x = ap.nextInt("Value for x?");
		double y = ap.nextInt("Value for y?");
		double z = ap.nextInt("Value for z?");
		boolean isWhatever = true;
		boolean isOrdered = true;
		boolean isCool = true;
		boolean isLame = true;
		isCool = x<y;
		isLame = y<z;
		isWhatever= isCool && isLame;
		boolean isFun = true;
		boolean isPainful = true;
		isFun = x>y;
		isPainful = y>z;
		boolean isChaotic = true;
		isChaotic = isFun && isPainful;
		//isOrdered = x > y > z;
		isOrdered = isChaotic || isWhatever;
		System.out.println(isOrdered);
		//isOrdered = (x < y < z);
		//isOrdered = (x > y > z);
	}

}
