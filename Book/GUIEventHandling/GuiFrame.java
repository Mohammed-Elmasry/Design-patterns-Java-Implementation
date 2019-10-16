import java.awt.*;
import java.awt.event.*;
public class GuiFrame extends Frame{
	

	//constructor
	public GuiFrame(String title){
		super(title);
		setBackground(SystemColor.control);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){ //anonymous innerClass
				dispose();
				System.exit(0);
			}
		});
	}
	
	
	//overriding setVisible
	@Override
	public void setVisible(boolean visible){
		if(visible){ //check on visible..
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((d.width - getWidth())/2, (d.height - getHeight())/2);
		}
		super.setVisible(visible); //frame's method -- setVisible..
	}
	
	public static void main(String[] args){
		GuiFrame frame = new GuiFrame("Welcome to Java");
		frame.setSize(400,300);
		frame.setVisible(true);
	}
}