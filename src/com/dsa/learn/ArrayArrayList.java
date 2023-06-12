/**
 * 
 */
package com.dsa.learn;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author arunk
 *
 */

//Demonstrating Difference between Array and ArrayList

public class ArrayArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creation
		// String[] cars = new String[4];
		String[] cars = { "Tata", "Maruti", "Hyundai", "Honda" };
		// ArrayList<String> cars = new ArrayList<>();
		ArrayList<String> carsList = new ArrayList<>(Arrays.asList("Tata", "Maruti", "Hyundai", "Honda"));

		// Get Element

		System.out.println(cars[2]);
		System.out.println(carsList.get(2));

		// Update Element

		cars[2] = "Skoda";
		System.out.println(cars[2]);
		carsList.set(2, "Skoda");
		System.out.println(carsList.get(2));

		// Add Element
		// Cannot be done on Arrays
		carsList.add("Volkswagon");

		// Get Size
		System.out.println(cars.length);
		System.out.println(carsList.size());

		// Delete Element
		// Cannot be done on Arrays
		carsList.remove(4);

		// Print Elements
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		System.out.println(carsList);

	}

}
