package com.Wipro.array;

public class ArraySorted {
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
			for(i=0;i<a.length;i++) {
				System.out.println(a[i]+"");
			}

}
}
