package lab1.q8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		if(App.checkNumber(num)) {
			System.out.println("Number is in powers of two");
		}
		else {
			System.out.println("Number is not in powers of two");
		}
		
		scan.close();
	}
	
	public static boolean checkNumber(int num) {
		boolean value = false;
		for(int i=1;i<=100;i++) {
			if(Math.pow(2, i)==num) {
				value=true;
				break;
			}
		}
		
		return value;
	}

}
