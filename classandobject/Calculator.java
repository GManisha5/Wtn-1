package com.Wipro.classandobject;

public class  Calculator{
	public static void main(String[] args) {
		System.out.println(cal.powerDouble(25.0,9));
		System.out.println(cal.powerInt(25,9));
		
	}
}
	class cal{
		
	
	static double powerInt(int num1,int num2)
	{
		return Math.pow(num1,num2);
	
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	
	}


}

