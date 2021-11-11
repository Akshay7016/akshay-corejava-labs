package lab3.q1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = scan.next();
		
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		
		int num = Integer.parseInt(str);
		
		int digit, sum=0;
		
		while(num!=0) {
			digit = num%10;
			sum = sum + digit;
			num = num/10;
		}
		System.out.println();
		System.out.println("Sum: "+sum);
		
		scan.close();
	}
}
