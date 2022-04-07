package javabootcamp.basic.exam;

public class Runner {

	public static void main(String[] args) {
		
		int num = 3443;
		System.out.println(isPalindrome(num));
		
		int[] arr1 = {2};
		int[] arr2 = {-5,7,3,2};
		int[] concatArr = concatOfTwoArrays(arr1, arr2);
		for(int item:concatArr) {
			System.out.print(item + " ");
		}
		
		

	}
	
	//EX1 
	// jdk is java development kit for running java platform include JRE;
	// jre is java runtime environment ,minimal realization to run java apps, consists JVM
	// jvm is java virtual machine,jvm allows to programs compiled in  java byte code to run on any machine 
	//that has JVM
	
	//EX2
	// 1 main class loaded into memory to JVM by byte code
	// 2  byte code is checked by byte code verifier
	// 3  byte code inverted to machine code and compile it
	
	//EX3
	//palindrome
	 public static boolean isPalindrome(int x) {
	        int num = x;
	        int rev = 0;
	        while(x > 0){
	            int remainder = x % 10;
	            rev = rev * 10 + remainder;
	            x /= 10;
	        }
	        return rev == num;
	    }
	 
	 //EX4
	 public static int[] concatOfTwoArrays( int[] arr1, int[] arr2) {
		 int[] arr = new int[arr1.length + arr2.length + 2];
		 int sum1 = 0;
		 int sum2 = 0;
		 
		 for(int i = 0; i <arr1.length; i ++) {
			 sum1 += arr1[i];
		 }
		 for(int i = 0; i <arr2.length; i ++) {
			 sum2 += arr2[i];
		 }
		 
		 
		 if(sum1 > sum2) {
			 for(int i=0; i < arr2.length; i ++) {
				 arr[i] = arr2[i];
			 }
			 for(int i = 0; i < arr1.length; i ++) {
				 arr[i + arr2.length] = arr1[i];
			 }
			 
		 }else {
			 for(int i=0; i < arr1.length; i ++) {
				 arr[i] = arr1[i];
			 }
			 for(int i = 0; i < arr2.length; i ++) {
				 arr[i + arr1.length] = arr2[i];
			 }
			 
		 }
		 arr[arr.length -2] = sum1 + sum2;
		 arr[arr.length -1] = Math.abs(sum1 - sum2);
		 
		 return arr;
	 }
	    
	

}
