package lab5.q2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = scan.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = scan.nextLine();
		
		try {
			if(firstName.equals("") || lastName.equals("")) {
				throw new FullNameException("Full name should not be blank");
			}
			else {
				System.out.println("Full name: "+firstName+" "+lastName);
			}
		}catch(FullNameException e) {
			e.getMessage();
		}
	}
}

class FullNameException extends Exception{
	public FullNameException(String str) {
		System.out.println(str);
	}
}

