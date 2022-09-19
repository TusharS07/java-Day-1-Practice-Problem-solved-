package com.bridgelabz.Day1Problems;
import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String:- ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter second String:- ");
		String str2 =  sc.nextLine();
		
		if (str1.equals(str2))
			System.out.println("This two strings are Equal");
		else
			System.out.println("This two strings are not Equal");
	}

}
