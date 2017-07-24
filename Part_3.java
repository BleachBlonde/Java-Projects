package assignment_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Part_3 {
	public static void main(String[] args) {
		double side1 = 0.0, side2 = 0.0, side3 = 0.0, s, heron;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First side: ");
		side1 = scan.nextDouble();
		System.out.print("Second side: ");
		side2 = scan.nextDouble();
		System.out.print("Third side: ");
		side3 = scan.nextDouble();
		s = (0.5)*(side1+side2+side3);
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		heron = Math.pow((s*(s-side1)*(s-side2)*(s-side3)), 0.5);
		System.out.println("Area: " + fmt.format(heron));
		
		scan.close();
	}

}
