import javax.swing.JFrame;


public class HelloWorldWindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private void init(){
		setTitle("HelloWorld.java");
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public HelloWorldWindow(){
		init();
	}
}
