package lab3.q2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = scan.next();
		System.out.println(App.getImage(str));
	}
	
	
	public static String getImage(String str) {
		String org = str;
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		String rev = sb.toString();
		
		String result = org + "|" + rev;
		return result;
	}
}
