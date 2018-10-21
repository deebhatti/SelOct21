package demo;

public class Calculator {

	public void add(int a, int b) { // a and b are called as Formal Parameters
		System.out.println(a + b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}
	//Adding a new comment in line number 16
	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {

		Calculator basicCal = new Calculator();
		Test obj = new Test();
		obj.day();
		basicCal.add(10, 20); // 10 and 20 are called as Actual Parameters

		basicCal.subtract(100, 10);

		basicCal.multiply(16, 5);
		basicCal.divide(100, 5);

	}

}
