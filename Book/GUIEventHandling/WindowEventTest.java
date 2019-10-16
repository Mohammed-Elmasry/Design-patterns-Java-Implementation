import java.awt.*;
import java.awt.event.*;

public class WindowEventTest implements WindowListener{
	
	//constructor
	public WindowEventTest(){
		Frame f = new Frame("WindowEvent test");
		
		f.add(new Label("See command prompt for event log.."));
		f.addWindowListener(this);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args){
		WindowEventTest wet = new WindowEventTest();
		
	}
	
	//overriding WindowListener's Methods
	public void windowActivated(WindowEvent we){
		System.out.println("WindowActivated");
	}
	@Override
	public void windowDeactivated(WindowEvent we){
		System.out.println("WindowDeactivated");
	}
	public void windowClosed(WindowEvent we){
		System.out.println("WindowClosed");
		System.exit(0);
	}
	public void windowClosing(WindowEvent we){
		System.out.println("WindowClosing");
		((Window)we.getSource()).dispose();
	}
	public void windowIconified(WindowEvent we){
		System.out.println("WindowIconified");
	}
	public void windowDeiconified(WindowEvent we){
		System.out.println("WindowDeiconified");
	}
	public void windowOpened(WindowEvent we){
		System.out.println("WindowOpened");
	}
	
}