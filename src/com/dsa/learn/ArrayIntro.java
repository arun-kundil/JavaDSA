/**
 * 
 */
package com.dsa.learn;

/**
 * @author arunk
 *
 */
public class ArrayIntro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[7];

		intArray[0] = 20;
		intArray[1] = -10;
		intArray[2] = 35;
		intArray[3] = -15;
		intArray[4] = 1;
		intArray[5] = 10;
		intArray[6] = 45;

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
