package com.Wipro.flowcontrolsatements;

public class Primenumber10to99
{
	public static void main(String[] args) 
	{
		int i,m=0;
		String prime="";
			for(i=10;i<=99;i++) {
				int c=0;
				for(m=i;m>=1;m--) {
					
				if(i%m==0) {
					c=c+1;
				}
				}
				if(c==2) {
					prime=prime+i+" ";
					
					
			}
		}
		
			System.out.println(prime);
	}
	}
		

