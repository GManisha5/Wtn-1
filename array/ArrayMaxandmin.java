package com.Wipro.array;

public class ArrayMaxandmin {
	public static void main(String[] args) {
		int i,max=0,min=0;
		int a[]= {10,15,20,48,36};
		for(i=0;i<a.length;i++) {
			max=a[0];
			min=a[0];
		}
		for(i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("the maximum element is:"+max);
		System.out.println("the minimum element is:"+min);
		
			
		
	}

}
