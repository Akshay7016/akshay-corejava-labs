package lab1.q3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How much fibonacci sequence you want: ");
		int ans = scan.nextInt();
		
		int f1 = 1;
        int f2 = 1;

        System.out.print(f1+" ");
        System.out.print(f2+" ");

        int f;
        f = f1+f2;
        System.out.print(f+" ");

        int count=3;
        while(count<ans){
            f1=f2;
            f2=f;
            f=f1+f2;
            System.out.print(f+" ");

            count++;
        }
        
        scan.close();
	}

}
