package lab3.q4;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scan.nextInt();
		
		System.out.println("New number: "+App.modifyNumber(number));
		
	}
	
	public static int modifyNumber(int number1) {
		
		String str = String.valueOf(number1);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length()-1;i++) {
			int num1 = (int)(str.charAt(i));
			int num2 = (int)(str.charAt(i+1));
			
			sb.append(Math.abs(num1-num2));
		}
		sb.append(str.charAt(str.length()-1));
		String res = sb.toString();
		
		int result = Integer.parseInt(res);
		
		return result;
	}
}
