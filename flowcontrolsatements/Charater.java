package com.Wipro.flowcontrolsatements;

public class Charater {
	public static void main(String[] args) {
		
		char ch=args[0].charAt(0);
		
		for(int i=0;i<ch;i++)
        {
             ch=args[0].charAt(i);
            if(Character.isUpperCase(ch))
                System.out.print(Character.toLowerCase(ch));
            else
                System.out.print(Character.toUpperCase(ch));
        }
}
}