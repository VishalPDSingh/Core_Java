package into_OOPs;

/*
 * Method Overloading: multiple method allowed with the same name.
 * Method overloading refers to creating multiple methods within same name but different parameter
 * java compiler will resolve this at compile time based on the parameters and order of parameter
 * it is called false polymorphism
 * it is also called compile time polymorphism 
 * 
 */

class AdditionCalc {
	int add(int a, int b) {
		return a + b;
	}

	int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	double add(int n1, double n2) {
		return n1 + n2;
	}

	double add(int n1, double n2, double n3) {
		return n1 + n2 + n3;
	}

	double add(Double n1, Double n2) {
		return n1 + n2;
	}

	double add(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}
}

public class Day2_MethodOverlodingDemo1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		double a = 10.4;
		double b = 20.5;
		double c = 30.4;
		AdditionCalc cal1 = new AdditionCalc();

//		int res =  cal1.add(x, y);
//		System.out.println(res);
		System.out.println(cal1.add(x, y));
		System.out.println(cal1.add(x, a, b));
		System.out.println(cal1.add(a, b, c));

	}
}
