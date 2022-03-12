package com.reyaz.qa.stringclass;

public class Pg5
{
	public static void main(String[] args) 
	{
		
	  String s1="reyaz";
	  String s2="Jari";
	 //concatenation
	  // System.out.println(s1+s2);//reyazJari
	 System.out.println(s1+10);//reyaz10
	 System.out.println(s1+10+20);//reyaz1020
	 System.out.println(10+20+s1);//30reyaz
	 System.out.println(10+s1+20);//10reyaz20
	 System.out.println(s1+20/10);//reyaz2
	 System.out.println(s1+20*10);//reyaz200
	 System.out.println(s1+(10-5));//reyaz5
	 System.out.println(s1.concat(s2));//reyazJari
	 System.err.println(String.join(";",s1,s2));//reyaz;Jari
	  }

}
