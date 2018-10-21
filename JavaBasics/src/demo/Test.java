package demo;

public class Test {
	
	public void day() {
		System.out.println("Today is Sunday");
	}
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		basicCal.add(20, 60);
		Test obj = new Test();
		obj.day();
	}

}
