public class Scratch {
	public static void main(String[] args) {
		
		// **** LITERALS ****
		
		int x = 1000;  // by default, integer literals are of type int
		long y = 2147483648L; // appending an L to a integer literal makes it type long.
		String s = "Hello World!";  //this is a string literal
		double d = 123.45; // by default, floating point literals are of type double
		float f = 123.45f; // appending an f to a floating point literal makes it type float.
		
		int o = 020; // octal literals begin with 0
		int h = 0x20; // hex literals begin with 0x 
		
		// **** ESCAPE SEQUENCES ***
		
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
		
		// VARIABLE SCOPE
		
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
			System.out.println(parentScopeVar)  // I am allowed to reference parentScopeVar because the scope of the if block is within the scope where parentScopeVar is declared
		}
	}
}