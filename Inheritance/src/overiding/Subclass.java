package overiding;

public class Subclass extends Base {
	public static void main(String[] args) {
		Subclass s = new Subclass();
	}
	
	public Subclass() {
		sayHello();      // we are calling method defined in Base
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		// super.sayHello();
		
		System.out.println("HI");
	}

}
