package com.Wipro.array;

public class ArraySearch {
	public static void main(String[] args) {
		int i,a[]= {1,4,34,56,7};
		int s=Integer.parseInt(args[0]);
				int f=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==s) {
				f=1;
				break;
			}
		}
		if(f==1)
			System.out.println(i);
		else
			System.out.println(-1);
	}

}
