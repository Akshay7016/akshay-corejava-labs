package lab2.q4;

import java.util.ArrayList;
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
			arr[i]=scan.nextInt();
		}
		
		System.out.print("Elements of an array are: ");
		for(int a:App.modifyArray(arr)) {
			System.out.print(" "+a);
		}
	}
	
	public static int[] modifyArray(int[] arr) {
		Arrays.sort(arr);
	
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				myList.add(arr[i]);
			}
		}
		
		//for last element of an array
		myList.add(arr[arr.length-1]);
		
		int res[] = new int[myList.size()];
		
		//Inserting elements into an array
		for(int i=0;i<myList.size();i++) {
			res[i] = myList.get(i);
		}
		
		return res;
	}
}
