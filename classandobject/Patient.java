package com.Wipro.classandobject;

public class Patient {
	String p;
	double h,w;
	
	Patient(double height,double weight)
	{
		
		h=height;
		w=weight;
		
	}
	

double computeBMI() {
	double result;
	result=w/(h*h);
	return result;
	
}

public static void main(String[] args) {
	Patient Patientclass=new Patient(5.6,60.0);
	System.out.println(Patientclass.computeBMI());
	
	
}
}
