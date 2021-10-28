package lab2.q2;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many strings  want to enter?");
		int n = scan.nextInt();
		
		String str[] = new String[n];
		
		System.out.println("Enter Strings: ");
		for(int i=0;i<n;i++) {
			str[i] = scan.next();
		}
		
		System.out.println("Sorted strings are: ");
		for(String a : App.sortStrings(str)) {
			System.out.print(a+" ");
		}
		
		scan.close();
		
		
	}
	
	public static String[] sortStrings(String[] str) {

		Arrays.sort(str);
		
		return str;
	}
}
