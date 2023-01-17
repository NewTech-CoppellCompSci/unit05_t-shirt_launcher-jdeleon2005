package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int num1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int num2 = inKey.nextInt();
		
		System.out.println(num1 + "^" + num2 + " = " + (double) Math.pow(num1, num2));
	}
	
	
	
	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("\nEnter a positive integer: ");
		int num1 = inKey.nextInt();	
		
		System.out.print("The square root of " + num1 + " is " + Math.sqrt(num1));
			
	}
	
	
	
	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("\n\nLength of side A: ");
		int sideA = inKey.nextInt();
		System.out.print("Length of side B: ");
		int sideB = inKey.nextInt();
		
		System.out.print("Hypotenuse = " + (double) Math.sqrt(sideA*sideA+sideB*sideB));
		
	}
	
	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter an integer (Enter 0 to End loop): ");
		int loop = 1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while(loop > 0) {
			int input = inKey.nextInt();
			System.out.print(input);
			
			max = Math.max(max, input);
			min = Math.min(min, input);
			
			if (input == 0) {
				loop = 0;
			}
	}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
	
}
