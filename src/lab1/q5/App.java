package lab1.q5;

import java.util.Scanner;

class Calculate{
	public int calculateSum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%3==0 || i%5==0) {
				sum = sum + i;
			}
		}
		
		return sum;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		Calculate c = new Calculate();
		int res = c.calculateSum(num);
		System.out.println("Sum of natural numbers which are divisible by 3 or 5 is "+res);
		
		scan.close();
	}

}