package Programs;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;

		int[] arr = new int[] { 19, 30, 50, 25, 11, 5, 30 };
		// Arrays.sort(arr);
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {

				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;// 19 25
									// 11 25 19 5 30
									// 5 25 19 11 30

					// 5 19 25 11 30
					// 5 11 25 19 30

					// 5 11 19 25 30
					

				}

			}
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			//if(arr[i]!=arr[i+1])  //30 25 19 11 5			{
				System.out.println(arr[i]);
				//break;
			//}
		}
	
	}
}
	


