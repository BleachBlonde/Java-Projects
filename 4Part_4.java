package assignment_3;

import java.util.Random;

public class Part_4 {
	public static void main(String[] args) {
		final int MAX = 20;
		Random lineGen = new Random();
		int lineNum = 0;

		for (int row=0; row < MAX; row++) {
			int lineWidth = lineGen.nextInt(25)+1;
			
			for (lineNum=0; lineNum < lineWidth; lineNum++) {
				System.out.print("=");
			}
			
			System.out.println();
		}
		
	}
}
