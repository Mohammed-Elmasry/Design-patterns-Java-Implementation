import java.awt.*;
import java.awt.event.*;

public class ActionListenerTest extends GuiFrame implements ActionListener{
	
	Panel controlPanel, whoDoneItPanel, commandPanel;
	MenuBar menuBar;
	Menu menu;
	MenuItem menuItem;
	Button button;
	List list;
	Label whoDoneItLabel, commandLabel;
	TextField whoDoneItTextField, commandTextField, textField;
	
	
	//constructor
	public ActionListenerTest(){
		super("ActionListener test");
		controlPanel = new Panel();
		
		menuBar = new MenuBar();
		menu = new Menu("A Menu");
		menuItem = new MenuItem("A MenuItem",
								new MenuShortcut(KeyEvent.VK_M));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuBar.add(menu);
		setMenuBar(menuBar);
		
		//controlPanel
		controlPanel.add(new Label("A textField: ", Label.RIGHT));
		textField = new TextField(15);
		textField.addActionListener(this);
		controlPanel.add(textField);
		button = new Button("A Button");
		button.setActionCommand("My Action Command");
		button.addActionListener(this);
		controlPanel.add(button);
		controlPanel.add(new Label("A List: ", Label.RIGHT));
		list = new List(5, false);
		list.add("Breakfast");
		list.add("Brunch");
		list.add("Lunch");
		list.add("Snack");
		list.add("Dinner");
		list.add("Dessert");
		list.addActionListener(this);
		controlPanel.add(list);
		
		add(controlPanel, BorderLayout.CENTER);
		
		
		//whoDoneItPanel
		whoDoneItPanel = new Panel();
		whoDoneItPanel.setBackground(Color.PINK);
		whoDoneItLabel = new Label("who done it: ", Label.RIGHT);
		whoDoneItPanel.add(whoDoneItLabel);
		whoDoneItTextField = new TextField(15);
		whoDoneItTextField.setEditable(false); // no one can manipulate it
		whoDoneItPanel.add(whoDoneItTextField);
		
		add(whoDoneItPanel, BorderLayout.NORTH);
		
		//commandPanel
		commandPanel = new Panel();
		commandPanel.setBackground(Color.PINK);
		commandLabel = new Label("Action Command: ", Label.RIGHT);
		commandPanel.add(commandLabel);
		commandTextField = new TextField(15);
		commandTextField.setEditable(false);
		commandPanel.add(commandTextField);
		
		add(commandPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args){
		new ActionListenerTest();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == menuItem){
			whoDoneItTextField.setText("A MenuItem");
		}
		else if(ae.getSource() == textField){
			whoDoneItTextField.setText("A TextField");
		}
		else if(ae.getSource() == button){
			whoDoneItTextField.setText("A Button");
		}
		else if(ae.getSource() == list){
			whoDoneItTextField.setText("A List");
		}
		
		commandTextField.setText(ae.getActionCommand());
	}
}