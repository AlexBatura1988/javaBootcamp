package javabootcamp.basic.hw;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//CHAPTER3EX3
		//check for wedding
//		int check = 0;
//		System.out.println("if you freinds? enter 1 for yes 2 for no");
//		int freinds = scanner.nextInt();
//		if(freinds == 1) {
//			check = 500;
//		}
//		System.out.println("if you relative ? enter 1 for yes 2 for no");
//		int relative = scanner.nextInt();
//		if(relative == 1) {
//			check = 1000;
//		}
//		if(relative == 0 && freinds == 0) {
//			check = 250;
//		}
//		
//		if(relative == 0) {
//			System.out.println("enter years ");
//			int years = scanner.nextInt();
//			if(years > 3) {
//				check += 50;
//			}
//			System.out.println("enter time");
//			int time = scanner.nextInt();
//			if(time > 1) {
//				check -= 50;
//			}
//		}
//		System.out.println ("your check is  " +check);
//		
		
		
		//CHAPTER3EX7
		//final grade of exam
		
//		int grade = 0;
//		int avarage = 0;
//		int numOfEx = 0;
//		int finalGrade = 0;
//		final int EXAM_OVER = 54;
//		final int AVARAGE_PASS = 80;
//		float exWeight = 0;
//		
//		System.out.println("enter grade");
//		grade = scanner.nextInt();
//		System.out.println("enter avarage");
//		avarage = scanner.nextInt();
//		System.out.println("enter number of exercises");
//		numOfEx = scanner.nextInt();
//		switch(numOfEx) {
//		case 5:
//		case 6:
//			if(grade > EXAM_OVER) {
//				exWeight = 0.2f;
//			}
//		break;
//		case 7:
//		case 8:
//			if(grade > EXAM_OVER) {
//				exWeight = 0.3f;
//			}else {
//				if(avarage > AVARAGE_PASS) {
//					exWeight = 0.25f;
//				}else {
//					exWeight = 0.2f;
//				}
//			}	
//		}
//		finalGrade +=(int)(exWeight * avarage);
//		finalGrade +=(int)((1 - exWeight) * grade);
//		System.out.println(finalGrade);
		
		
		
		
		//CHAPTER4EX2
//		int num = scanner.nextInt();
//	    int temp = num; 
		
		
		//CHAPTER4EX4
		//luhn algorithm
		//int num = scanner.nextInt();
//		String id = "78962134";
//		  int sum = 0;
//          boolean alternate = false;
//          for (int i = id.length() - 1; i >= 0; i--)
//          {
//                  int n = Integer.parseInt(id.substring(i, i + 1));
//                  if (alternate)
//                  {
//                          
//                	  n = (n + 1)*2;
//                          if (n > 9)
//                          {
//                                  n = (n % 10) + 1;
//                          }
//                  }
//                  sum += n;
//                  alternate = !alternate;
//          }
//          System.out.println(sum);
//		
		
		
		
		
		
		
		
		
		//CHAPTER5.EX1
		//function check values into 2 arrays,the values of array 1 must be same values of array 2,
		//but in reverse order
		
//		int[] arr1 = new int[5];
//		int[] arr2 = new int[5];
//		System.out.println("enter values to array1");
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i] = scanner.nextInt();
//		}
//		System.out.println("enter values to array2");
//		for(int i = 0; i < arr2.length; i++) {
//			arr2[i] = scanner.nextInt();
//		}
//		for(int i = 0; i < arr1.length / 2; i ++) {
//			if(arr1[i] != arr2[arr2.length -1 -i]) {
//				System.out.println("values is not reverse order");
//				return;
//			}
//		}
//		System.out.println("values in reverse order");
		
		
		//CHAPTER5EX3
		//program get from user two first values of array and fill array 
		// sum of  two values before it
		
//		int[] arr = new int[10];
//		System.out.println("enter two values into array");
//		arr[0] = scanner.nextInt();
//		arr[1] = scanner.nextInt();
//		for(int i = 2; i < arr.length; i++) {
//			arr[i] = arr[i - 1] + arr[i -2];
//		}
//		for(int item : arr) {
//			System.out.print(item + "\t");
//		}
		
		//CHAPTER5EX5
		//check if array 1 is equal to array 2 in one step right
