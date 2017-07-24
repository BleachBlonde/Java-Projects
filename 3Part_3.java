package assignment_3;

import java.util.Scanner;

public class Part_3 {
	public static void main(String[] args) {
		String input;
		char compare;
		Scanner scan = new Scanner(System.in);
		int a=0, e=0, i=0, o=0, u=0, other=0;
		
		System.out.print("Enter a string: ");
		input = scan.nextLine().toLowerCase();
		
		for (int x = 0; x < input.length(); x++ ) {
			compare = input.charAt(x);
			switch(compare) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			default:
				other++;
				break;
			}
		}
		
		System.out.println("\nHere's your string broke down\n-----------------------------");
		System.out.println("# of A's: " + a);
		System.out.println("# of E's: " + e);
		System.out.println("# of I's: " + i);
		System.out.println("# of O's: " + o);
		System.out.println("# of U's: " + u);
		System.out.println("# of others's: " + other);
		
		scan.close();
	}
}
