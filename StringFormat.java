package wrapperclass;

import java.util.Scanner;

public class StringFormat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number:");
		int n=sc.nextInt();
		sc.close();
		
		String s=String.format("This is an example of string formatted and number is %d", n);
		System.out.println(s);

	}

}
