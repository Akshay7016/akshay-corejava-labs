package lab3.q3;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scan.next();
		System.out.println(App.alterString(str));
		
		scan.close();
	}

	public static String alterString(String str) {

		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < str.length(); i++) {
			char c = sb.charAt(i);
			if (!(c == 'A' || c == 'a' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u'
					|| c == 'E' || c == 'e')) {
				sb.replace(i, i + 1, String.valueOf((char) (c + 1)));
			}
		}
		return sb.toString();
	}
}
