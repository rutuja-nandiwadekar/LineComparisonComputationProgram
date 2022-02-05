package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

public class LineComparison {
	static int x1, x2, y1, y2, x3, x4, y3, y4;
	static int LengthOfLine;
	static int line1;
	static int line2;
	static int LengthOfLine1;
	static int LengthOfLine2;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		
		line1();
		line2();
		lengthOfLine1();
		lengthOfLine2();
		checkEqualityOfLines();
	}
	public static void line1() {
		System.out.println("Enter co-ordinates for X axis for line1");
		x1 = sc.nextInt();
		x2 = sc.nextInt();

		System.out.println("Enter co-ordinates for y axis for line1");
		y1 = sc.nextInt();
		y2 = sc.nextInt();
	}
	
	public static void lengthOfLine1() {
		LengthOfLine1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Lenght of line1 is: " + LengthOfLine1);
	}
	
	public static void line2() {
		System.out.println("Enter co-ordinates for X axis for line2");
		x3 = sc.nextInt();
		x4 = sc.nextInt();

		System.out.println("Enter co-ordinates for y axis for line2");
		y3 = sc.nextInt();
		y4 = sc.nextInt();
	}
	
	public static void lengthOfLine2() {
		LengthOfLine2 = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("Lenght of line2 is: " + LengthOfLine2);
	}

	public static void checkEqualityOfLines() {
		if (Objects.equals(LengthOfLine1, LengthOfLine2))
          System.out.println("Two lines are equal");
      else
          System.out.println("Two lines are not equal");
	}
}
