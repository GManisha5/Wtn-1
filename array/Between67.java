package com.Wipro.array;

public class Between67 {
	public static void main(String[] args) {
		
		int s=0,p=0,q=0,i;
		int[] a= {1,6,4,7,9};
		for(i=0;i<a.length;i++) {
			if(a[i]==6) {
				 p=i;
				break;
			}
			for(i=0;i<a.length;i++) {
				if(a[i]==7) {
					 q=i;
					break;
				}
				if(p<q) {
					for(i=0;i<p;i++)
					{
						s=s+a[i];
					}
					for(i=q+1;i<a.length;i++) {
						s=s+a[i];
					}
				}
				else {
					for(i=0;i<a.length;i++) {
						s=s+a[i];
					}
				}
				
				
		
	
System.out.println(s);
			
		}

	}
}
}
