package lab1.q4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		for(int i=2;i<=num;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
			
			count=0;
		}
		
		scan.close();

	}

}
