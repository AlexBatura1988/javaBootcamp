package javabootcamp.basic.exam;

public class Runner {

//	public static void main(String[] args) {
//		int[] arr1 = { -4 }; //-4
//		int[] arr2 = { -5, 7, 3, 2 };//7
//		int[] concatArr = concatArr(arr1, arr2);
//		for(int item : concatArr) {
//			System.out.print(item + " ");
//		}	
//		//System.out.println(isPalindrome(12112));
//		
//
//	}
	
	public static boolean isPalindrome(int num) {
		int rev = 0;
		int temp = num;
		while(temp != 0) {
			rev = rev*10 + temp % 10;
			temp /= 10;
		}
		return rev == num;
		
		
	}

	public static int[] concatArr(int[] arr1, int[] arr2) {
		int[] newArr;
		int sum1 = sumOfArr(arr1);
		int sum2 = sumOfArr(arr2);
		if (sum1 < sum2) {
			newArr = fillArr(arr1, arr2);
		}else {
		newArr = fillArr(arr2, arr1);
		}
		return newArr;
	}

	public static int[] fillArr(int[] arr1, int[] arr2) {
		int[] arrFill = new int[arr1.length + arr2.length + 2];
		
		for (int i = 0; i < arr1.length; i++) {
			arrFill[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arrFill[i + arr1.length] = arr2[i];
		}
		
		arrFill[arrFill.length - 2] = sumOfArr(arr1) + sumOfArr(arr2);
		arrFill[arrFill.length - 1] = Math.abs(sumOfArr(arr2) - sumOfArr(arr1));
		
		return arrFill;
	}

	public static int sumOfArr(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] constructSumArray(int[] firstArr, int[] secondArr) {
        int[] newArray = new int[firstArr.length + secondArr.length + 2];

        int sumFirstArray = getSumArray(firstArr);
        int sumSecondArray = getSumArray(secondArr);
        int index = 0;

        if (sumFirstArray < sumSecondArray) {
            fillArray(newArray, firstArr, index);
            fillArray(newArray, secondArr, firstArr.length);
        } else {
            fillArray(newArray, secondArr, index);
            fillArray(newArray, firstArr, secondArr.length);
        }

        newArray[newArray.length - 2] = sumFirstArray + sumSecondArray;
        newArray[newArray.length - 1] = getDifferenceArray(firstArr, secondArr);

        return newArray;
    }

    private static void fillArray(int[] arr, int[] otherArr, int index) {
        for (int i = 0; i < otherArr.length; i++, index++) {
            arr[index] = otherArr[i];
        }
    }

    private static int getSumArray(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    private static int getDifferenceArray(int[] firstArr, int[] secondArr) {
        return Math.abs(getSumArray(firstArr) - getSumArray(secondArr));
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] firstArr = {7, 8, -4};
        int[] secondArr = {-5, 7, 3, 2};

        int[] newArray = constructSumArray(firstArr, secondArr);

        printArr(newArray);
    }

}
