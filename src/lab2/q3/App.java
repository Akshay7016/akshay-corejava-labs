package lab2.q3;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements wants to enter?");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Sorted elements are: ");
		for(int a : App.getSorted(arr)) {
			System.out.print(a+" ");
			
			scan.close();
		}
	}
	
	public static int[] getSorted(int[] arr) {
		int n = arr.length;
		
		int rev[] = new int[n];
		
		int i=n-1;
		int j=0;
		
		//Reversing elements of an array
		while(i>=0) {
			rev[j]=arr[i];
			j++;
			i--;
		}
		
		//Sorting new reverse array
		Arrays.sort(rev);
		
		return rev;
	}
}
