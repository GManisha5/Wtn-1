package com.Wipro.array;

public class Ex10array {
	public static void main(String[] args) {
		int n[][]=new int[3][3];
		int max=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				n[i][j]=Integer.parseInt(args[3*i+j]);
			}
		}
		System.out.println("the given array is:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(n[i][j]+"");
			}
			System.out.println(" ");
		}
		System.out.println("the reversed array:");
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				if(n[i][j]>max)
					max=n[i][j];
			}
		}
				System.out.println("the biggest number in given array "+max);
			
			
			
		}
		
	
	}



