package com.reyaz.qa.stringclass;

public class Pg7 {
	public static void main(String[] args) {

		String s1 = "This is demo";
		//System.out.println(s1.replace("is","was"));
		//System.out.println(s1.replaceFirst("is", "was"));
		//System.out.println(s1.replaceAll("is", "was"));
	  System.out.println(s1.replaceFirst("is(.)", "was"));//Thwasis demo
	  System.out.println(s1.replaceAll("is(.*)", "was"));

	}

}
