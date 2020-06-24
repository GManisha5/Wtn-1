package com.Wipro.array;

public class ArraySmallest2numbers {
	public static void main(String[] args) {
		//int size=Integer.parseInt(args[0]);
		int i,temp=0,j;
		int a[]= {10,14,20,57,62,21}; 
		
			for(i=0;i<a.length;i++) {
				for(j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("the largest number"+a[a.length-1]);
			System.out.println("the second largest number"+a[a.length-2]);
			
			System.out.println("the smallest number"+a[0]);
			System.out.println("the second smallest number"+a[1]);
			

			
		}
	}
	


