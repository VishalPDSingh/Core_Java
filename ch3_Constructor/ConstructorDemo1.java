package ch3_Constructor;

/*
 * Encapsulation is the process of giving controlled access to data member{instance Variable}
 * of a class by making them private and using setter and getter
 * 
 * Process of binding data member and method as a unit
 * 
 * process of providing security to most impotant component of object {data member} by 
 * making it private and giving controlled access through setter and getter
 *  
 *  Encapsulation can be achiveved  using private,getter and setter
 *  
 *  
 */
class Dog {
	private int cost;
	private String nameString;
	private String colourString;

	Dog(int cost, String nameString, String colourString) {
		this.cost = cost;
		this.nameString = nameString;
		this.colourString = colourString;
	}

	Dog() {
		System.out.println("Default Constructor");
		cost = 500;
		nameString = "Monkey";
		colourString = "Pink";
	}

	public int getCost() {
		return cost;
	}

	public String getName() {
		return nameString;
	}

	public String getColour() {
		return colourString;
	}
}

public class ConstructorDemo1 {
	public static void main(String[] args) {

		Dog d1 = new Dog(4, "Tommy", "White");
		System.out.println(d1.getCost());
		System.out.println(d1.getName());
		System.out.println(d1.getColour());
		System.out.println("--------------------------");
		Dog d2 = new Dog();
		System.out.println(d2.getCost());
		System.out.println(d2.getName());
		System.out.println(d2.getColour());
		System.out.println("--------------------------");
		Dog d3 = new Dog();
		System.out.println(d3.getCost());
		System.out.println(d3.getName());
		System.out.println(d3.getColour());
	}
}
