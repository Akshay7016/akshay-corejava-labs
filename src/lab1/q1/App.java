package lab1.q1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		App.find(num);
		
		scan.close();
	}
	
	public static void find(int num) {
		int digit;
		int sum=0;
		
		while(num!=0) {
			digit = num%10;
			sum = sum + (digit*digit*digit);
			num=num/10;
		}
		
		System.out.println("Sum of the cubes of the digits is "+sum);
	}

}

