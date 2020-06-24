package com.Wipro.flowcontrolsatements;

public class Reverse {
	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		//int j=Integer.parseInt(args[1]);
		
		while(i!=0) {
			int r=i%10;
			System.out.println(r+ "\t");
			i=i/10;
			
		}
		
	}

}
