package com.Wipro.classandobject;

public class Box {
	double w,h,d;
	
	Box(double width,double height,double depth)
	{
		w=width;
		h=height;
		d=depth;
	}
	double volume()
	{
	double v;
	v=h*w*d;
		return v;
		
	}


	public static void main(String args[]) {
		Box Boxclass=new Box(100,100,100);
		
		System.out.println(Boxclass.volume());
	}
}

