import java.awt.*;
import java.awt.event.*;

//GuiFrame.class is in the same file/package

public class ButtonEventTest extends GuiFrame implements ActionListener{
	
	//member data 
	int count;
	Button button;
	Label countLabel;
	
	//Constructor
	public ButtonEventTest(){
		super("Button Event Test"); //GuiFrame component
		button = new Button("Button");
		button.addActionListener(this);
		add(button, BorderLayout.CENTER);
		
		count = 0;
		countLabel = new Label();
		updateLabel();
		add(countLabel, BorderLayout.SOUTH);
		
		setSize(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new ButtonEventTest();
	}
	
	@Override
	public void actionPerformed(ActionEvent ae){
		count++;
		updateLabel();
	}
	
	public void updateLabel(){
		String text = "Current Count is: ";
		countLabel.setText(text + String.valueOf(count));
	}
}