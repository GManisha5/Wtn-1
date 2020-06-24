package com.Wipro.flowcontrolsatements;

public class Sum {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a;
		for(a=0;n!=0;n/=10) {
			a+=n%10;
		}
			
			
			System.out.println("sum is"+a);
		}
		
	}


