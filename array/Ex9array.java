package com.Wipro.array;

public class Ex9array {
public static void main(String[] args) {
	int n[][]=new int[2][2];
	//int a=Integer.parseInt(args[0]);
	//int b=Integer.parseInt(args[1]);
	//int c=Integer.parseInt(args[2]);
	//int d=Integer.parseInt(args[3]);
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			n[i][j]=Integer.parseInt(args[2*i+j]);
		}
	}
	System.out.println("the given array is:");
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.println(n[i][j]+" ");
		}
		System.out.println(" ");
	}
	System.out.println("the reversed array:");
	for(int i=1;i>=0;i--) 
	{
		for(int j=1;j>=0;j--) 
		{
			System.out.println(n[i][j]+" ");
		}
		System.out.println(" ");
		
	}
	
}
}
