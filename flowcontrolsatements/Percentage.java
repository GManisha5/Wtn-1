package com.Wipro.flowcontrolsatements;

public class Percentage {
	public static void main(String  args[]) 
	{
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(gender.contentEquals("Female"))
		{
			if(age>0&&age<59) {
				System.out.println("the percentage is 8.2%");
			}
			else
			{
				System.out.println("the percentage is 9.2%");
			}
			if(gender.contentEquals("Male")) 
			{
				if(age>0&&age<59)
				{
					System.out.println("the percentage is 8.4%");
				}
				else
				{
					System.out.println("the percentage is 10.5%");
				}
				
			}
		}
		
	}
}
		
