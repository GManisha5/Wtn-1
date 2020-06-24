package com.Wipro.flowcontrolsatements;

public class Divisible {
	public static void main(String[] args) {
		int i=1;
		int c=0;
		while(i<=50)
		{
			if(i%2!=0 && i%3!=0 && i%5!=0) {
			
			
			System.out.println(i);
			c++;
			
			}
			i++;
		}	 
				System.out.println("the values is"+c);
		
		
		
		
	}

}
