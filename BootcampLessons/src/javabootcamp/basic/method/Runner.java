package javabootcamp.basic.method;

import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// int num = scanner.nextInt();
		// System.out.println(getNumPlusOne(num));

//		int n1 = scanner.nextInt();
//		int n2 = scanner.nextInt();
//		int newNum = getTwoNum(n1, n2);
//		System.out.println(newNum);
		
		
//		int n1 = scanner.nextInt();
//		System.out.println(perfectNum(n1));
		
		
		
//		int n1 = scanner.nextInt();
//		int sum = getSumDigit(n1);
//		System.out.println(sum);
		
		
//		int[] arr = {2, 91,55,73};
//		int count = findSum10InArray(arr);
//		System.out.println(count);
		
		
//		int[][] arr =  {{2,1,5,5,1,2},
//				        {6,7,3,3,7,6},
//				        {0,8,0,0,8,0}
//			
//		};
//		System.out.println(matrixMirrow(arr,6,3));
//		
		
//		double res = 10*Math.sin(Math.PI/4);
//		System.out.println(res);
//		
//		double res1 = Math.toRadians(120);
//		System.out.println(res1);
//		
//		double res3 = Math.exp(2.5);
//		System.out.println(res3);
		
//		int[] arr = new int[5];
//		
//		arr = randomArray(arr.length);
//		
//		for(int item: arr) {
//			System.out.print(item + " ");
//		}
		
		
		int[] arr1 = {3,2,1};
		int[] arr2 = {1,2,2,1};
		
		int[] newArr = concatenetedTwoArrays(arr1, arr2);
		for(int item:newArr) {
			System.out.print(item +" ");
		}
		

	}
	
	public static int[] concatenetedTwoArrays( int[] arr1, int[] arr2) {
		int[] newArr = new int[ arr1.length + arr2.length];

		for(int i = 0 ; i < arr1.length; i ++) {
			newArr[i] = arr1[i];
		}
		for(int i = 0;i <arr2.length; i ++) {
			newArr[arr1.length + i] = arr2[i];
		}
		
		return newArr;
	}
	
	
	
	
	// CHAPTER 6EX1
//	public static int getNumPlusOne(int num) {
//		int newNum = 0;
//		int i = 1;
//		while(num != 0) {
//			int digit = (num % 10 + 1) % 10;
//			newNum += digit * i;
//			i *= 10;
//			num /= 10;
//		}
//		return newNum;
//	}

	// CHAPTER 6EX2

//	public static int getTwoNum(int n1, int n2) {
//		int count1 = 0;
//		int count2 = 0;
//		int newNum = 0;
//		int i = 1;
//		int temp = n1;
//		int temp1 = n2;
//		while (temp != 0) {
//			count1++;
//			temp /= 10;
//		}
//		while (temp1 != 0) {
//			count2++;
//			temp1 /= 10;
//		}
//		if (count1 != count2) {
//			return -1;
//		} else {
//			while (n1 != 0) {
//				int digit1 = (n1 % 10);
//				int digit2 = (n2 % 10);
//
//				if (digit1 < digit2) {
//					newNum += digit1 * i;
//					i *= 10;
//				} else {
//					newNum += digit2 * i;
//					i *= 10;
//				}
//				n1 /= 10;
//				n2 /= 10;
//			}
//		}
//		return newNum;
//	}
	//CHAPTER6EX3
	//perfect number
//	public static boolean perfectNum(int n) {
//		int sum = 0;
//		for(int i = 1; i < n; i ++) {
//			if(n % i == 0) {
//				sum += i;
//			}
//		}
//		if(sum == n)
//			return true;
//		else return false;
//	}
	
	//CHAPTER6EX4A
	
//	public static int getSumDigit(int n) {
//		int sum = 0;
//		while(n != 0) {
//			sum = sum + n % 10;
//			n /= 10;
//		}
//		return sum;
//	}
	
	
	//CHAPTER6EX4B
//	public static int findSum10InArray(int[] arr) {
//		int sumDigit10 = 0;
//		for(int i = 0; i < arr.length; i ++) {
//			if(getSumDigit(arr[i] ) == 10) {
//				sumDigit10 ++;
//			}
//		}
//		return sumDigit10;
//	}
	
	
	//CHAPTER 6EX5
	// not finish
//	public static void picRhombus(int num, char c) {
//		int arr[][] = new int[num][];
//		
//	}
	
	
	//CHAPTER 6EX6
	
//	public static boolean isMatrixEqByRawAndColumn(int arr[][]) {
//		for(int i = 0; i < arr.length; i ++) {
//			int sumRows = 0;
//			int sumCol = 0;
//			for(int j = 0; j < arr[i].length; j ++) {
//				 sumCol += arr[i][j];
//				 sumRows += arr[j][i]; 
//			}
//			if(sumCol != sumRows) {
//				 return false;
//			 }	
//		}
// 	return true;
//	}
	
	
	//CHAPTER6EX7
	
//	public static boolean matrixMirrow(int[][] arr,int row, int col) {
//		for( int i = 0; i < row/2 ; i ++) {
//			for(int j = 0; j < col ; j ++) {
//				if(arr[j][i] !=arr[j][row - i -1] ) {
//					return false;		
//				}	
//			}		
//		}	
//		return true;
//	}
	
	
//	public static int[] randomArray(int l) {
//		int[] randomAray = new int[l];
//		
//		for(int i = 0; i < l; i++ ) {
//			randomAray[i] = (int)(Math.random() * 201 -100);
//		}
//		
//		
//		
//		return randomAray;
//	}
	
	
//	public static int[] sumOfArrays(int[] arr1, int[] arr2) {
//		int[] sumArr;
//		if(arr1.length >= arr2.length) {
//			sumArr = new int[arr1.length];
//		}else {
//			sumArr = new int[arr2.length];
//		}
//		int i = 0;
//		while(sumArr[i]  != arr1.length || sumArr[i]  != arr2.length ) {
//			sumArr[i] = arr1[i] + arr2[i];
//			i++;
//		}
//		
//		
//		
//		
//		return sumArr;
//		
//	}
	
	
	
	
	
	
	
	

	
	

}
