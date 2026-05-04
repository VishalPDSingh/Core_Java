package into_OOPs;

class Student {
	// has part
	String name;
	int age;
	int id;

	void studying() {
		System.out.println("Studnet is styding ");
	}

	void playing() {
		System.out.println("Studnet is plating");
	}
}

public class ClassAndObjectDemo1 {
	public static void main(String[] args) {
		// Object Created
		// Object creation is also called instentied 
		Student st1 = new Student();
		st1.studying();
		st1.playing();
	}
}
