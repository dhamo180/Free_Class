package com.packagename.tester;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the table : ");

		int table = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(table + "*" + i + "=" + table * i);
		}
	}

}
