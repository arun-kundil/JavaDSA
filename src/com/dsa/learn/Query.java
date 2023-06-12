package com.dsa.learn;

import java.util.ArrayList;
import java.util.Scanner;

/*You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!*/

public class Query {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		int n, q;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<ArrayList<Integer>> input_lines = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < n; i++)

		{
			int d = sc.nextInt();
			ArrayList<Integer> input_line = new ArrayList<Integer>();
			for (int j = 0; j < d; j++) {
				input_line.add(sc.nextInt());
			}

			input_lines.add(input_line);
		}

		q = sc.nextInt();
		ArrayList<ArrayList<Integer>> queries = new ArrayList<ArrayList<Integer>>();
		for (int l = 0; l < q; l++) {
			ArrayList<Integer> query = new ArrayList<Integer>();
			for (int m = 0; m < 2; m++) {
				query.add(sc.nextInt());
			}

			queries.add(query);
		}

		for (int r = 0; r < queries.size(); r++) {
			int line_number = queries.get(r).get(0) - 1;
			int item = queries.get(r).get(1) - 1;
			try {
				System.out.println(input_lines.get(line_number).get(item));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("ERROR!");
			}

		}

	}
}