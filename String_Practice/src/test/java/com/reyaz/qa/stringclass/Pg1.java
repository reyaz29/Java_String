package com.reyaz.qa.stringclass;

public class Pg1 {
	public static void main(Pg3[] args) 
	{
		//we can create String in 2 ways
		//1st way is by creating String class Object but in case it will be create 2 objects one will be create in Heap Area and another
		// in SCP
		//String s1 = new String("reyaz");
		//System.out.println(s1);
		//2st ways is by creating String Literal but it will be created in SCP
		//char[] c= {'r','e','y','a','z'};
		//String s1 =new String(c);
		//String name="reyaz";
		//String name1="Reyaz";
		//char s1='a';
		//char s2='A';
		//String s1="a";
		//String s2="A";
		String s1="reyazjava";
		//System.out.println(name.length());//5
		//System.out.println(name.isEmpty());//false
		//System.out.println(name.trim().length());
		//System.out.println(name.equals(name1));//false
		//System.out.println(name.equalsIgnoreCase(name1));//true
		//System.out.println(name.toUpperCase());
		//System.out.println(name1.toLowerCase());
		//System.out.println(s1);
		//System.out.println((int)s1);//97
		//System.out.println((int)s2);//65
		//System.out.println(s1.compareTo(s2));
		//System.out.println(s1.substring(4,8));
		//System.out.println(s1.substring(4).concat("wel").length());
		//System.out.println(s1.replace("r","M"));
		//System.out.println(s1.indexOf("y"));//2
		//System.out.println(s1.lastIndexOf("v"));//7
		System.out.println(s1.contains("w"));
		System.out.println(s1.charAt(2));
		System.out.println(s1.startsWith("r"));
		System.out.println(s1.endsWith("v"));
		
		
		
	}

}
