package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int int1 = inKey.nextInt();
		System.out.print("Enter another integer: ");
		int int2 = inKey.nextInt();
		int loop = 100;
		int max = Math.max(int1, int2);
		int min = Math.min(int1, int2);
		for (int i = 100; i > 0;) {
		
		int total = (int)(Math.random()* (max - min+1)+ min);
	    System.out.println(total);
	    i--;
		}
	}


	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("What is the Radius of the Cylinder? ");
		int rad = inKey.nextInt();
		System.out.print("What is the Height of the Cylinder? ");
		int high = inKey.nextInt();
		double base = Math.PI*(rad*rad);
		double vol = base*high;
		
		System.out.print("The volume of the Cylinder is " + vol);
		vol--;
	}


	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
        double num1 = Math.sqrt(10);
        System.out.println("Enter x1");
        int x1 = inKey.nextInt();
        System.out.println("Enter x2");
        int x2 = inKey.nextInt();
        System.out.println("Enter y1");
        int y1 = inKey.nextInt();
        System.out.println("Enter y2");
        int y2 = inKey.nextInt();
        double total = ((x2-x1)-(x2 - x1))+((y2-y1)-(y2 - y1));
        double dist = Math.sqrt(total);
        System.out.println("Distance between points = " + dist);		
		
	}

	
	
	public static void problem4() {
        Scanner inKey = new Scanner(System.in);
        double num1 = Math.sqrt(10);
        System.out.println("Enter x1");
        int x1 = inKey.nextInt();
        System.out.println("Enter x2");
        int x2 = inKey.nextInt();
        System.out.println("Enter y1");
        int y1 = inKey.nextInt();
        System.out.println("Enter y2");
        int y2 = inKey.nextInt();
        double total = ((x2-x1)-(x2 - x1))+((y2-y1)-(y2 - y1));
        double dist = Math.sqrt(total);
        System.out.println("Distance between points = " + dist);
    }
    
    
    public static void problem04() {
        
        double num1 = Math.sqrt(10);
        Scanner inKey = new Scanner(System.in);
        System.out.println("Enter a-value");
        int a = inKey.nextInt();
        System.out.println("Enter b-value");
        int b = inKey.nextInt();
        System.out.println("Enter c-value");
        int c = inKey.nextInt();
        double idk = ((b * b) - (4 *a * c));
        double total1 = (-b + Math.sqrt(idk));
        double total2 = (-b - Math.sqrt(idk));
        double x1 = total1 / (2*a);
        double x2 = total2 / (2*a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }		
		
	



}
