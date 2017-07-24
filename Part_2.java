package assignment_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Part_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double pi = Math.PI;
		double radius, volume, surfaceArea;
		
		System.out.print("What is the radius of your sphere? ");
		radius = scan.nextDouble();
		volume = (4/3)*(pi)*(Math.pow(radius, 3));
		surfaceArea = 4*(pi)*(Math.pow(radius, 2));
		DecimalFormat fmt = new DecimalFormat("0.####");
		
		System.out.println("Your volume: " + fmt.format(volume));
		System.out.println("Your surface area: " + fmt.format(surfaceArea));
		
		scan.close();
	}
}
