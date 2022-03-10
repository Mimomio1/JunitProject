package com.demo;

import java.util.Iterator;

public class NumberCalculation {
	String temp ="";
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public String convertCase(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			int x = str.charAt(i);
			x=x-32;
			temp=temp+ (char)x;
		}
		
		return temp;
	}
}
