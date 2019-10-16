import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.event.*;

public class ReadServerFile extends JFrame {
    private JTextField enterField;
    private JEditorPane contentsArea;

    //constructor
    public ReadServerFile(){
        super("Simple Web Browser");
        //creating enterField and registering its listener

        enterField = new JTextField("Enter File URL here");
        enterField.addActionListener(event -> getThePage( event.getActionCommand())); //end ActionListener
    
    
    this.add(enterField, BorderLayout.NORTH);
    
    contentsArea = new JEditorPane();
    contentsArea.setEditable(false);
    contentsArea.addHyperlinkListener(new HyperlinkListener(){
        public void hyperlinkUpdate(HyperlinkEvent event){
            if(event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) getThePage(event.getURL().toString());
        } // end method hyperlinkUpdate..
    }); // end call to addHyperlinkListener

    add(new JScrollPane(contentsArea), BorderLayout.CENTER);
    setSize(400,300); // settins size of window
    setVisible(true); //showing the window
    } //end constructor function
    //load document
    private void getThePage(String location){
        try{
            //load document and display location
            contentsArea.setPage(location);
            enterField.setText(location);
        }
        catch(IOException ioe){
            JOptionPane.showMessageDialog(this, "Error retrieving specified URL","Bad URL",JOptionPane.ERROR_MESSAGE);
        } //end catch
    } // end method getThePage
} //end Class ReadFileServer