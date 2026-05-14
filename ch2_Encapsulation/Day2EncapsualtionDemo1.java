package ch2_Encapsulation;

/*
 * Encapsulation: setter and getter method
 *  
 */

class Book {
	private int pageNum;

	void setPageNum(int pgNo) {
		if (pgNo >= 0) {
			pageNum = pgNo;
		} else {
			System.out.println("enter positive number: ");
		}
	}

	int getpageNum() {
		return pageNum;
	}

	void disp() {
		System.out.println("Java and Inheritance is at in page Number " + pageNum);
	}
}

public class Day2EncapsualtionDemo1 {
	public static void main(String[] args) {
		Book b1 = new Book();
		// b1.pageNum = 4;
		b1.setPageNum(4);
		System.out.println(b1.getpageNum());
		b1.disp();
	}
}
