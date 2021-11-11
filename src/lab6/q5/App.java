package lab6.q5;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements wants to enter?");
		int n = scan.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		if (App.getSecondSmallest(arr) == 0) {
			System.out.println("There is no second smallest element in an array.");
		} else {
			System.out.println("Second smallest element is: " + App.getSecondSmallest(arr));
		}

	}

	public static int getSecondSmallest(int arr[]) {

		Arrays.sort(arr);
		int num = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[0] != arr[i]) {
				num = arr[i];
				break;
			}
		}

		return num;
	}
}
