import java.awt.*;
import java.awt.event.*;

public class ActionEventSourceTest extends GuiFrame implements ActionListener{
	
	Button button1, button2, button3;
	int count1, count2, count3;
	Label actionSource, click1, click2, click3;
	
	//constructor
	public ActionEventSourceTest(){
		super("ActionEvent source test");
		setLayout(new GridLayout(0,2,5,10));
		actionSource = new Label("Action Source: <No Action>");
		add(actionSource);
		
		button1 = new Button("Button 1");
		button1.addActionListener(this);
		add(button1);
		count1 = 0;
		click1 = new Label("0");
		add(click1);
		
		button2 = new Button("Button 2");
		button2.addActionListener(this);
		
		//set the action command
		button2.setActionCommand("Increment 2");
		add(button2);
		count2 = 0;
		click2 = new Label("0");
		add(click2);
		
		button3 = new Button("Button 3");
		button3.addActionListener(this);
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				click3.setText(String.valueOf(++count3));
			}
		});
		add(button3);
		count3 = 0;
		click3 = new Label("0");
		add(click3);
		
		pack();
		setVisible(true);
	}
	
	
	public static void main(String[] args){
		new ActionEventSourceTest();
	}
	
	@Override
	public void actionPerformed(ActionEvent ae){
		actionSource.setText("action source: " 
		+ ((Button)ae.getSource()).getLabel());
		if(ae.getSource() == button1){
			click1.setText(String.valueOf(++count1));
		} else if(ae.getActionCommand() == "Increment 2"){
			click2.setText(String.valueOf(++count2));
		}
	}

}






