package lab5.q1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age of person: ");
		int age = scan.nextInt();
		
		try {
			if(age<15) {
				throw new AgeLessThan15("Your age is less than 15");
			}
			else {
				System.out.println("Your age is greater than or equal to 15");
			}
		}catch(AgeLessThan15 e) {
			e.getMessage();
		}
	}
}

class AgeLessThan15 extends Exception{
	
	public AgeLessThan15(String str) {
		System.out.println(str);
	}
}
