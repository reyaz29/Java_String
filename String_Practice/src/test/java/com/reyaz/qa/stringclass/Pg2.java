package com.reyaz.qa.stringclass;

public class Pg2 {
	public static void main(Pg3[] args) 
	{
		//StringBuffer sb =new StringBuffer("reyaz");
		///sb=sb.append("java");
		//System.out.println(sb);
		//Note: == operator used to address comparison
		String s1=new String("reyaz");
		String s2 = new String("reyaz");
		String s3="Jari";
		String s4="Jari";
		System.out.println(s1==s2);//false
		System.out.println(s3==s4);
		
		
	}

}
