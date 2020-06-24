package com.Wipro.flowcontrolsatements;

public class Colorcode {
	public static void main(String[] args) {
		char a=args[0].charAt(0);
		switch(a) {
		case 'R':
			System.out.println("Red");
			break;
			
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
			default:
				System.out.println("invalid code");
		}
	}

}
