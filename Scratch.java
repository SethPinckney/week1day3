public class Scratch {
	public static void main(String[] args) {
		
		// ******************
		// **** LITERALS ****
		// ******************
		
		int x = 1000;  // by default, integer literals are of type int
		long y = 2147483648L; // appending an L to a integer literal makes it type long.
		String s = "Hello World!";  //this is a string literal
		double d = 123.45; // by default, floating point literals are of type double
		float f = 123.45f; // appending an f to a floating point literal makes it type float.
		
		int o = 020; // octal literals begin with 0
		int h = 0x20; // hex literals begin with 0x 
		
		// *************************
		// **** ESCAPE SEQUENCES ***
		// *************************
		
		// Within a String literal, the backslash acts as an "escape character"
		
		for(int lb = 0; lb < 11; lb++) {
			double kg = lb * 2.2;
			System.out.println(lb+"\t"+kg);  // \t represents the tab character
		}
		
		System.out.println("-------");
		
		float amountPaid = 6.60f;
		float amountOwed = 3 * 2.20f;
		if(amountPaid < amountOwed) {
			System.out.println("Deadbeat!");
		}
		
		System.out.println("-------");
		
		System.out.println("David said: \n\"Java is cool!\"");
		
		System.out.println("-------");
		
		System.out.print("1");
		System.out.print("2");
		System.out.print("3\n\n");
		
		System.out.println("-------");
		
		System.out.println("Greek Omega: \u03A9");
		System.out.println("4 \u00F7 2 = "+(4/2));
		
		System.out.println("-------");
		
		char c = 'a';
		char c2 = '\n';
		System.out.print(c);
		System.out.print(c2);
		System.out.print(c2);
		System.out.print(c);
		System.out.print(c2);
		System.out.print(c2);
		
		// ************************
		// **** VARIABLE SCOPE ****
		// ************************
		
		int myVar = 1;
		//int myVar = 2;  // this causes a compile error because myVar has already been declared
		
		if(true) {
			int myOtherVar = 1;                // myOtherVar is only "visible" within the scope of the surrounding if statement
			System.out.println(myOtherVar);
		}
		
		if(true) {
			int myOtherVar = 2;                // I can declare another variable named myOtherVar because it is outside the scope of the original myOtherVar
			System.out.println(myOtherVar);
		}
		
		// System.out.println(myOtherVar); // this causes a compile error because I am outside of the scope where myOtherVar is declared
		
		int parentScopeVar = 3;
		
		if(true) {
			//int parentScopeVar = 2; // this will cause a compile error because parentScopeVar has already been declared in the parent scope
			System.out.println(parentScopeVar);  // I am allowed to reference parentScopeVar because the scope of the if block is within the scope where parentScopeVar is declared
		}
		
		// *******************************
		// **** SHORTHAND ASSIGNMENTS ****
		// *******************************
		
		for(int ix = 0; ix < 100; ix += 20) {
			System.out.println("ix = "+ix);
		}
		
		x = 10;
		x += 5;  // equivalent to: x = x+5;
		System.out.println("x is "+x);
		
		x -= 7;  // equivalent to: x = x-7;
		System.out.println("x is "+x);
		
		x *= 3;  // equivalent to: x = x*3;
		System.out.println("x is "+x);
		
		// ***************************
		// **** LOGICAL OPERATORS ****
		// ***************************
		
		// The ! operator is a negation operator
		
		if(!true) {							// !true == false								
			System.out.println("!true");
		}
		if(!false) {						// !false == true
			System.out.println("!false");
		}
		
		boolean isAJerk = false;
		if(!isAJerk) {
			System.out.println("Nice to meet you!");
		}
		
		// & represents a logical AND, both sides of the expression must be true for the expression to be true
		
		if(true & false) {							//true & false == false
			System.out.println("true & false");
		}
		
		if(false & false) {							//false & false == false
			System.out.println("false & false");
		}
		
		if(true & true) {							//true & true == true
			System.out.println("true & true");
		}
		
		// the | operator represents a logical OR, either side of the expression must be true for the expression to be true
		
		if(true | false) {							//true | false == true
			System.out.println("true | false");
		}
		
		if(false | false) {							//false | false == false
			System.out.println("false | false");
		}
		
		if(true | true) {							//true | true == true
			System.out.println("true | true");
		}
		
		// the ^ operator represents a logic XOR (exclusive OR), one and only one side of the expression must be true for the expression to be true
		
		if(true ^ false) {							//true ^ false == true
			System.out.println("true ^ false");
		}
		
		if(false ^ false) {							//false ^ false == false
			System.out.println("false ^ false");
		}
		
		if(true ^ true) {							//true ^ true == false
			System.out.println("true ^ true");
		}
		
		System.out.println("-------- Short Circuit Operators ------");
		int biz = 1;
		int buz = 2;
		boolean b = (buz > 2) & (++biz > 1);	// with a regular AND, both sides of the expression are evaluated, therefore biz is incremented
		System.out.println("b is "+b);
		System.out.println("biz is "+biz);
		
		b = (buz > 2) && (++biz > 1);	// with a Short-Circuit AND, the right side of the expression is not evaluated if the left side evaluates to false
		System.out.println("b is "+b);
		System.out.println("biz is "+biz);
		
		// Avoiding a divide by zero error is a practical example of using a Short-Circuit AND that you will likely see in real-world code
		int dividend = 5;
		int divisor = 0;
		/*if(divisor != 0 & dividend / divisor > 2) {     // this causes a divide by zero error
			// do something
		}*/
		if(divisor != 0 && dividend / divisor > 2) {     // this causes a divide by zero error
			// do something
		}
		
		// *****************
		// **** IF ELSE ****
		// *****************
		
		System.out.println("-------- if / else ------");
		
		amountPaid = 6.00f;
		amountOwed = 5.00f;
		if(amountPaid < amountOwed) {
			System.out.println("Deadbeat!");
		} else if(amountPaid > amountOwed) {					//only executes if the preceding if is false
			System.out.println("Thank you very much!");
		} else {												// only executes if the preceding if and else if are both false
			System.out.println("Thank You!");
		}
		
		// *************************
		// **** TYPE CONVERSION ****
		// *************************
		double myDouble = 1.23f;			// float can be assigned to double
		int myInt = 5;
		myDouble = myInt;					// int can be assigned to double
		long myLong = (long)1.99f;			// (long) indicates that we are "casting" 1.99f as type long. when a floating point type is converted to an integer type, any information after the decimal point is truncated.
		System.out.println("myLong is "+myLong);
		myLong = 5 / 2;                             //integer arithmetic truncates information after the decmial point
		System.out.println("myLong is "+myLong);
		myDouble = 5 / 2;							//the value is truncated even when assigning to a floating point type
		System.out.println("myDouble is "+myDouble);
		myDouble = (double)5 / 2;					//by casting 5 as a double, we are no longer doing integer arithmetic so information is not truncated
		System.out.println("myDouble is "+myDouble);
	}
}