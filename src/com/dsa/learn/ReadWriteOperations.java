/**
 * 
 */
package com.dsa.learn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author arunk
 *
 */
public class ReadWriteOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Arun", "Henna", "Paru" };

		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("output.txt"));
			for (String name : names) {
				writer.write(name + "\n");
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
