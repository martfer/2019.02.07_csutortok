package com.example.lambda;

public class LambdaUtilWithOverload {
	public void test(Adder adder) {
		double x = 190.90;
		double y = 8.50;
		double sum = adder.add(x, y);		
		System.out.print("Using an Adder:");
		System.out.println(x + " + " + y + " = " + sum);
	}
	
	public void test(Joiner joiner) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = joiner.join(s1,s2);		
		System.out.print("Using a Joiner:");
		System.out.println("\"" + s1 + "\" + \"" + s2 + "\" = \"" + s3 + "\"");;
	}
	public static void main(String[] args)  {
		LambdaUtilWithOverload util = new LambdaUtilWithOverload();

		// Call the testAdder() method
		util.test((double x, double y) -> x + y);

		// Call the testJoiner() method
		util.test((Joiner)(x, y) -> x + y);


	}

}
