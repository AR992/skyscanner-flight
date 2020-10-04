package tutorials.basic;

public class ReferenceAndValueTypes {
	public static void main(String[] args) {
		// byte, short, int, long, float, double, boolean, char
		
		int x = 5;  // value type
		addOneTo(x);
		
		System.out.println(x);
		
		Person john;    // reference type  // we are creating a new person object and assigning john to refer to it
		john = new Person("John");
		john.setAge(20);
		celebrateBirthday(john);  // we are passing that reference to a method, so the method can use that reference to manipulate the object
		
		System.out.println(john.getAge());
		
	}
	
	private static void celebrateBirthday(Person john) {
		john.setAge(john.getAge() + 1);
	}
	
	// manipulate a copy of the value passed
	static void addOneTo(int number) {
		number = number + 1;
	}
}
