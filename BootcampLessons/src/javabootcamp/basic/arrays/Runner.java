package javabootcamp.basic.arrays;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int[][] arr ={ 
//				{1,-2,3},
//				{-4,6,9,9},
//				{7},
//			};
			
//			for(int i = 0; i < arr.length; i++) {
//				for(int j = 0; j < arr[i].length; j++) {
//					System.out.print(arr[i][j] +" ");
//				}
//				System.out.println();
//				
//			}
			
//			for(int[] row : arr) {
//				for(int element : row) {
//					System.out.print(element +" ");
//				}
//				System.out.println();
//			}
			
			
//			int[] arr = {5, -1, 2};
//			int[] copyArr = new int[arr.length];
//			for(int i = 0; i < arr.length; i++) {
//				copyArr[i] = arr[i] * arr[i];
//			}
//			for(int item : arr) {
//				System.out.print(item +" ");
//			}
//			System.out.println();
//			
//			for(int item : copyArr) {
//				System.out.print(item +" ");
//			}
		
		
		//ex 5.1
//		int[] arr = {1,2,3,4,5};
//		int[] arr1 = {5,4,3,2,1};
//		
//		for(int i = 0; i < arr.length/2; i ++) {
//			if(arr[i] != arr1[arr1.length -1 -i]) {
//				System.out.println("arr is Not updawn");
//				return;
//			} 
//
//		}
//		System.out.println("arr is updawn");
		
		
		
		
		//ex5.3
//		int[] arr = new int[10];
//		arr[0] = scanner.nextInt();
//		arr[1] = scanner.nextInt();
//		
//		
//		for(int i = 2; i < arr.length; i ++) {
//			arr[i] = arr[i-1] + arr[i - 2];
//		}
//		for(int item: arr) {
//			System.out.print(item +" ");
//		}
		
		
		//ex5.5
//		int[] arr = {9,3,4,6,8};
//		int[] arr1 = {8,9,3,4,6};
//		
//		if(arr[arr.length -1]  != arr1[0]) {
//			System.out.println("false");
//			return;
//		}
//		for(int i = 0; i < arr.length -1; i ++) {
//			if(arr[i] != arr1[i + 1]) {
//				System.out.println("false");
//				return;
//			}
//		}
//		System.out.println("true");	
		
		
		
		
		//ex5.7
//		int arr[] = new int[5];
//		int arr1[] = new int[5];
//		int arr2[] = new int[5];
//		
//		System.out.println("enter nums into array");
//		for(int i = 0; i < arr.length; i ++) {
//			arr[i] = scanner.nextInt();
//		}
//		
//		System.out.println("enter nums into array1");
//		for(int i = 0; i < arr.length; i ++) {
//			arr1[i] = scanner.nextInt();
//		}
//		
//		for(int i = 0; i < arr.length; i ++) {
//            for(int j = 0; j < arr1.length; j ++) {
//                 if(arr[i] == arr1[j]) {
//                      arr2[i] = arr[i];
//                 } else if(arr[i] < arr1[j]) {
//                    break;
//                 }
//             }    
//       }
//		int count = 0;
//		for(int item:arr2) {
//			if(item != 0) {
//				
//			System.out.print(item + " ");
//			count ++;
//			}
//			
//		}
//		System.out.println();
//		System.out.println(count);
//		
		
		
		
		
		//ex5.9
		int[] arr1 = {14,61,227};
		int[] arr2 = {23,43,92};
		
		
		
		
	}

}
