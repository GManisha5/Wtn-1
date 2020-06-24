package com.Wipro.flowcontrolsatements;

public class Palindrome {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int i,r=0,t;
		t=n;
		while(n>0) {
			i=n%10;
			r=(r*10)+i;
			n=n/10;
		}
		if(t==r)
		{
			System.out.println(t+" is a palindrome");
		}
		else {
			
				System.out.println(t+"is not a palindrome");
			}
		}
			
		}
	

