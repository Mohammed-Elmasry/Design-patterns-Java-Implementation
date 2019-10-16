import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class Server implements Runnable{
    
    try {
        ServerSocket myServerSocket = new ServerSocket(3000,3); //
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }        
    @Override
	public void run() {
        try{
		Socket connection = myServerSocket.accept();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    

    //step #2
    //establish thread for bloacking --> listening for requests
    Thread th = new Thread(this);

    
}