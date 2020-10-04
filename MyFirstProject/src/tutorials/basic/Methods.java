package tutorials.basic;

public class Methods {
	public static void main(String[] args) {
		sayHelloWorld();
		sayHelloWorld();
		
		sayHelloTo ("john");
		sayHelloTo ("joe");
		
		int x = returnFive();		
		System.out.println(x);
		
		int result = square(returnFive());
		System.out.println(result);
	}
	
	// this method both returns a value, and takes in data
	static int square(int x) {
		return x * x;
	}
	
	//this method returns an int type with the value 5
	static int returnFive() {
		return 6;
	}
	
	static void sayHelloTo (String name) {
		System.out.println("Hello, " + name);
	}
	
	static void sayHelloWorld () {
		System.out.println("Hello world!");
	}

}
