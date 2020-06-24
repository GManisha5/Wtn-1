package com.Wipro.array;

public class ArrayDuplicate {
	public static void main(String[] args) 
	{
		int i,a[]= {12,34,12,45,67,89};
		int j,k;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++) 
			{
			if(a[i]==a[j]) {
				for(k=j;k<a.length-1;k++)
				{
					a[k]=a[k+1];
					a[k]--;
					
				j--;	
				}
					
				}
			}
		}
	
	for(i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	}
}


