package ch2_Encapsulation;

/*
 * private
 * this keyword used to difference b/w instance and local variable.
 * this keyword have currently running address of object/instance.
 */

class Learner {
	private int id;
	private String name;
	private String city;

	// setter method to set data
	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	void setCity(String city) {
		this.city = city;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	String getCity() {
		return city;
	}
}

public class Day3EncapsulationDemo2 {
	public static void main(String[] args) {

		Learner l1 = new Learner();
		l1.setId(1);
		System.out.println(l1.getId());
		l1.setName("RAM");
		System.out.println(l1.getName());
		l1.setCity("Patna");
		System.out.println(l1.getCity());
	}
}
