package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	static int x1,x2,y1,y2;
	static int LengthOfLine;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter co-ordinates for X axis");
		x1 = sc.nextInt();
		x2 = sc.nextInt();

		System.out.println(""
				+ "Enter co-ordinates for y axis");
		y1 = sc.nextInt();
		y2 = sc.nextInt();
		
		lengthOfLine();
	}
	
	public static void lengthOfLine() {
	  LengthOfLine = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
      System.out.println("Lenght of line is: " + LengthOfLine);
	}

}
