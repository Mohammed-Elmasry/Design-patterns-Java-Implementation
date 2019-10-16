import javax.swing.*;
import java.applet.*;
import javax.swing.event.*;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JApplet;
import javax.swing.JList;
import java.util.*;
import java.net.*;

public class SiteSelector extends JApplet{
    //member data declaration

    private HashMap sites;
    private ArrayList siteNames;
    private JList siteChooser;

    public void init(){
        sites = new HashMap < String, URL >();
        siteNames = new ArrayList < String >();

        getSitesFromHTMLParameters();

        //building the gui and lay out components
        add (new JLabel ("Choose a site to browse") , BorderLayout.NORTH);
        siteChooser = new JList(siteNames.toArray());
        //adding ListSelection event Listener
        siteChooser.addListSelectionListener(new ListSelectionListener(){ //anonymous inner class
            @Override
            public void valueChanged(ListSelectionEvent event){
                //object represents site name as string..
                Object object = siteChooser.getSelectedValue();
                URL newDocument = sites.get(object);
                AppletContext browser = getAppletContext(); //get current applet
                //browser.showDocument(newDocument);
            } //end method valueChanged
        });//end inner class
        add(new JScrollPane(siteChooser), BorderLayout.CENTER);
    }//end of init body


    public void getSitesFromHTMLParameters(){  
        String title;
        String location;
        URL url;
        int counter = 0;
        
        //building prime loop is second..
        title = getParameter("title"+ counter); //logically, there's a site name
        location = getParameter("location" + counter); //so logically there's a site URL

        while(title != null){
            try{
                url = new URL(location);
                sites.put(title, url);
                siteNames.add(title);
            } //end try
            catch(MalformedURLException exception){
                exception.printStackTrace();
            } //end catch

            counter++;
            title = getParameter("title"+counter);
        } //end while
    } //end getSitesFromParameter
} //end class SiteSelector