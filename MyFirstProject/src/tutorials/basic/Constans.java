package tutorials.basic;

public class Constans {
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final Person P1 = new Person("");
	public static final int NUM_ENEMIES = 5;
	
	public static void main(String[] args) {
		
		// constants never change once a value is assigned
		// usualy static
		// constant are upper case
		// declare a constants by using the final modifier
		// constants can be public
		
		System.out.println(WIDTH);
		System.out.println(Math.PI);
	}
}
