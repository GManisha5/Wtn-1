package com.Wipro.array;

public class ArrayAverageandSum {
	public static void main(String[] args) {
		int i,a[]= {1,2,3,4,5};
		int s=0;
		float avg;
		for(i=0;i<a.length;i++) {
			s=s+a[i];
		}
		avg=s/a.length;
		System.out.println("sum:" +s);
		System.out.println("average:" +avg);
		
	}

}
