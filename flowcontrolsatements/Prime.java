package com.Wipro.flowcontrolsatements;

public class Prime {
public static void main(String[] args) {
	int i,m=0,flag=0;
	int n=Integer.parseInt(args[0]);
	m=n/2;
	if(n==1||n==1) {
		System.out.println(n+"is not a prime number");
	}
	else {
		for(i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println(n+"is not a prime number");
				flag=1;
				break;
			}
		}
	}
	if(flag==0) {
		System.out.println(n+"is a prime number");
	}
	
}
}
	
