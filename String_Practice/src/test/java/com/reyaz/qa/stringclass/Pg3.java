package com.reyaz.qa.stringclass;

public class Pg3
{
	public static void main(String[] args) 
	{
		
	//String s1="reyaz";
		//String s2="Reyaz";
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equalsIgnoreCase(s2));
		//Note:MUTABLE object will be conver IMMUTABLE.
		//StringBuffer sb = new StringBuffer("reyaz");
		//String s = new String(sb);
		//System.out.println(s);
		//StringBuilder sb = new StringBuilder("jari");
		//String s = new String(sb);
		//System.out.println(s);
		byte[] b= {101,102,103};
		System.out.println(b);//[B@15db9742
		String s = new String(b);
		System.out.println(s);//Here it'll be output-->efg and covert byte into character
		
		
		
	}

}
