package assignment_2;

import java.util.Scanner;

public class Part_1 {
	public static void main(String[] args) {
		//Computer Username Generator
		Scanner scan = new Scanner(System.in);
		String first, last;
		String userName;
		
		System.out.print("Enter your first name: ");
		first = scan.next();
		System.out.print("Enter your last name: ");
		last = scan.next();
		
		System.out.println("\nWelcome " + first + " " + last + "!"); 
		
		int userNum = (int) (Math.random() * 90) + 10;
		userName = Character.toString(first.charAt(0)) + Character.toString(last.charAt(0)) + Character.toString(last.charAt(1)) + 
				Character.toString(last.charAt(2)) + Character.toString(last.charAt(3)) + Character.toString(last.charAt(4)) +
				Integer.toString(userNum);
		
		System.out.print("Your username is " + userName);
		scan.close();
	}
}
