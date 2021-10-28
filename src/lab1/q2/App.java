package lab1.q2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = "y";
		while(ans.equals("y") || ans.equals("Y")) {
			System.out.println("1. RED");
			System.out.println("2. YELLOW");
			System.out.println("3. GREEN");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter choice: ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("STOP");
				break;
			
			case 2:
				System.out.println("READY");
				break;
				
			case 3:
				System.out.println("GO");
				break;
			
			default:
				System.out.println("Wrong choice.....");
			}
			
			System.out.println();
			System.out.println("Do you want to continue(y/n)?");
			ans = scan.next();
		}
		
	}

}