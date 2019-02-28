package com.example.lambda;

public class LambdaUtil {
	public void testAdder(Adder adder) {
		double x = 190.90;
		double y = 8.50;
		double sum = adder.add(x, y);		
		System.out.print("Using an Adder:");
		System.out.println(x + " + " + y + " = " + sum);
	}
	
	public void testJoiner(Joiner joiner) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = joiner.join(s1,s2);		
		System.out.print("Using a Joiner:");
		System.out.println("\"" + s1 + "\" + \"" + s2 + "\" = \"" + s3 + "\"");;
	}


	public static void main(String[] args)  {
		LambdaUtil util = new LambdaUtil();


		// Call the testAdder() method
		util.testAdder((x, y) -> x + y);

//		util.testAdder(new Adder() {
//			@Override
//			public double add(double n1, double n2) {
//				return n1 + n2;
//			}
//		});

//
//		// Call the testJoiner() method
		util.testJoiner((x, y) -> x + y);

		// Call the testJoiner() method. The Joiner will
		// add a space between the two strings
		util.testJoiner((x, y) -> x + " " + y);

		// Call the testJoiner() method. The Joiner will
		// reverse the strings and join resulting strings in
		// reverse order adding a comma in between
		util.testJoiner((x, y) -> {
			StringBuilder sbx = new StringBuilder(x);
			StringBuilder sby = new StringBuilder(y);
			sby.reverse().append(",").append(sbx.reverse());
			return sby.toString();
		});
	}
}
