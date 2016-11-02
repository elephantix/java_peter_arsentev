package com.elephantix.javapeterars.calculate;

public class Calculate {

	public static void main(String[] args) {

		int    elem1 = Integer.valueOf(args[0]);
		int    elem2 = Integer.valueOf(args[1]);
		int    sum   = elem1 + elem2;
		int    sub   = elem1 - elem2;
		int    times = elem1 * elem2;
		float  div   = Float.valueOf(elem1) / Float.valueOf(elem2);
		double pow   = Math.pow(Double.valueOf(args[0]), Double.valueOf(args[1]));
		
		System.out.println("Calculate ...");
		System.out.println(elem1 + " + " + elem2 + " = " + sum);
		System.out.println(elem1 + " - " + elem2 + " = " + sub);
		System.out.println(elem1 + " * " + elem2 + " = " + times);
		System.out.println(elem1 + " : " + elem2 + " = " + div);
		System.out.println(elem1 + " ^ " + elem2 + " = " + pow);
		System.out.println("Done !!!");

	}
}