//		int[] arr1 = new int[5];
//		int[] arr2 = new int[5];
//		System.out.println("enter values into array 1");
//		for(int i = 0; i < arr1.length; i ++) {
//			arr1[i] = scanner.nextInt();
//		}
//		System.out.println("enter values into array 2");
//		for(int i = 0; i < arr2.length; i ++) {
//			arr2[i] = scanner.nextInt();
//		}
//		for(int i = 0; i < arr1.length; i++) {
//			int j = (i + 1) % arr1.length;
//			if(arr1[i] != arr2[j]) {
//				System.out.println("false");
//				return;
//			}
//		}
//		System.out.println("true");
		
		
		//CHAPTER5EX7
		//program return duplicate of two sorted arrays
//		int[] arr1 = new int[5];
//		int[] arr2 = new int[5];
//		int[] arr3 = new int[5];
//		System.out.println("enter values into array1");
//			for(int i = 0; i < arr1.length; i++) {
//				arr1[i] = scanner.nextInt();
//			}
//			System.out.println("enter values into array2");
//			for(int i = 0; i < arr2.length; i++) {
//				arr2[i] = scanner.nextInt();
//			}
//			for(int i = 0; i < arr1.length; i ++) {
//	            for(int j = 0; j < arr1.length; j ++) {
//	                 if(arr1[i] == arr2[j]) {
//	                      arr3[i] = arr1[i];
//	                 } else if(arr2[i] < arr1[j]) {
//	                    break;
//	                 }
//	             }    
//	       }
//			int count = 0;
//			for(int item:arr3) {
//				if(item != 0) {
//					
//				System.out.print(item + " ");
//				count ++;
//				}
//				
//			}
//			System.out.println();
//			System.out.println(count);
		
		
		//CHAPTER5EX9
		//program takes two arrays and check if sum of digits is same for each array value
		
//		int[] arr = new int[3];
//		int[] arr1 = new int[3];
//		
//		System.out.println("enter values into array1");
//		for(int i = 0; i < arr1.length; i++) {
//			arr[i] = scanner.nextInt();
//		}
//		System.out.println("enter values into array2");
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i] = scanner.nextInt();
//		}
//		for(int i = 0; i < arr.length; i++) {
//			int temp1 = arr[i];
//			int temp2 = arr1[i];
//			int sum1 = 0;
//			int sum2 = 0;
//			while(temp1 != 0 || temp2 != 0) {
//				sum1 = sum1 + temp1 % 10;
//				sum2 = sum2 + temp2 % 10;
//				temp1/=10;
//				temp2/=10;
//			}
//			if(sum1 != sum2) {
//				System.out.println("not equals");
//				return;
//			}
//			
//		}
//		System.out.println("equals");
		
		
		//CHAPTER5EX11
		//fill matrix 10*10 from input and find max value
//		int[][] arr = new int[10][10];
//		int rows;
//		int cols;
//		int max = 0;
//		System.out.println("enter rows--> ");
//		rows = scanner.nextInt();
//		while(rows > 10 || rows <= 0) {
//			System.out.println("value should be between 1-10, try again ");
//			rows = scanner.nextInt();
//		}
//		System.out.println("enter col--> ");
//		cols = scanner.nextInt();
//		while(cols > 10 || cols <= 0) {
//			System.out.println("value should be between 1-10, try again ");
//			cols = scanner.nextInt();
//		}
//		System.out.println("enter " +rows*cols +" numbers");
//		for(int i = 0; i < rows; i ++) {
//			for(int j = 0; j < cols; j++) {
//				int num = scanner.nextInt();
//				arr[i][j] = num;
//			}
//		}
//		for(int i = 0; i < rows; i++) {
//			for(int j = 0; j < cols; j++) {
//				System.out.print(arr[i][j] +" ");
//			}
//			System.out.println();
//		}
//		for(int i = 0; i < cols; i++ ) {
//			if(arr[i][0] > max) {
//				max = arr[i][0]  ;
//			}
//		}
//		System.out.println("the max is " + max);
		
		
		
		//CHAPTER5EX15
		//check if matrix symmetric
		
//		int[][] arr = new int[4][4];
//		System.out.println("enter " +arr.length*arr.length +" values");
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				int num = scanner.nextInt();
//				arr[i][j] = num;
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] +" ");
//			}
//			System.out.println();
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				if(arr[i][j] != arr[j][i]) {
//					System.out.println("false");
//					return;
//					
//				}
//			}
//			
//		}
//		System.out.println("true");
		
	
	
	}
}
