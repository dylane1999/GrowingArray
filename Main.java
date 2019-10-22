package com.growingArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static int[] firstArray = new int[5];
	public  static int desiredLength;
	//public static int[] nextArray;



	public static void main(String[] args) {

		firstArray[0] = 1;
		firstArray[1] = 2;
		firstArray[2] = 3;
		firstArray[3] = 4;
		firstArray[4] = 5;

	System.out.println(Arrays.toString(firstArray));

	findNewLength();
	copyArray();



    }
	public static void findNewLength() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a desired array length: ");
		desiredLength = input.nextInt();

		if (!(desiredLength > 5)) {
			try {
				throw new NumberFormatException("Desired length is less than current array size");
			} catch (NumberFormatException e) {
				System.out.println("Desired length is less than current array size");
				throw e; // rethrowing the exception
			}
		}

		System.out.println("You entered " + desiredLength);


	}

	public  static void copyArray(){
		int[] nextArray =  new int[desiredLength];

		for (int i = 0; i < firstArray.length; i++) {
			nextArray[i] = firstArray[i];
		}
		System.out.println(Arrays.toString(nextArray));

	}



}

