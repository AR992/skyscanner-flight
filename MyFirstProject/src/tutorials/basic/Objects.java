package tutorials.basic;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		int number = 5;
		
		// create our window
		JFrame window = new JFrame();    // create window variable that holds JFrame objects and we are creating a new JFrame objects
		window.setTitle("My Window");	// we are calling methods on our JFrame objects to configure it	
		window.setSize(800, 600);		
		window.setVisible(true);
		
		JLabel label = new JLabel();	// create label variable that holds JLabel objects and we are creating a new JLabel objects	
		label.setText("My Label");     // we are calling methods on our JLabel objects to set its text property
		
		window.add(label);            // we are calling the add method of our JFrame object to add our label to the window
		
		String  s = "hi";

	}
}
