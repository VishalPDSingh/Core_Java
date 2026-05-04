package into_OOPs;

import java.util.concurrent.ForkJoinPool;

/*
 * Instance Variable: It is declared inside the class
Memory is allocated inside the heap Area with object
Instance Variable memory is de allocated by Garbage collletion when object becomes refrenceless


Local Variable : Local Variable diectly declare inside the method
memory is allocated in stack area

 
 */

class Calc {
	int num1; // Instance Variable
	int num2; // Instance Variable

	void add() {
		num1 = 10; // Instance Variable
		num2 = 20; // Instance Variable
		int res = num1 + num2;
		System.out.println(res);
	}
}

public class ClassAndObjectDemo2 {
	public static void main(String[] args) {

		Calc c1 = new Calc();
		c1.add();
		
		for(int i=0; i<4; i++)
		{
			System.out.println(i);
		}
		
		
	}
}
