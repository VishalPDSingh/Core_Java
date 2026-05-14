package into_OOPs;

/*
 * Concept: Method Overloading with main() Method
 * ---------------------------------------------
 * In Java, we can overload the main() method just like normal methods.
 * Method overloading means creating multiple methods with the same name
 * but different parameter lists.
 *
 * IMPORTANT:
 * JVM (Java Virtual Machine) will execute ONLY this method:
 *
 *      public static void main(String[] args)
 *
 * because it is the standard entry point of a Java program.
 *
 * Other overloaded main methods are treated as normal methods.
 * They will execute only if we call them explicitly.
 */

public class Day2_MethodOverloadingDeno2 {

	/*
	 * JVM starts execution from this method because it matches the required
	 * signature.
	 */
	public static void main(String[] args) {

		System.out.println("main method with String args");

		// Explicitly calling overloaded main methods
		main(10);

		main(new int[] { 1, 2, 3 });

		main(21, "Vishal");
	}

	/*
	 * Overloaded main method with int parameter
	 */
	public static void main(int args) {
		System.out.println("main method with int args");
	}

	/*
	 * Overloaded main method with int[] parameter
	 */
	public static void main(int[] args) {
		System.out.println("main method with int[] args");
	}

	/*
	 * Overloaded main method with two parameters
	 */
	public static void main(int age, String name) {
		System.out.println("main method with parameter args");
	}
}